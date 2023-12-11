Le modèle de conception des objets actifs dissocie l'exécution et l'invocation des méthodes pour les objets qui résident
chacun dans leur fil de contrôle.
L'objectif est d'introduire la concurrence en utilisant l'invocation asynchrone des méthodes et un planificateur pour
traiter les demandes.

La classe qui met en œuvre le modèle d'objet actif contiendra un mécanisme d'auto-synchronisation sans utiliser de
méthodes "synchronisées".

## Exemple concret

Les orques sont connus pour leur caractère sauvage et leur âme indomptable.
Il semble qu'ils aient leur propre fil de contrôle basé sur leur comportement antérieur.

Pour mettre en œuvre une créature qui possède son propre mécanisme de contrôle et qui n'expose que son API et non
l'exécution elle-même, nous pouvons utiliser le modèle Active Object.