# SpringSecurity

## Principes

### Résumé
Spring fait passer les requêtes dans : 
- un pare-feu http
- un proxy
- des filtres

### Le pare-feu
Bloque toutes les requêtes suspectes

### Le proxy (DelegatingFilterProxy)
Autorité exterieure qui gère les accès.
Elle prend en charge les requêtes qui ont passé le pare-feu et les envoie aux filtres

### Authent et autho
SpringSecurity gère 
- l'authent (vérif de l'identité de l'utilisateur)
- l'autorisation (droits d'accès)

### Security Filter Chain
Une chaine de filtre qui intercepte les appels HTTP pour appliquer des règles de sécurité au travers de filtres.

### UserDetailsService
L'interface pour récupérer des info sur les utilsateur a partir de la DB.

### BCryptPasswordEncoder
Utilisé pour encoder les mots de passe de manière sécurisée.

### OAuth2 et JWT
Spring Security prend en charge l'authent via OAuth2.

### Conf par défaut
```
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Content-Type-Options: nosniff
Strict-Transport-Security: max-age=31536000 ; includeSubDomains
X-Frame-Options: DENY
X-XSS-Protection: 1; mode=block
```

#### Cache-Control
Empêche la sauvegarde d'une copie cachée
#### Content-type
nosniff: un utilisateur malveillant ne peut pas deviner le type de requête
