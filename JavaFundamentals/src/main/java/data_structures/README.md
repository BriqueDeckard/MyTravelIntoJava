# Data Structures

## Array
Structure de donnée la plus élémentaire. Taille fixe, type homogène.

`+` : Accès rapide par index, utilisation mémoire efficace.<br>
`-` : Taille fixe, cout insertion/suppression.<br>
Usage: quand taille connue.

## ArrayList
Liste dynamique fondée sur le tableau. Taille dynamique. Type homogène. Accès par index.

`+` : Accès rapide par index. Taille dynamique.<br>
`-` : Cout élevé pour insert/delete au milieu<br>
Usage: taille change fréquemment

## LinkedList
Liste chaînée ou chaque élement pointe vers le suivant.

`+` : insert/delete efficaces<br>
`-` : Accès lent par index, mémoire élevée.<br>
Usage: insert/delete fréquents

## Hashmap
Collection clé/valeur.

`+`: Accès par clé rapide, taille dynamique<br>
`-`: pas d'ordre. Collisions des clefs.<br>
Usage: association clé-valeur

## HashSet
Collection avec unicité.

`+`: Unicité + rapidité
`-`: Pas d'ordre, pas d'index.<br>
Usage: Stockage d'éléments uniques.<br>

## Stack
Pile LIFO

`+`: Operation de pile rapide. Simple.<br>
`-`: Accès seulement au sommet<br>
Usage: Algo de pile -> parcours en profondeur.

## Queue
File FIFO

`+`: Operation de file rapide. Simple.<br>
`-`: Accès seulement début/fin<br>
Usage: Algo de file -> parcours en largeur.
