En programmation et en génie logiciel, plusieurs conventions de nommage (normages) sont utilisées pour améliorer la lisibilité et la maintenabilité du code. Voici trois normes couramment utilisées :

---

### 1️⃣ **Camel Case (Casing en chameau)**

👉 Utilisé en Java, JavaScript, et d'autres langages orientés objet.

- **Description** : Chaque mot commence par une majuscule, sauf le premier dans le cas du **lowerCamelCase**.
- **Exemples** :
  - `maVariable` (lower camel case) – utilisé pour les variables et méthodes en Java.
  - `MaClasse` (UpperCamelCase ou PascalCase) – utilisé pour les classes.

🔹 **Usage en Java** :

```java
public class MaClasse {
    private int ageUtilisateur;

    public void afficherNomUtilisateur() {
        System.out.println("Bonjour !");
    }
}
```

---

### 2️⃣ **Snake Case (Casing en serpent)**

👉 Utilisé dans Python, SQL, et certains fichiers de configuration.

- **Description** : Les mots sont séparés par des underscores (`_`).
- **Exemples** :
  - `ma_variable` – utilisé pour les variables en Python.
  - `nom_utilisateur` – souvent utilisé dans les bases de données et les noms de fichiers.

🔹 **Usage en Python** :

```python
nom_utilisateur = "Alice"
age_utilisateur = 25
```

---

### 3️⃣ **Kebab Case (Casing en kebab)**

👉 Principalement utilisé pour les URLs, les noms de fichiers et certaines conventions dans les frameworks web.

- **Description** : Les mots sont séparés par des tirets (`-`).
- **Exemples** :
  - `mon-site-web.html`
  - `api-utilisateur-get`

🔹 **Usage dans une URL** :

```
https://mon-site.com/utilisateurs-connectes
```

---

### ✅ **Comparaison des trois normes**

| Style          | Exemple de variable | Exemple de classe | Utilisation principale       |
| -------------- | ------------------- | ----------------- | ---------------------------- |
| **Camel Case** | `maVariable`        | `MaClasse`        | Java, JavaScript, C#         |
| **Snake Case** | `ma_variable`       | `ma_classe`       | Python, SQL, fichiers config |
| **Kebab Case** | `ma-variable`       | `ma-classe`       | URL, noms de fichiers        |

Ces conventions aident à uniformiser le code et facilitent son entretien. 🚀
Déclaration de Variables
Les variables en Java sont des conteneurs pour stocker des données qui peuvent changer au cours de l'exécution du programme. Voici comment déclarer une variable :

Copier
// Déclaration d'une variable entière
int age;

// Initialisation d'une variable entière
age = 25;

// Déclaration et initialisation en une seule ligne
int nombre = 10;

// Déclaration d'une variable de type chaîne de caractères
String nom = "Alice";

// Déclaration d'une variable de type flottant
double prix = 19.99;

// Déclaration d'une variable booléenne
boolean estActif = true;
Déclaration de Constantes
Les constantes en Java sont des variables dont la valeur ne peut pas être modifiée après leur initialisation. Elles sont déclarées avec le mot-clé final. Par convention, les noms de constantes sont écrits en majuscules avec des underscores pour séparer les mots.

Copier
// Déclaration d'une constante entière
final int NOMBRE_MAX = 100;

// Déclaration d'une constante de type chaîne de caractères
final String NOM_APPLICATION = "MonApplication";

// Déclaration d'une constante de type flottant
final double PI = 3.14159;
Exemple Complet
Voici un exemple complet montrant la déclaration de variables et de constantes dans une classe Java :

public class Exemple {
// Constante
final int NOMBRE_MAX = 100;

    public static void main(String[] args) {
        // Variables
        int age = 25;
        String nom = "Alice";
        double prix = 19.99;
        boolean estActif = true;

        // Utilisation des variables et constantes
        System.out.println("Nom: " + nom);
        System.out.println("Âge: " + age);
        System.out.println("Prix: " + prix);
        System.out.println("Est actif: " + estActif);
        System.out.println("Nombre max: " + NOMBRE_MAX);
    }

}
