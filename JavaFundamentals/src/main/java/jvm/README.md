# JVM

## Fonctionnement

### Architecture

#### Composants
##### 1. Chargeur de Classes (Class Loader)

Rôle : Charge les fichiers .class (bytecode) en mémoire.

Fonctionnalités :
- Recherche et charge les classes nécessaires à l'exécution.
- Gère la hiérarchie des chargeurs de classes (bootstrap, extension, et chargeurs applicatifs).
- Assure la résolution des dépendances entre classes.
- Applique des mécanismes de sécurité pour vérifier l'intégrité des classes.

##### 2. Zone Mémoire (Memory Areas)

La JVM gère plusieurs zones mémoire pour exécuter les programmes Java :
- Méthode Area (Method Area) :
  Stocke les métadonnées des classes (structures de classe, constantes, méthodes, etc.).
- Heap (Tas) :
  Zone mémoire où sont stockés les objets créés pendant l'exécution.
  Gérée par le garbage collector pour libérer la mémoire inutilisée.
- Pile (Stack) :
  Chaque thread a sa propre pile, utilisée pour stocker les frames de méthode (variables locales, opérandes, etc.).
- Registres du PC (Program Counter) :
  Contient l'adresse de l'instruction en cours d'exécution pour chaque thread.
- Native Method Stack :
  Utilisée pour les méthodes natives (écrites en C/C++).

##### 3. Moteur d'Exécution (Execution Engine)

Rôle : Exécute le bytecode Java.

Composants :
- Interpréteur : Lit et exécute le bytecode instruction par instruction.
- Compilateur Just-In-Time (JIT) :
  Optimise les parties critiques du bytecode en les compilant en code machine natif pour améliorer les performances.
- Garbage Collector :
  Gère automatiquement la mémoire en libérant les objets qui ne sont plus référencés.
  Différents algorithmes de garbage collection sont disponibles (par exemple, G1, ZGC, Shenandoah).

##### 4. Bibliothèque Native (Native Method Interface - JNI)

Rôle : Permet à Java d'interagir avec du code natif (C/C++).

Fonctionnalités :
- Fournit des interfaces pour appeler des méthodes natives.
- Permet d'intégrer des bibliothèques système ou des fonctionnalités spécifiques à la plateforme.

##### 5. Gestion des Threads

Rôle : Gère l'exécution concurrente des threads Java.

Fonctionnalités :
- Crée et synchronise les threads.
- Gère les états des threads (nouveau, exécutable, bloqué, terminé).
- Assure la communication entre threads.

##### 6. Sécurité

Rôle : Garantit un environnement d'exécution sécurisé.

Fonctionnalités :
- Vérifie le bytecode pour éviter des opérations dangereuses.
- Applique des politiques de sécurité via le Security Manager.
- Gère les permissions d'accès aux ressources système.

##### 7. Gestion des Exceptions

Rôle : Gère les erreurs et les exceptions pendant l'exécution.

Fonctionnalités :
- Détecte et propage les exceptions.
- Fournit des mécanismes pour les attraper et les gérer (blocs try-catch-finally).

##### 8. Optimisations

Rôle : Améliore les performances de l'exécution.

Fonctionnalités :
- Compilation JIT : Convertit le bytecode en code machine natif pour les parties fréquemment exécutées.
- Inline Caching : Optimise les appels de méthodes.
- Loop Unrolling : Optimise les boucles pour réduire les overheads.

##### 9. API et Bibliothèques Standard

La JVM fournit un ensemble de bibliothèques standard pour les opérations courantes (E/S, réseau, collections, etc.).

Ces bibliothèques sont implémentées en Java, mais certaines parties critiques peuvent être écrites en C/C++ pour des raisons de performance.

##### 10. Gestion des Modules (Module System)

Depuis Java 9, la JVM supporte le système de modules (Project Jigsaw).

Rôle : Permet de modulariser les applications et les bibliothèques pour améliorer la maintenabilité et la sécurité.


#### Implémentation de Référence :
L'implémentation de référence de la JVM est fournie par Oracle (anciennement Sun Microsystems) et est écrite en C et C++. Cette implémentation est souvent appelée HotSpot JVM.

#### ClassLoader
Charge les fichiers .class en mémoire
#### Zone de méthode
Stocke les structures de classe, les métadonnées et le code des méthodes
#### Heap (tas)
Espace mémoire où sont tockées les objets et leurs variables d'instance
#### Pile de threads
Chaque thread a sa propre sous-pile pour stocker les variables locales et les résultats partiels (c'est la pile de javap)
#### Registre PC
Stocke l'adresse de l'instruction jvm en cours d'execution pour ce thread
#### Pile de méthodes natives
Contiennent les instructions du code natif.

### Garbage Collection
Detruit les objets inutilisés pour récupérer de la mémoire.
Plusieurs types: SerialGC, Parallel GC, Concurrent Mark Sweep, Garbage First

**Une pause c'est quand la JVM suspend l'exécution de toutes les threads d'application pour effectuer des 
opérations de collecte de déchets**
1. Suspension de tous les threads
2. Marquage des objets vivants
3. Récuperation de la mémoire occupée par les objets morts (sans reference)
4. Reorga de la mémoire pour réduire la fragmentation

#### Serial Garbage Collector (Serial GC)
- Un seul thread pour toutes les opérations
- Ideal pour les petites app, les env a processeur unique
- Simple à implémenter
- Pas compatible avec une faible latence

#### Parallel Garbage Collector (Throughput GC)
- plusieurs threads
- Ideal pour les app avec un débit élevé mais acceptant encore des pauses
- Efficace sur les grand tas en utilisant la parallelisation
- Certaines pauses complètes peuvent etre longues

#### Concurrent Mark-Sweep (CMS) Garbage Collector
- traite en parallèle
- faible latence et tolère une surcharge de CPU
- collecte de manière concurrente
- peut entrainer une fragmentation de la mémoire

#### Garbage-First (G1) Garbage Collector
- divise le tas en régions et traite les plus remplies de déchets en premier
- par défaut
- bon équilibre
- plus complexe à configurer

#### Z Garbage Collector (ZGC)
- faible latence et evolutif
- latence très faible, tas extrèmement grands
- pauses très courtes
- assez récent, et donc peut demander des ajustements

#### Shenandoah Garbage Collector
- faible latence
- pauses courtes et prévisibles
- assez récent, et donc peut demander des ajustements

### Tuning de la JVM
On peut ajuster les pramètres par défaut de la JVM pour répondre aux besoins de l'application. 
(taille du tas, choix du GC, opti des perfs)
- Taille du tas: `-Xms` et -`Xmx`
- Choix du GC: `-XX:+UseG1GC`, `-XX:+UseParallelGC`
- Flags avancés: 
  - `-XX:+PrintGCDetails` pour obtenir des informations détaillées sur les événements de GC 
  - `-XX:+UnlockDiagnosticVMOptions` pour accéder à des options de diagnostic supplémentaires