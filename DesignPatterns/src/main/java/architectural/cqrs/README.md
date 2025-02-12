# Command Query Responsibility Segregation

C'est, lorsqu'on a un cluster de DB, séparer la responsabilité de l'écriture et de a lecture.
Toute la difficulté réside dans la consistence des données : 
Il faut que les données écrites soient accessible en lecture. Il faut donc que les différentes datasource soient synchronisées.