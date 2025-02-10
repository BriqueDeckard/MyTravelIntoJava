# I/O

## Flux
Les flux sont utilisés pour lire et écrire les données.
Deux types : 
- Flux de bytes: input et output streams, pour écrire et lire du binaire.
- Flux de caractères: Reader et Writer, pour lire et écrire du texte

Il faut absolument fermer les flux une fois qu'on les a utilisés (br.close()/dispose() ou try-with-resource)
Faire attention à l'encodage.

## Classes de base
- Fichiers binaires: FileInputStream et FileOutputStream
- Fichiers textes: FileReader/FileWriter
- Avec tampon: BufferedReader et BufferedWriter

## Points d'attention:
- Utiliser les buffer pour la perf
- Bien valider les chemins de fichier, et gérer les permissions d'accès
- Attention aux séparateurs