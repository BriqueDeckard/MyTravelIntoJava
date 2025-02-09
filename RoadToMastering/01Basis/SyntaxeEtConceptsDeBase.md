# Variables : 
[index](../Index.md)
- Un espace de stockage nommé dans l'ordinateur
- Possède un type, un nom et une valeur

```java
int age = 25;
```
L'ordinateur: 
1. Reserve un espace mémoire dans la pile LastInFirstOut pour un `int`
    1. Un int occupe 4 octets de mémoire 
        `0000 0000  0000 0000  0000 0000  0000 0000`
       Soient 4,294,967,296 valeurs possibles
2. Attribue le nom `age` à cet espace mémoire
    1. Le compilateur associe, dans la table des symboles le nom de la variable à son emplacement mémoire.
    `age = 0000 0000  0000 0000  0000 0000  0000 0000`
3. Stocke la valeur `25`dans cet espace mémoire
    1. La JVM s'assure que la valeur de 25 en binaire `0000 0000  0000 0000  0000 0000  0001 1001` est bien stockée dans l'espace mémoire associé à age.
    2. Dans la pile, on a maintenant : `age = 0000 0000  0000 0000  0000 0000  0001 1001`
4. Enregistre l'adresse de cet espace. La JVM gère en interne les adresse mémoires

# Types de données :
[index](../Index.md)

- Il y a les types primitifs :
    - s'écrivent avec une minuscule
    - ne peuvent pas être nulls parce qu'ils ne sont pas des objets, ils ont donc des valeurs par défaut
    - ne possèdent pas de méthodes
    - ne sont pas instanciés
    - stockés directement dans la mémoire de la pile LIFO
    - Ont des tailles fixes en mémoire
- Et les types objets, `wrappers`. Ils permettent d'utiliser les types primitifs comme des objets.
    - `int` devient `Integer`

# Opérateurs :
[index](../Index.md)

- Ce sont des symboles qui permettent d'effectuer des **opérations** sur les variables et leurs valeurs.

## Opérateurs arithmétiques
Utilisés pour effectuer des calculs mathématiques de base.

| Opérateur | Description               | Exemple   |
|-          |-                          |-          |
|+	        |Addition                   |a + b      |
|-	        |Soustraction	            |a - b      |
|*	        |Multiplication	            |a * b      |
|/	        |Division	                |a / b      |
|%	        |Modulo (reste de division)	|a % b      |

## Opérateurs de comparaison
Utilisés pour comparer deux valeurs.

|Opérateur  |Description            |Exemple    |
|-          |-                      |-          |
|==	        |Égal à                 |a == b     |
|!=	        |Différent de           |a != b     |
|>	        |Supérieur à	        |a > b      |
|<	        |Inférieur à	        |a < b      |
|>=	        |Supérieur ou égal à    |a >= b     |
|<=	        |Inférieur ou égal à	|a <= b     |

## Opérateurs logiques
Utilisés pour combiner des expressions booléennes.

|Opérateur	|Description    |Exemple    |
|-          |-              |-          |
|&&         |ET logique	    |a && b     |
|||         |OU logique	    |a || b     |
|!          |NON logique    |!a         |

## Opérateurs d'affectation
Utilisés pour assigner une valeur à une variable.

|Opérateur	|Description	                |Exemple    |
|-          |-                              |-          |
|=	        |Affectation simple	            |a = 10     |
|+=	        |Ajout et affectation	        |a += 5     |
|-=	        |Soustraction et affectation	|a -= 5     |
|*=	        |Multiplication et affectation  |a *= 5     |
|/=	        |Division et affectation        |a /= 5     |
|%=	        |Modulo et affectation	        |a %= 5     |

## Opérateurs d'incrémentation et de décrémentation
Utilisés pour augmenter ou diminuer une valeur de 1.

|Opérateur	|Description	|Exemple    |
|-          |-              |-          |
|++	        |Incrémentation	|a++ ou ++a |
|--	        |Décrémentation	|a-- ou --a |

## Opérateurs bit à bit
Utilisés pour manipuler des bits individuels dans des nombres entiers.

|Opérateur	|Description	                |Exemple    |
|-          |-                              |-          |
|&	        |ET bit à bit	                |a & b      |
||	        |OU bit à bit	                |a | b      |
|^	        |OU exclusif (XOR) bit à bit	|a ^ b      |
|~	        |Complément à un	            |~a         |
|<<	        |Décalage à gauche	            |a << 2     |
|>>	        |Décalage à droite signé	    |a >> 2     |
|>>>	    |Décalage à droite non signé	|a >>> 2    |

## Opérateur ternaire
Un opérateur conditionnel qui permet de choisir entre deux valeurs.

| Opérateur	    | Description           | Exemple   |
|-              |-                      |-|
|? :            |Opérateur ternaire	    | a > b ? a : b |

## Opérateur d'instance de
Utilisé pour vérifier le type d'un objet.

| Opérateur	    | Description	                                                | Exemple               |
| -             |-                                                              |-                      |
| instanceof	|Vérifie si un objet est une instance d'une classe ou interface |obj instanceof String  |


## Promotion de type
Quand on essaie d'appliquer un opérateur à deux variables qui possèdent un type différent, alors la JVM va tenter une promotion de type pour trouver un type commun:
`1:int` + `0.5:float` devient `1.0:float` + `0.5:float`, et donc `1.5:float`

## Table sémantique
Chaque opérateur possède une représentation sémantique que le processeur pourra appliquer.
Ces représentations sont stockées dans la table sémantique.

## Au niveau processeur 
- 1 + 0.5  = 
    - Mémoire: R1, R2, R3
    - R1 = 1.0, R2 = 0.5
    - R3 = ADD(R1, R2)

# Boucles
[index](../Index.md)