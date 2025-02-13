[index](../../../../../../README.md)
# Unit of work

Lorsqu'une transaction métier est terminée, toutes les mises à jour sont envoyées sous la forme d'une grande unité de travail qui sera conservée en une seule fois afin de minimiser les allers-retours dans la base de données.

## Exemple concret

Un marchand de pipous dispose d'une base de données contenant des informations sur les pipous.
Les marchands de toute la ville mettent constamment à jour ces informations, ce qui entraîne une charge importante
sur le serveur de la base de données.
Pour rendre la charge plus gérable, nous appliquons le modèle de l'unité de travail pour envoyer de nombreuses petites mises à jour par lots.
<br>
Hibernate implémente UnitOfWork en interne.<br>
C'est-à-dire que toutes les modifications apportées aux entités persistantes à l'intérieur d'une transaction sont automatiquement persistées (sauf si vous avez une transaction avec readOnly = true).