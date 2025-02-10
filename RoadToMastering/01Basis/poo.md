# POO

## Classe
Une classe est l'abstraction d'un objet pour le représenter sous forme d'un model "simplifié" par rapport à la réalité, 
qui ne représente que ses attributs et ses comportements significatifs.
Dispose d'attributes (ses valeurs), de méthodes (comportements) et d'un ou plusieurs constructeurs (initialisation)

## Objet
Un objet est une instance d'une classe. C'est la représentation concrète d'une entité.

## Héritage
L'héritage désigne la propriété d'une classe à obtenir ou transmettre ses attributs depuis une classe "mère" ou 
à une classe "fille".
Le byte code généré pour la classe fille ne contient pas les méthodes ni les attributs de la classe mère, mais la jvm 
sait quand elle doit appeler une méthode de la classe mère.

## Surcharge
Le byte code contient les méthodes surchargées.

## Polymorphisme
Permet d'utiliser une classe dérivée là ou une classe de base est attendue : 
Ex. ClasseMere classeMereFille = new ClasseFille();
Ex. Interface classeImpl = new ClasseImpl();

## Encapsulation
C'est enfermer le code source dans une "capsule", la classe, qui permet l'aggrégation et le contrôle des données et des comportements.
Ses avantages sont la modularité et la réutilisabilité.

## Abstraction:
C'est simplifier la complexité d'un objet pour n'en garder que les attributs et les comportements essentiels, 
que l'on va modeliser sans se préocupper des détails de l'implémentation.  