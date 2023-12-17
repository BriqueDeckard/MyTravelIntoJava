Dans cet exemple, nous avons des classes abstraites DependentObject (ObjetDépendant) et CoarseGrainedObject
(ObjetGlobal).
La classe ConsoleCoarseGrainedObject (ObjetConsoleGlobal) est une entité composite spécialisée qui hérite de la
classe de base.

DependentObject représente un objet dépendant avec des données de type générique (T).
Il a des méthodes pour définir et récupérer les données (setData et getData).

CoarseGrainedObject est un objet global qui contient un tableau d'objets dépendants. Il a des méthodes pour définir
et récupérer des données pour tous les objets dépendants qu'il contient.

ConsoleCoarseGrainedObject est une entité composite spécifique qui hérite de CoarseGrainedObject et représente une
console.
Elle contient des objets dépendants spécifiques (MessageDependentObject et SignalDependentObject) et a des
méthodes pour initialiser et obtenir les données de ces objets.

CompositeEntity est la classe principale qui utilise l'entité composite pour gérer les objets de message et de
signal de la console.
Elle permet de définir et d'obtenir des données pour la console.