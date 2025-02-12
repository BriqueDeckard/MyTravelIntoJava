# Streams

## Resume
Un stream est la version "flux" d'une collection ou d'un tableau. 
Elle permet de traiter les éléments de manière déclarative.
Les opérations sont "Lazy", et elles n'ont lieu que l'orsqu'on demande **réellement** le résultat.

## Differentes opérations

### Lazy
- filter() permet de filtrer les éléments selons une condition.
- Map() permet d'appliquer une fonction ou des opérations à chaque élément
- flatMap() permet de transformer les éléments en stream.

### Eager
- collect() permet de collecter les résultats dans une autre sytructure
- foreach() permet d'appliquer des actions à chaque élément du stream
- reduce() permet de réduire le stream en un seul résultat.

### Opérations sur les flux de données
- distinct() supprime les doublons
- sorted() trie
- limit() limite
- skip() permet de sauter les premiers éléments d'un flux