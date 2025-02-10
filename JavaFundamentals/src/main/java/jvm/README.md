# JVM

## Fonctionnement

### Architecture

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