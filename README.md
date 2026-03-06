
# Gestion de Tâches – Bineta 🌴✨

Une petite application **Spring Boot** pour organiser mes journées avec simplicité et sourire.

Créée à Dakar • Mars 2026

## Fonctionnalités

- Ajouter, modifier, supprimer des tâches
- Interface web simple et accueillante
- Sauvegarde dans MySQL
- API REST complète

## Démarrage rapide

1. Crée la base `gestion_taches` dans phpMyAdmin
2. Lance l’application :

3. .\mvnw spring-boot:run
4. 3. Ouvre : http://localhost:8080/

## Technologies utilisées

| Technologie       | Rôle principal                          |
|-------------------|-----------------------------------------|
| Spring Boot       | Framework + serveur web                 |
| Spring Data JPA   | Gestion des entités                     |
| Hibernate         | Mapping avec la base                    |
| MySQL             | Stockage des tâches                     |
| Lombok            | Moins de code répétitif                 |
| HTML + CSS        | Interface utilisateur                   |


## Architecture en couches

| Couche / Niveau           | Composants principaux                  | Responsabilités principales                               | Communique avec                     |
|---------------------------|----------------------------------------|-----------------------------------------------------------|-------------------------------------|
| **Présentation (Web)**    | TacheController + index.html (HTML) | Routes API REST, réponses JSON, interface utilisateur     | Navigateur + Service                |
| **Métier (Business)**     | TacheService                           | Logique applicative, validation, conversion DTO ↔ Entity  | Controller + Repository             |
| **Persistence (Données)** | TacheRepository + Tache (Entity)       | Accès à la base de données (CRUD via JPA)                 | Service + MySQL                     |
| **Base de données**       | MySQL (table `taches`)                 | Stockage persistant des tâches                            | Hibernate via JDBC                  |

## Principes SOLID appliqués

| Principe | Signification courte                          | Dans ce projet                                      |
|----------|-----------------------------------------------|-----------------------------------------------------|
| **S**    | Une classe = une responsabilité               | Controller = routes, Service = logique, Repository = BD |
| **O**    | Ouverte à l’extension, fermée à la modif      | On peut ajouter catégories sans casser le code      |
| **L**    | Sous-types remplaçables sans casse            | Repository interchangeable sans impact sur Service  |
| **I**    | Interfaces spécifiques                        | TacheRepository n’a que les méthodes utiles         |
| **D**    | Dépendre d’abstractions                       | Service dépend de l’interface Repository            |

## Structure du projet

| Dossier / Fichier principal                  | Contenu clé                               | Rôle principal                                      |
|----------------------------------------------|-------------------------------------------|-----------------------------------------------------|
| `pom.xml`                                    | Dépendances Maven                         | Spring Boot, JPA, MySQL, Lombok, etc.               |
| `src/main/java/com/gestiontaches`            | Code source Java                          | —                                                   |
| `controller/TacheController.java`            | Contrôleur REST                           | Endpoints `/api/taches` (GET/POST/PUT/DELETE)       |
| `dto/TacheDTO.java`                          | Objet de transfert                        | Données envoyées/reçues par l’API                   |
| `entity/Tache.java`                          | Entité JPA                                | Modèle de la table `taches`                         |
| `repository/TacheRepository.java`            | Interface repository                      | CRUD automatique avec Spring Data JPA               |
| `service/TacheService.java`                  | Couche métier                             | Logique métier + conversion DTO ↔ Entity            |
| `src/main/resources/static/index.html`       | Page d’accueil web                        | Interface utilisateur (HTML + CSS)                  |
| `src/main/resources/application.properties`  | Configuration                             | Connexion MySQL, port 8080, logs Hibernate          |
| `README.md`                                  | Documentation                             | Ce fichier que tu lis actuellement                  |

## Auteur

Bineta Sow  
Dakar, Sénégal  
Mars 2026

