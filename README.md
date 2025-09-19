# AssistantVocale
création d'un assistant vocal java avec une api en local

# Assistant Vocal Java

Ce projet est un assistant vocal simple en Java, fonctionnant en console, capable de répondre à des commandes textuelles et de vocaliser les réponses grâce à eSpeak NG.

## Fonctionnalités
- Dialogue en console avec l'utilisateur
- Reconnaissance de commandes simples (bonjour, heure, date, quit)
- Synthèse vocale en français via eSpeak NG

## Structure du projet
```
assistantVocal/
│
├── ihm/
│   ├── ConsoleIHM.java
│   └── Voix.java
├── main/
│   └── AssistantVocalApp.java
├── metier/
│   ├── Commande.java
│   └── TraitementCommande.java
├── espeak/
│   └── espeak-ng.exe
└── README.md
```

## Prérequis
- Java 8 ou supérieur
- Windows
- eSpeak NG (fichier `espeak-ng.exe` placé dans le dossier `espeak` du projet)

## Installation
1. Clonez le projet ou téléchargez les sources.
2. Placez le fichier `espeak-ng.exe` dans le dossier `espeak` à la racine du projet.
3. Compilez le projet :
   ```powershell
   javac ihm\Voix.java ihm\ConsoleIHM.java main\AssistantVocalApp.java metier\Commande.java metier\TraitementCommande.java
   ```
4. Lancez l'application :
   ```powershell
   java main.AssistantVocalApp
   ```

## Utilisation
- Saisissez une commande dans la console (ex : "bonjour", "heure", "date", "quit").
- L'assistant affiche et vocalise la réponse.

## Personnalisation
- Pour modifier la voix ou la qualité, ajustez la ligne de commande dans `Voix.java` :
  ```java
  String cmd = String.format("espeak\\espeak-ng.exe -v fr -s 140 -p 60 -a 200 \"%s\"", texte.replace('"', ' '));
  ```
- Consultez la documentation eSpeak NG pour plus d'options : [https://espeak.sourceforge.net/](https://espeak.sourceforge.net/)

## Auteur
- Cellri131

## Licence
Projet libre d'utilisation à des fins pédagogiques.
