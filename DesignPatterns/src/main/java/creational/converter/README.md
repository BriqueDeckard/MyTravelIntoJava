L'objectif du modèle de convertisseur est de fournir un moyen générique et commun
de conversion bidirectionnelle entre des types correspondants, permettant une mise
en œuvre propre dans laquelle les types n'ont pas besoin d'être informés l'un de l'autre.
En outre, le modèle de convertisseur introduit le mappage bidirectionnel des collections,
ce qui réduit au minimum le code de base.

## Utilisez le modèle de conversion dans les situations suivantes :

- Lorsque vous avez des types qui correspondent logiquement les uns aux autres et que vous devez convertir des
  entités entre eux.
- Lorsque vous souhaitez proposer différentes manières de convertir les types en fonction du contexte.
- Lorsque vous introduisez un objet de transfert de données (DTO), vous devrez probablement le convertir en
  équivalence de domaine.

## Avantages :

### Personnalisation du mapping :

    Les convertisseurs personnalisés permettent de définir des règles spécifiques pour 
    la transformation des données, offrant ainsi un contrôle fin sur le processus de mapping.

### Flexibilité et adaptation :

    Ils permettent d'adapter des types de données spécifiques ou de gérer des cas de 
    conversion complexes qui ne sont pas pris en charge par des méthodes de mapping standard.

### Réutilisabilité :

    Une fois créés, les convertisseurs peuvent être réutilisés dans différentes parties 
    de votre application pour effectuer des conversions similaires entre les types de données.

## Inconvénients :

### Complexité accrue :

    La création de convertisseurs personnalisés peut ajouter de la complexité au 
    code, surtout pour des opérations de mapping simples ou pour des applications ne nécessitant pas de conversions personnalisées.

### Maintenance :

    La gestion de multiples convertisseurs personnalisés peut nécessiter une maintenance régulière, 
    surtout en cas de modifications fréquentes dans la structure des données.

### Surcharge cognitive :

    L'abus de convertisseurs personnalisés peut rendre le code moins lisible et plus difficile à 
    comprendre pour d'autres développeurs, en particulier s'ils ne sont pas bien documentés.