# Gestion des exceptions
Gérer les erreurs et les situations inattendues.
Interrompt le flux normal du programme.

## Trois types : 
- Checked: dans la signature de la méthode ou capturée dans un bloc try-catch
- Unchecked: Héritent de RuntimeException, pas besoin d'êtres déclarées dans la signature ou capturées
- Errors: Accident grave qui n'interrompt pas seulement le flux, mais devrait remettre en question le fonctionnement de l'app

## Try catch
Capturer et gérer les exceptions.
- try contient le code à tester
- catch capture l'exception et la gère
- finally est executé quel que soit le déroulement

## Propagation
Lorsqu'une exception est capturée (dans un catch par exemple), on peut la traiter sur le champ, ou la propager.
Propager signifie "ne pas capturer". 
La propagation s'enchaine jusqu'au bloc "main" tant qu'elle ne trouve pas de bloc "catch".