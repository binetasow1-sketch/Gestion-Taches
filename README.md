<div align="center">

  <img src="https://img.shields.io/badge/Spring%20Boot-3.3.4-green?style=for-the-badge&logo=spring&logoColor=white" alt="Spring Boot"/>
  <img src="https://img.shields.io/badge/MySQL-8.0-blue?style=for-the-badge&logo=mysql&logoColor=white" alt="MySQL"/>
  <img src="https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=java&logoColor=white" alt="Java 21"/>
  <img src="https://img.shields.io/badge/HTML5%20%2B%20JS-E34F26?style=for-the-badge&logo=html5&logoColor=white" alt="HTML + JS"/>

  <h1>📋 Gestion de Tâches - Bineta</h1>
  <p>
    <strong>Une application simple, moderne et efficace pour organiser ta vie quotidienne</strong><br>
    Projet créé avec ❤️ à Dakar • Mars 2026
  </p>

  <p>
    <a href="#démarrage-rapide">Démarrage rapide</a> •
    <a href="#fonctionnalités">Fonctionnalités</a> •
    <a href="#technologies">Technologies</a> •
    <a href="#principes-solid">Principes SOLID</a> •
    <a href="#structure-du-projet">Structure</a>
  </p>

</div>

## ✨ Aperçu

Une petite application **Spring Boot + MySQL** avec :

- Une API REST complète (CRUD)
- Une interface web HTML/JS moderne et responsive
- Sauvegarde persistante dans MySQL
- Design doux, accueillant et motivant

## 🚀 Démarrage rapide

1. Clone le projet
   ```bash
   git clone https://github.com/binetasow1-sketch/Gestion-Taches.git
   cd Gestion-Taches
   
🎯 Fonctionnalités

Ajouter une tâche
Voir toutes les tâches
Modifier une tâche existante
Supprimer une tâche
Statuts colorés : À faire • En cours • Terminé
Interface web intuitive avec animations légères
Messages de feedback (succès / erreur)

##🧑‍💻 Technologies utilisées

| Technologie       | Version      | Rôle                                      |
|-------------------|--------------|-------------------------------------------|
| Spring Boot       | 3.3.4        | Framework + serveur Tomcat embarqué       |
| Spring Data JPA   | —            | ORM et repositories                       |
| Hibernate         | 6.x          | Mapping objet-relationnel                 |
| MySQL             | 8.x          | Base de données                           |
| Lombok            | 1.18.x       | Réduction du code boilerplate             |
| HTML / CSS / JS   | —            | Interface web statique + fetch API        |
| Font Awesome      | 6.x          | Icônes                                    |
| Google Fonts      | Poppins      | Typographie élégante                      |


## Principes SOLID appliqués
| Principe | Signification                              | Application concrète dans ce projet                                                                 |
|----------|--------------------------------------------|-----------------------------------------------------------------------------------------------------|
| **S**    | Single Responsibility                      | Chaque classe a un seul rôle clair (Controller = routes, Service = métier, Repository = BD)        |
| **O**    | Open/Closed                                | On peut ajouter des catégories sans modifier les classes existantes                                |
| **L**    | Liskov Substitution                        | Toute implémentation future de Repository peut remplacer TacheRepository sans casser le service    |
| **I**    | Interface Segregation                      | TacheRepository n’expose que les méthodes utiles (pas de méthodes inutiles)                        |
| **D**    | Dependency Inversion                       | TacheService dépend de l’interface TacheRepository (injectée par Spring)                           |

## Structure du projet

| Dossier/Fichier principal              | Contenu clé                                 | Ce qu’il fait                                   |
|----------------------------------------|---------------------------------------------|-------------------------------------------------|
| `pom.xml`                              | Dépendances Maven                           | Liste les bibliothèques (Spring, JPA, MySQL…)  |
| `src/main/java/com/gestiontaches`      | Tous les fichiers Java                      | Code de l’application                           |
| `controller/`                          | `TacheController.java`                      | Gère les requêtes HTTP (/api/taches)            |
| `dto/`                                 | `TacheDTO.java`                             | Données envoyées/reçues par l’API               |
| `entity/`                              | `Tache.java`                                | Modèle de la table en base de données           |
| `repository/`                          | `TacheRepository.java`                      | Connexion à la base (sauvegarde, lecture…)      |
| `service/`                             | `TacheService.java`                         | Logique métier (ajout, modification…)           |
| `src/main/resources/static/`           | `index.html`                                | Page web visible dans le navigateur             |
| `src/main/resources/`                  | `application.properties`                    | Configuration (base MySQL, port 8080…)          |
| `README.md`                            | Ce fichier                                  | Documentation du projet                         |

⚙️ Configuration MySQL (extrait de application.properties)
spring.datasource.url=jdbc:mysql://localhost:3306/gestion_taches?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
server.port=8080

🛤️ Prochaines étapes possibles
Authentification (login/mot de passe ou JWT)
Ajout de catégories / priorités / dates limites
Recherche et filtres sur les tâches
Export PDF / CSV
Dark mode sur l’interface
Déploiement sur Render / Railway / Vercel
