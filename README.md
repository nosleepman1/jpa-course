# JPA Course

Ce dépôt contient mes travaux pratiques et mes exercices d'apprentissage de la Java Persistence API (JPA) dans l'écosystème Java.

L'objectif est de comprendre la persistance des données en Java, le mapping objet-relationnel et les interactions entre les entités Java et une base de données relationnelle.

## Technologies utilisées

- **Java** : langage de programmation.
- **Maven** : gestion des dépendances et compilation du projet.
- **JPA (Jakarta Persistence)** : spécification de persistance des données.
- **Hibernate** : implémentation de JPA.
- **MySQL** : système de gestion de base de données relationnelle.
- **JDBC** : technologie utilisée pour la communication avec MySQL via son pilote.

## Objectifs d'apprentissage

- Comprendre le fonctionnement de JPA et de l'ORM.
- Configurer un projet Java avec Maven.
- Mapper des classes Java vers des tables SQL à l'aide des annotations JPA.
- Comprendre les entités, les clés primaires et les relations entre les entités.
- Effectuer les opérations CRUD.
- Utiliser `EntityManager` et gérer les transactions.
- Écrire des requêtes avec JPQL.
- Comprendre le cycle de vie des entités.

## Structure du projet

```text
JPA-COURSE/
├── src/
│   └── main/
│       ├── java/
│       │   └── org/example/
│       │       ├── entity/
│       │       ├── util/
│       │       └── Main.java
│       └── resources/
│           └── META-INF/
│               └── persistence.xml
├── pom.xml
└── README.md
```

## Prérequis

- JDK compatible avec la configuration Maven du projet.
- IntelliJ IDEA ou un autre IDE Java.
- MySQL installé et démarré.
- Maven ou Maven Wrapper.

## Configuration

1. Cloner le dépôt :

   ```bash
   git clone <URL_DU_DEPOT>
   ```

2. Créer la base de données MySQL :

   ```sql
   CREATE DATABASE gestion_etudiants;
   ```

3. Configurer les paramètres de connexion à MySQL dans `persistence.xml`.

4. Charger les dépendances Maven dans l'IDE.

5. Compiler le projet :

   ```bash
   mvn compile
   ```

   Si Maven Wrapper est disponible sous Windows :

   ```powershell
   .\mvnw.cmd compile
   ```

6. Exécuter la classe principale du projet depuis l'IDE.

## Concepts étudiés

Les exercices sont organisés progressivement autour des concepts suivants :

- Configuration de JPA et d'Hibernate.
- Annotations : `@Entity`, `@Table`, `@Id`, `@GeneratedValue` et `@Column`.
- Gestion des entités avec `EntityManager`.
- Transactions et opérations CRUD.
- Relations entre entités.
- Requêtes JPQL.
- Intégration de JPA dans des applications Java.

## Évolution du projet

Ce dépôt évoluera au fil de mon apprentissage de JPA et de la persistance des données en Java.

Les notions étudiées pourront ensuite servir de base à des projets JavaFX, Jakarta EE et Spring Boot.

## Auteur

Abdallah Diouf

GitHub : [nosleepman1](https://github.com/nosleepman1)
