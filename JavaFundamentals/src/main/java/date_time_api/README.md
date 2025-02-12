# DateTime

### Résumé des 20% essentiels des **datetime** en Java :
1. **Classes principales** : `LocalDate`, `LocalTime`, `LocalDateTime`, `ZonedDateTime`.
2. **Formatage et parsing** : Utilisation de `DateTimeFormatter` pour convertir entre `String` et `Date`.
3. **Manipulation de dates** : `plus()`, `minus()` pour ajouter ou soustraire du temps.
4. **Comparaison de dates** : Méthodes `isBefore()`, `isAfter()`, et `isEqual()`.
5. **Différence entre dates** : Utilisation de `ChronoUnit` pour obtenir des différences en unités de temps.
6. **`Duration` et `Period`** : Pour mesurer les intervalles de temps.
7. **Fuseaux horaires** : Utilisation de `ZonedDateTime` et `ZoneId` pour gérer les dates avec fuseaux horaires.
8. **Conversion avec `java.util.Date`** : Conversion entre les anciennes et nouvelles API de date.
---

### 1. **Les classes principales : `LocalDate`, `LocalTime`, `LocalDateTime`, `ZonedDateTime`**

Java 8 a introduit une nouvelle API date-time dans le package `java.time`. Voici les classes les plus importantes à connaître :

- **`LocalDate`** : Représente une date sans heure, comme "2025-02-12".
  ```java
  LocalDate today = LocalDate.now();  // Date actuelle
  LocalDate specificDate = LocalDate.of(2025, 2, 12);  // Date spécifique
  ```

- **`LocalTime`** : Représente une heure sans date, comme "14:30:00".
  ```java
  LocalTime now = LocalTime.now();  // Heure actuelle
  LocalTime specificTime = LocalTime.of(14, 30);  // Heure spécifique
  ```

- **`LocalDateTime`** : Combine une date et une heure sans information de fuseau horaire.
  ```java
  LocalDateTime dateTimeNow = LocalDateTime.now();  // Date et heure actuelles
  LocalDateTime specificDateTime = LocalDateTime.of(2025, 2, 12, 14, 30);  // Date et heure spécifiques
  ```

- **`ZonedDateTime`** : Représente une date et une heure avec un fuseau horaire spécifique.
  ```java
  ZonedDateTime zonedDateTime = ZonedDateTime.now();  // Date et heure avec fuseau horaire
  ```

### 2. **Formatage et parsing avec `DateTimeFormatter`**

Le **formatage** et le **parsing** des dates sont des opérations courantes. `DateTimeFormatter` permet de transformer des objets `LocalDate`, `LocalTime`, `LocalDateTime`, ou `ZonedDateTime` en chaînes de caractères, et vice versa.

- **Formatage** :
  ```java
  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
  String formattedDate = LocalDateTime.now().format(formatter);
  System.out.println(formattedDate);  // Exemple : "2025-02-12 14:30:00"
  ```

- **Parsing** (convertir une chaîne en date) :
  ```java
  String dateString = "2025-02-12 14:30:00";
  LocalDateTime parsedDate = LocalDateTime.parse(dateString, formatter);
  System.out.println(parsedDate);  // Exemple : "2025-02-12T14:30:00"
  ```

### 3. **Manipulation de dates : `plus()`, `minus()`**

Les classes `LocalDate`, `LocalTime`, `LocalDateTime`, et `ZonedDateTime` permettent de manipuler les dates en ajoutant ou en soustrayant des périodes de temps.

- **Ajouter des jours, mois, années, heures, minutes, etc.** :
  ```java
  LocalDate tomorrow = LocalDate.now().plusDays(1);  // Ajouter 1 jour
  LocalDate nextMonth = LocalDate.now().plusMonths(1);  // Ajouter 1 mois
  ```

- **Soustraire des jours, mois, années, heures, minutes, etc.** :
  ```java
  LocalDate yesterday = LocalDate.now().minusDays(1);  // Soustraire 1 jour
  LocalDateTime oneHourAgo = LocalDateTime.now().minusHours(1);  // Soustraire 1 heure
  ```

### 4. **Comparaison de dates**

Comparer des dates est une opération courante. Les classes comme `LocalDate`, `LocalTime`, `LocalDateTime`, et `ZonedDateTime` offrent des méthodes pour cela.

- **Comparer les dates** :
  ```java
  LocalDate today = LocalDate.now();
  LocalDate tomorrow = today.plusDays(1);
  System.out.println(today.isBefore(tomorrow));  // true
  System.out.println(today.isAfter(tomorrow));  // false
  System.out.println(today.isEqual(tomorrow));  // false
  ```

### 5. **Différence entre dates : `ChronoUnit`**

Si vous avez besoin de calculer la différence entre deux dates, vous pouvez utiliser la classe `ChronoUnit` qui offre une manière simple de calculer les différences en unités de temps (jours, mois, années, etc.).

- **Différence en jours, mois, années, etc.** :
  ```java
  LocalDate startDate = LocalDate.of(2025, 2, 1);
  LocalDate endDate = LocalDate.of(2025, 2, 12);
  long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);  // 11 jours
  System.out.println(daysBetween);
  ```

### 6. **Travail avec `Duration` et `Period`**

- **`Duration`** : Utilisée pour les intervalles de temps sur des objets `LocalTime`, `LocalDateTime`, ou `ZonedDateTime`.
  ```java
  LocalTime startTime = LocalTime.of(10, 0);
  LocalTime endTime = LocalTime.of(12, 30);
  Duration duration = Duration.between(startTime, endTime);  // 2 heures 30 minutes
  System.out.println(duration.toHours());  // 2
  ```

- **`Period`** : Utilisée pour les intervalles sur des objets `LocalDate` (années, mois, jours).
  ```java
  LocalDate startDate = LocalDate.of(2025, 1, 1);
  LocalDate endDate = LocalDate.of(2025, 2, 12);
  Period period = Period.between(startDate, endDate);  // 1 mois et 11 jours
  System.out.println(period.getMonths());  // 1
  ```

### 7. **Gestion des fuseaux horaires avec `ZonedDateTime`**

`ZonedDateTime` vous permet de travailler avec des dates et heures tenant compte des fuseaux horaires.

- **Obtenir l'heure dans un fuseau horaire spécifique** :
  ```java
  ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
  System.out.println(zonedDateTime);
  ```

- **Conversion entre fuseaux horaires** :
  ```java
  ZonedDateTime tokyoTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
  ZonedDateTime newYorkTime = tokyoTime.withZoneSameInstant(ZoneId.of("America/New_York"));
  System.out.println(newYorkTime);
  ```

### 8. **Conversion de types avec `DateTime` et `java.util.Date`**

Parfois, vous devez travailler avec les anciennes classes comme `java.util.Date` ou `java.sql.Date`. Vous pouvez facilement convertir entre ces classes et les nouvelles classes `java.time` :

- **Conversion de `java.util.Date` vers `LocalDateTime`** :
  ```java
  Date date = new Date();  // java.util.Date
  LocalDateTime localDateTime = date.toInstant()
                                    .atZone(ZoneId.systemDefault())
                                    .toLocalDateTime();
  ```

- **Conversion de `LocalDateTime` vers `java.util.Date`** :
  ```java
  Date date = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
  ```