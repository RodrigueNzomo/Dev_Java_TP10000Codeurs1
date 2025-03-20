# Encapsulation des données en Java

L'encapsulation est l'un des principes fondamentaux de la programmation orientée objet (POO). En Java, l'encapsulation permet de protéger les données internes d'une classe tout en permettant un accès contrôlé à ces données. Cela garantit la sécurité des données et améliore la maintenabilité du code.

## 1. Notions de base

### Qu'est-ce que l'encapsulation ?

L'encapsulation consiste à cacher les détails internes de l'objet, en ne permettant l'accès qu'à certaines méthodes. Cette approche permet de contrôler la façon dont les données sont manipulées.

- **Attributs privés (`private`)** : Les données de l'objet sont souvent déclarées comme `private` pour les empêcher d'être modifiées directement depuis l'extérieur de la classe.
- **Méthodes publiques (`public`)** : Les données privées sont manipulées via des méthodes publiques appelées _getters_ (pour obtenir la valeur) et _setters_ (pour modifier la valeur).

### Exemple d'encapsulation simple

Voici un exemple d'une classe qui utilise l'encapsulation en Java :

```java
public class Personne {
    private String nom;  // Attribut privé
    private int age;     // Attribut privé

    // Getter pour le nom
    public String getNom() {
        return nom;
    }

    // Setter pour le nom
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Getter pour l'âge
    public int getAge() {
        return age;
    }

    // Setter pour l'âge avec validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("L'âge doit être positif.");
        }
    }
}
```

### Pourquoi utiliser l'encapsulation ?

- **Sécurité** : L'encapsulation empêche l'accès direct aux variables d'instance de la classe. Cela réduit les risques de modification accidentelle des données.
- **Modularité et flexibilité** : L'implémentation interne de la classe peut être modifiée sans affecter l'extérieur de la classe, tant que l'interface publique (méthodes accessibles) reste la même.
- **Contrôle** : L'encapsulation permet de contrôler l'accès et la modification des données via des méthodes, offrant ainsi la possibilité de valider ou de manipuler les données avant de les modifier.

## 2. Bonnes pratiques pour l'encapsulation

### a. Utiliser des attributs privés

Toujours déclarer les variables d'instance comme `private` pour les rendre inaccessibles directement de l'extérieur de la classe.

### b. Utiliser des méthodes d'accès (getters et setters)

Les **getters** et **setters** permettent un accès contrôlé aux attributs privés. Vous pouvez également effectuer des vérifications ou des validations avant de modifier les données.

- **Getter** : Permet de récupérer la valeur d'un attribut privé.
- **Setter** : Permet de modifier la valeur d'un attribut privé, avec éventuellement une validation.

### c. Valider les données dans les setters

Les setters ne doivent pas seulement modifier les données, mais peuvent aussi contenir des règles de validation pour garantir que les données restent dans un état valide. Par exemple, dans une classe `CompteBancaire`, vous pouvez vérifier si le montant déposé ou retiré est valide avant d'effectuer l'opération.

```java
public void deposer(double montant) {
    if (montant > 0) {
        solde += montant;
    } else {
        System.out.println("Montant invalide.");
    }
}
```

### d. Limiter l'exposition des méthodes publiques

Il est important de ne rendre publiques que les méthodes qui doivent être accessibles de l'extérieur de la classe. Les méthodes internes qui ne sont pas destinées à être appelées à l'extérieur doivent être privées (`private`).

### e. Immuabilité

Lorsqu'un objet ne doit pas être modifié après sa création, il peut être déclaré comme _immuable_. Cela implique que les attributs sont `final` et n'ont pas de méthodes `setters`. Par exemple, dans une classe `Point` où les coordonnées sont constantes après la création de l'objet :

```java
public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
```

## 3. Exemple avancé d'encapsulation avec validation

Un exemple plus complet pourrait être celui d'une classe `CompteBancaire` où les opérations bancaires sont contrôlées via des getters et setters.

```java
public class CompteBancaire {
    private double solde;

    // Getter pour le solde
    public double getSolde() {
        return solde;
    }

    // Méthode pour déposer de l'argent avec validation
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
        } else {
            System.out.println("Montant invalide.");
        }
    }

    // Méthode pour retirer de l'argent avec validation
    public void retirer(double montant) {
        if (montant > 0 && montant <= solde) {
            solde -= montant;
        } else {
            System.out.println("Montant invalide ou fonds insuffisants.");
        }
    }
}
```

### Avantages :

- **Contrôle des données** : On s'assure que les fonds ne peuvent pas être retirés si le solde est insuffisant.
- **Encapsulation de la logique métier** : La logique de validation est encapsulée à l'intérieur de la classe, évitant ainsi des erreurs potentielles de manipulation des données.

## 4. Conclusion

L'encapsulation permet de protéger les données internes d'une classe et de garantir que les opérations sur ces données sont réalisées de manière sécurisée. Elle favorise la modularité, l'intégrité et la maintenabilité du code, tout en réduisant le risque d'accès non autorisé ou de modifications incorrectes.

En suivant les bonnes pratiques d'encapsulation, vous créez des classes robustes, réutilisables et faciles à maintenir.
