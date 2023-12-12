Fournir une instance de service d'assistance à un client et décharger une fonctionnalité 
commune d'une ressource partagée.

Explication
Exemple concret

Un service distant a de nombreux clients qui accèdent à une fonction qu'il fournit. 
Le service est une application ancienne et il est impossible à mettre à jour. 
Le grand nombre de demandes émanant des utilisateurs entraîne des problèmes de connectivité. 
De nouvelles règles relatives à la fréquence des requêtes doivent être mises en œuvre, ainsi que des 
contrôles de latence et une journalisation côté client.

In plain words

Avec le modèle Ambassador, nous pouvons mettre en œuvre des interrogations moins fréquentes de la
part des clients, ainsi que des contrôles de latence et une journalisation.

La documentation de Microsoft indique que

Un service ambassadeur peut être considéré comme un mandataire hors processus qui se trouve au même 
endroit que le client.
Ce modèle peut être utile pour décharger les tâches courantes de connectivité client telles que 
la surveillance, la journalisation, le routage, la sécurité (comme TLS) et les modèles de résilience 
d'une manière indépendante du langage.
Il est souvent utilisé avec des applications anciennes ou d'autres applications difficiles à 
modifier, afin d'étendre leurs capacités de mise en réseau.
Il peut également permettre à une équipe spécialisée de mettre en œuvre ces fonctionnalités.
