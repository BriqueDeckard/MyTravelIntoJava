# Circuit breaker

## Description
Un service intermediaire est placé entre l'appelant et la cible.
Le but de ce service intermediaire est d'observer des conditions dans la cible. 
Dans certains cas (en cas d'instabilité par exemple), le processus de disjonction réachemine le trafic vers un autre service dont la logique permet d'atténuer la situation "dangereuse".

## Pros
- Un bon moyen de se prévenir des accidents et de rendre un système tolerant aux fautes à une échelle assez fine.
## Cons
- Dur à tester
- Pas simple à mettre en place, peut demander une archi de gestion de l'infra