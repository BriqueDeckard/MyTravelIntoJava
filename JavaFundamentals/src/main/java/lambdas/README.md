
# Lambdas
## Syntaxe des lambdas : 
`(x) -> x.toString()`
Simple, concise pour remplacer les fonctions anonymes.

## Interfaces fonctionnelles : 
- Consumer: accepte un argument et ne retourne rien.
- Function:  accepte un argument et retourne quelque chose.
- Predicate: accepte un argument et retourne un booleen

## Stream API : 
Utilisation des lambdas pour effectuer des opérations sur les collections de manière fluide et fonctionnelle.

## Traitement de données avec map(), filter(), forEach() : 
Le trio de base pour manipuler des flux de données.

```java
    class Stream01 {
        public static void main(String[] args) {
            Arrays.stream(maListe)
                    .map(x -> (int) x)
                    .filter(x -> x > 10)
                    .foreach(x -> System.out.println("x: " + x));
        }
    }
```

Transactions et Optional : Utilisation avec des entités Spring pour améliorer la lisibilité du code.
Tri avec Comparator : Pour trier des objets avec une syntaxe concise.
Evénements et @EventListener : Utiliser des lambdas pour rendre la gestion des événements plus propre et réactive.