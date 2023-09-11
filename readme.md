`11. September 2023` `neueFische - Java Development Bootcamp`

# Date

## Theoretische Aufgaben

1. Wie kann man in Java ein LocalDate um einen Tag erhöhen oder verringern?

```
meinDatum.plusDays() und die Anzahl Tage in die Klammern eintragen.
```

2. Ihr schreibt eine Geburtstags-Reminder-App. Sie soll Euch um 10:00 morgens an eventuelle Geburtstage Eurer
   Freundinnen erinnern. Welchen Datentyp wäre zum Speichern der Geburtstage der Freundinnen optimal?

```
LocalDate, da wir zu unserer lokalen Zeit erinnert werden wollen.
```

3. Ihr baut ein Online-Mensch-Ärgere-Dich-Nicht. Auf der Webseite kann man sich mit Freunden aus aller Welt zu Spielen
   verabreden. In welchem Datenformat speichert Ihr die Zeitpunkte kommender Spiele am besten?

```
Instant
```

4. In Eurer Banking-Software wollt Ihr festhalten, wann eine Userin die Allgemeinen Geschäftsbedingungen akzeptiert hat.
   Wir speichert Ihr den Zeitpunkt des Klicks am besten?

```
ZonedDateTime
```

5. Ein Flugzeug startet um 13:00 und landet um 17:00. Es war 8 Stunden unterwegs. Wie kann das sein?

```
Keine Zeitzonen angegeben
```

## Aufgaben

1. _Schritt 1_: Schreibe Code, um das aktuelle Datum und die aktuelle Uhrzeit auszugeben.
2. _Schritt 2_: Füge dem aktuellen Datum eine Zeitspanne von 2 Wochen hinzu und gib das neue Datum aus.
3. _Schritt 3_: Vergleiche das aktuelle Datum mit einem festgelegten zukünftigen Datum und gib aus, ob das aktuelle Datum vor oder nach dem festgelegten Datum liegt.
4. _Schritt 4_: Berechne die Differenz in Tagen zwischen zwei beliebigen Daten und gib das Ergebnis aus.

## Bonus Aufgaben
1. Schreibe eine Klasse Animal an und füge ihr ein Attribut birthday und name hinzu.
2. Lege eine Instanz der Klasse Animal an.
3. Gib auf der Kommandozeile aus, wie viele Tage es bis zum nächsten Geburtstag des Tieres sind
###### Achtung: Überlege, ob Du den Geburtstag mit oder ohne Zeitzone speichern solltest. Was ist sinnvoller?