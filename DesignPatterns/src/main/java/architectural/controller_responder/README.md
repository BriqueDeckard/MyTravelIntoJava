# Controller-responder

## Resume

Aussi appelé master/slave.<br>
Deux composants : 
- le controller : Le contrôleur répartit les données d'entrée ou le travail entre des composants de réponse identiques et génère un résultat composite à partir des résultats générés par chaque répondant.
- le responder : chargé de prendre les données fournies par le Controller et de formater la réponse en fonction du contexte. Cela inclut souvent la gestion du format de la réponse, comme du HTML, JSON, XML, etc., selon la nature de la demande et de la réponse attendue. Dans une application web, le Responder pourrait être responsable de la génération de la vue ou de la structuration des données à envoyer sous forme d'une réponse HTTP.