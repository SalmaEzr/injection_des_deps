## Readme

### Projet d'Injection de Dépendances

Ce projet vise à illustrer le concept d'injection de dépendances en Java en utilisant le package présent.

### Structure du Projet

Le projet contient principalement trois composants :

1. **DAO (Data Access Object)** : Interface et classes d'implémentation qui gèrent l'accès aux données.
2. **Métier** : Interface et classes d'implémentation qui représentent la logique métier de l'application.
3. **Présentation** : Classe `Presentation2` qui orchestre l'injection des dépendances et l'exécution de l'application.

### Fonctionnalités

La classe `Presentation2` effectue les actions suivantes :

1. Lecture des noms de classes pour le DAO et le Métier à partir d'un fichier de configuration (`config.txt`).
2. Chargement dynamique des classes spécifiées à l'aide de la réflexion Java.
3. Création d'instances des classes DAO et Métier.
4. Injection du DAO dans l'instance de Métier à l'aide de la réflexion Java.
5. Appel d'une méthode de calcul sur l'instance de Métier.
6. Affichage du résultat.

### Utilisation

Pour exécuter ce projet :

1. Assurez-vous que le fichier de configuration `config.txt` contient les noms pleinement qualifiés des classes pour le DAO et le Métier, chacun sur une ligne séparée.
2. Compilez et exécutez la classe `Presentation2`.
