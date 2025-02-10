# Data Structures

## Array
Structure de donnée la plus élémentaire. Taille fixe, type homogène.
`+` : Accès rapide par index, utilisation mémoire efficace.
`-` : Taille fixe, cout insertion/suppression.
Usage: quand taille connue.

## ArrayList
Liste dynamique fondée sur le tableau. Taille dynamique. Type homogène. Accès par index.
`+` : Accès rapide par index. Taille dynamique.
`-` : Cout élevé pour insert/delete au milieu
Usage: taille change fréquemment

## LinkedList
Liste chaînée ou chaque élement pointe vers le suivant.
`+` : insert/delete efficaces
`-` : Accès lent par index, mémoire élevée.
Usage: insert/delete fréquents

## Hashmap
Collection clé/valeur.
`+`: Accès par clé rapide, taille dynamique
`-`: pas d'ordre. Collisions des clefs.
Usage: association clé-valeur

## HashSet
Collection avec unicité.
`+`: Unicité + rapidité
`-`: Pas d'ordre, pas d'index.
Usage: Stockage d'éléments uniques.

## Stack
Pile LIFO
`+`: Operation de pile rapide. Simple.
`-`: Accès seulement au sommet
Usage: Algo de pile -> parcours en profondeur.

## Queue
File FIFO
`+`: Operation de file rapide. Simple.
`-`: Accès seulement début/fin
Usage: Algo de file -> parcours en largeur.