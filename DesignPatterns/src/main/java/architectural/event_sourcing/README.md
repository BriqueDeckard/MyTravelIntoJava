# Event SOurcing
Le pattern architectural "Event Sourcing" est une approche qui consiste à stocker tous les événements qui modifient l'état d'un système plutôt que de stocker simplement l'état actuel. En termes simples, au lieu de sauvegarder l'état final d'un objet ou d'une entité dans une base de données, vous enregistrez chaque action ou événement qui a conduit à cet état. Cela permet de reconstruire l'état à tout moment en rejouant les événements dans l'ordre où ils se sont produits.

Exemple :
    Liquibase agit comme un pattern d'event sourcing avec la base de donnée.

En résumé :
- Event Sourcing est une manière de concevoir des systèmes où l'état est dérivé d'une série d'événements plutôt que stocké directement.
- Chaque action qui modifie l'état d'un objet est un événement, et ces événements sont enregistrés dans un journal (souvent appelé Event Store).
- Vous pouvez reconstruire l'état d'un objet en rejouant tous les événements dans l'ordre.
- Ce modèle est utile pour la traçabilité, l'audit, et la flexibilité, mais il peut entraîner des défis de gestion du volume d'événements et de performance.