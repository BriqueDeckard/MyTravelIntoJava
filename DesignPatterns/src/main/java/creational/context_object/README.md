## Propos

Découpler les données des classes spécifiques au protocole et stocker les données 
dans un objet indépendant de la technologie de protocole sous-jacente.

## Exemple concret

Cette application comporte différentes couches étiquetées A, B et C, chacune extrayant
des informations spécifiques d'un contexte similaire en vue de leur utilisation 
ultérieure dans le logiciel. 
Il serait inefficace de transmettre chaque information individuellement. 
Il faut donc trouver une méthode pour stocker et transmettre efficacement les informations.

## En clair

Créer un objet et y stocker les données, puis transmettre cet objet à l'endroit 
où il est nécessaire.
