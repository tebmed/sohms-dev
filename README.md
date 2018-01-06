# Manuel d'utilisation

### Lancer un serveur php depuis la racine du projet sohms-hci
Exemple sous linux : php -S localhost:8080

Sous Windows : voir démarrer un serveur avec Wamp

### Lancer Arena
Sous Linux : exécuter le main de la classe MockArena (bouchon d'Arena) du projet sohms-dev

Sous Windows : soit exécuter le bouchon de la même manière, soit utiliser Arena pour simulation réelle

### Lancer le SoHMS
Exécuter le main de la classe InitialisationSysteme pour démarrer le SoHMS

### Lancer un scénario
Depuis l'IHM à l'adresse localhost:8080 dans un navigateur :
- S'assurer que le SoHMS reconnait la connexion de l'IHM : message dans la console
- Si ce n'est pas le cas, essayer d'actualiser l'IHM (ctrl+r)
- Choisir/créer un scénario sur l'IHM puis l'envoyer au SOHMS (Run Scenario)
