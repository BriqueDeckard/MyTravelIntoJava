Définir une fabrique de contenu immuable avec des interfaces de construction et de 
fabrication séparées.

**Factory kit est un constructeur d'objets configurables, une usine pour créer des usines.**

Le design pattern "Factory Kit" est une variation de l'approche Factory Method. Le concept principal de ce pattern 
est de créer une usine pour construire des objets. 
Il permet la création d'instances d'objets selon un ensemble de règles prédéfinies.

Dans ce pattern, une fabrique (factory) est utilisée pour créer des instances de types différents, souvent en 
utilisant un identifiant ou un type spécifique pour déterminer quelle instance doit être retournée. 
Cette approche offre une manière souple et extensible de générer des objets en encapsulant la logique de création.

Cela peut être utile dans des cas où vous avez plusieurs implémentations d'une interface ou d'une classe abstraite 
et où vous ne connaissez pas à l'avance le type exact d'objet à instancier, mais vous souhaitez laisser la logique 
de création flexible et dépendante des circonstances.

Le design pattern "Factory Kit" est un motif de conception qui offre une approche flexible pour la création d'objets 
en utilisant une fabrique paramétrée. Voici trois avantages et inconvénients associés à ce pattern :

### Avantages du pattern "Factory Kit" :
1. **Flexibilité paramétrée** : Il permet de créer des objets en utilisant des paramètres flexibles, ce qui offre  
   une grande adaptabilité.
2. **Abstraction** : Il utilise des interfaces pour définir les différents types de fabricants, offrant ainsi une  
   abstraction entre la création d'objets et leur utilisation.
3. **Personnalisation des instances** : Il permet de créer des instances personnalisées en manipulant les paramètres 
   fournis à la fabrique.

### Inconvénients du pattern "Factory Kit" :
1. **Complexité accrue** : La gestion des multiples paramètres et options peut rendre le code complexe, surtout  
   lorsque la logique de création devient sophistiquée.
2. **Surcharge de responsabilité** : Si la logique de fabrication devient trop complexe, la classe de la fabrique  
   peut devenir surchargée de responsabilités.
3. **Surutilisation** : Une utilisation excessive du pattern peut compliquer la maintenance et la compréhension  du 
   code, surtout lorsque les interactions entre différentes fabriques deviennent compliquées.

Il est important de noter que chaque motif de conception a ses avantages et inconvénients, et leur utilisation  doit 
être évaluée en fonction du contexte spécifique du projet pour en tirer le meilleur parti.