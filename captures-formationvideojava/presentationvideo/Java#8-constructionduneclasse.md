# Construction en Java : Organisation et Bonnes Pratiques

## 1. Structure d'un programme Java
Un programme Java est généralement composé de plusieurs fichiers organisés en classes et en packages. Voici les principaux éléments :

### a) Un fichier source Java
Chaque fichier source Java doit porter le même nom que la classe publique qu'il contient. L'extension du fichier est `.java`.

**Exemple :**
```java
// Fichier : Personne.java
public class Personne {
    String nom;
    int age;
}
```

### b) La méthode `main`
La méthode `main` est le point d'entrée d'une application Java. Elle doit obligatoirement être définie comme suit :
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

## 2. Classes et objets en Java
Java est un langage orienté objet. Tout programme Java repose sur des **classes** et des **objets**.

### a) Définition d'une classe
Une classe est un modèle définissant des attributs et des méthodes.

```java
public class Animal {
    String nom;
    int age;
    
    public void afficherInfos() {
        System.out.println("Nom: " + nom + ", Age: " + age);
    }
}
```

### b) Création et utilisation d'un objet
Un objet est une instance d'une classe.
```java
public class Test {
    public static void main(String[] args) {
        Animal chat = new Animal();
        chat.nom = "Minou";
        chat.age = 2;
        chat.afficherInfos();
    }
}
```

## 3. Constructeurs en Java
Un **constructeur** est une méthode spéciale permettant d'initialiser un objet lors de sa création.

```java
public class Voiture {
    String marque;
    int annee;
    
    // Constructeur
    public Voiture(String marque, int annee) {
        this.marque = marque;
        this.annee = annee;
    }
}
```

### Utilisation du constructeur :
```java
public class TestVoiture {
    public static void main(String[] args) {
        Voiture maVoiture = new Voiture("Toyota", 2022);
        System.out.println("Marque: " + maVoiture.marque + ", Année: " + maVoiture.annee);
    }
}
```

## 4. Organisation des fichiers en packages
Les **packages** permettent d'organiser les classes dans des dossiers logiques.

### a) Déclaration d'un package
```java
package monpackage;

public class Exemple {
    public void afficher() {
        System.out.println("Exemple de package");
    }
}
```

### b) Importation d'un package
```java
import monpackage.Exemple;

public class Test {
    public static void main(String[] args) {
        Exemple ex = new Exemple();
        ex.afficher();
    }
}
```

## 5. Héritage et polymorphisme
L'**héritage** permet de créer une nouvelle classe à partir d'une classe existante.

### a) Déclaration d'une classe parent
```java
public class Animal {
    public void faireDuBruit() {
        System.out.println("Un animal fait du bruit");
    }
}
```

### b) Classe enfant qui hérite de `Animal`
```java
public class Chien extends Animal {
    public void faireDuBruit() {
        System.out.println("Le chien aboie");
    }
}
```

### c) Utilisation du polymorphisme
```java
public class Test {
    public static void main(String[] args) {
        Animal monAnimal = new Chien();
        monAnimal.faireDuBruit(); // Affichera "Le chien aboie"
    }
}
```

## 6. Interface et abstraction
### a) Utilisation d'une interface
```java
interface Volant {
    void voler();
}

public class Oiseau implements Volant {
    public void voler() {
        System.out.println("L'oiseau vole dans le ciel");
    }
}
```

### b) Classe abstraite
```java
abstract class Forme {
    abstract void dessiner();
}

public class Cercle extends Forme {
    public void dessiner() {
        System.out.println("Dessiner un cercle");
    }
}
```

## 7. Gestion des exceptions
```java
public class TestException {
    public static void main(String[] args) {
        try {
            int resultat = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Erreur : Division par zéro");
        }
    }
}
```

## 8. Bonnes pratiques
- **Respecter la convention de nommage** : noms de classes en `CamelCase`, variables/méthodes en `camelCase`
- **Utiliser des commentaires clairs** (`// Commentaire` ou `/* Commentaire */`)
- **Diviser le code en packages** pour une meilleure organisation
- **Encapsuler les attributs** (`private` + getters/setters)
- **Utiliser `final`** pour les constantes (`final int MAX = 100;`)

## Conclusion
Java est un langage structuré basé sur l'orienté objet. En suivant ces principes, vous pourrez écrire du code plus clair, maintenable et efficace.

🚀 Bon développement en Java !

