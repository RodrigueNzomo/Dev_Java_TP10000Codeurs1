# Les Méthodes en Java

## Introduction aux Méthodes en Java
Une méthode en Java est un bloc de code réutilisable qui exécute une tâche spécifique. Elle améliore la modularité et permet d'éviter la répétition du code.

### Déclaration d'une Méthode
```java
public class Exemple {
    // Méthode sans retour et sans paramètre
    public void afficherMessage() {
        System.out.println("Bonjour, ceci est une méthode !");
    }
}
```

### Méthodes avec Paramètres et Retour
```java
public class Calcul {
    public int addition(int a, int b) {
        return a + b;
    }
}
```

## Surcharge des Méthodes (Method Overloading)
La surcharge de méthodes permet de définir plusieurs méthodes avec le même nom mais avec des signatures différentes (nombre ou type de paramètres).

### Exemple de Surcharge
```java
public class MathOperations {
    public int addition(int a, int b) {
        return a + b;
    }

    public double addition(double a, double b) {
        return a + b;
    }
}
```

## Constructeurs en Java
Un constructeur est une méthode spéciale utilisée pour initialiser un objet lorsqu'il est créé.

### Définition d'un Constructeur
```java
public class Personne {
    String nom;
    int age;

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
}
```

## Différents Types de Méthodes en Java
### 1. Méthodes Statique (static)
Les méthodes statiques appartiennent à la classe et non aux objets.
```java
public class Utils {
    public static void afficherBienvenue() {
        System.out.println("Bienvenue!");
    }
}
```

### 2. Méthodes d'Instance
Elles sont appelées sur une instance d'une classe.
```java
public class Voiture {
    public void demarrer() {
        System.out.println("La voiture démarre.");
    }
}
```

### 3. Méthodes Final
Une méthode marquée `final` ne peut pas être redéfinie.
```java
public class Animal {
    public final void dormir() {
        System.out.println("L'animal dort.");
    }
}
```

### 4. Méthodes Abstraites
Déclarées dans une classe abstraite, elles doivent être implémentées par les sous-classes.
```java
abstract class Forme {
    abstract void dessiner();
}
```

## Conclusion
Les méthodes jouent un rôle essentiel en Java pour structurer le code. La surcharge permet une flexibilité accrue, tandis que les constructeurs facilitent l'initialisation des objets. Bien comprendre ces concepts est crucial pour le développement efficace en Java.

# Les Méthodes en Java

## 1. Qu'est-ce qu'une méthode en Java ?
Une méthode est un bloc de code réutilisable qui exécute une tâche spécifique lorsqu'il est appelé. Les méthodes permettent de structurer et d'organiser le code en facilitant la réutilisation et la maintenance.

### Composition d'une méthode
Une méthode en Java est composée des éléments suivants :
1. **Modificateurs d'accès** : Définissent la portée de la méthode (`public`, `private`, `protected`).
2. **Type de retour** : Indique le type de valeur retournée (`void` si aucune valeur n'est retournée).
3. **Nom de la méthode** : Identifie la méthode de manière unique.
4. **Liste des paramètres** : Spécifie les entrées de la méthode (facultatif).
5. **Corps de la méthode** : Contient le bloc d'instructions exécutées lorsque la méthode est appelée.
6. **Mot-clé `return`** : Utilisé pour renvoyer une valeur (facultatif si le type de retour est `void`).

Exemple d'une méthode en Java :
```java
public class Exemple {
    // Méthode avec retour
    public int addition(int a, int b) {
        return a + b;
    }
    
    // Méthode sans retour (void)
    public void afficherMessage() {
        System.out.println("Bonjour !");
    }
}
```

## 2. La surcharge des méthodes (Method Overloading)
La surcharge d'une méthode permet d'avoir plusieurs méthodes avec le même nom mais des signatures différentes (paramètres différents en type ou en nombre).

Exemple :
```java
public class Calcul {
    public int somme(int a, int b) {
        return a + b;
    }
    
    public double somme(double a, double b) {
        return a + b;
    }
    
    public int somme(int a, int b, int c) {
        return a + b + c;
    }
}
```
Avantages :
- Améliore la lisibilité du code.
- Facilite la réutilisation sans changer le nom de la méthode.

## 3. Les constructeurs en Java
Un constructeur est une méthode spéciale utilisée pour initialiser un objet lors de sa création.

### Types de constructeurs
1. **Constructeur par défaut** : Ne prend aucun paramètre.
2. **Constructeur paramétré** : Accepte des arguments pour initialiser les attributs.
3. **Constructeur de copie** : Crée un nouvel objet en copiant un objet existant.

Exemple :
```java
public class Personne {
    String nom;
    int age;
    
    // Constructeur par défaut
    public Personne() {
        this.nom = "Inconnu";
        this.age = 0;
    }
    
    // Constructeur paramétré
    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
    
    // Constructeur de copie
    public Personne(Personne p) {
        this.nom = p.nom;
        this.age = p.age;
    }
}
```

## 4. Les dérivés des méthodes
### 4.1 Les méthodes statiques
Les méthodes statiques appartiennent à la classe plutôt qu'à une instance.
```java
public class Utilitaire {
    public static int carre(int nombre) {
        return nombre * nombre;
    }
}
```
Appel : `Utilitaire.carre(5);`

### 4.2 Les méthodes finales
Une méthode `final` ne peut pas être redéfinie par les sous-classes.
```java
public class Parent {
    public final void afficher() {
        System.out.println("Méthode finale");
    }
}
```

### 4.3 Les méthodes abstraites
Les méthodes abstraites sont déclarées dans une classe abstraite et doivent être implémentées par les sous-classes.
```java
abstract class Animal {
    abstract void faireDuBruit();
}
```

### 4.4 Les méthodes synchronisées
Utilisées en programmation multithreading pour garantir qu'une seule thread exécute la méthode à la fois.
```java
public synchronized void incrementer() {
    compteur++;
}
```

## Conclusion
Les méthodes sont un élément fondamental de Java, permettant de décomposer un programme en unités réutilisables et compréhensibles. Leur bonne utilisation permet d'améliorer la lisibilité, la modularité et la maintenabilité du code.

En Java, une application principale est généralement une classe qui contient le point d'entrée de l'exécution du programme. Ce point d'entrée est la méthode main. C'est cette méthode qui est exécutée lorsque vous lancez votre programme Java.

1. Composition de l'application principale (avec la méthode main) :
Voici un exemple simple de la composition d'une application principale en Java :


public class ApplicationPrincipale {

    // Méthode principale qui est le point d'entrée de l'application
    public static void main(String[] args) {
        // Code exécuté lors du démarrage de l'application
        System.out.println("Bienvenue dans l'application principale !");
    }
}
Classe principale (ApplicationPrincipale) : C'est la classe qui contient la méthode main, qui est le point de départ de l'exécution.
Méthode main : Elle doit être déclarée comme public static void main(String[] args). Elle est utilisée pour lancer l'exécution du programme.
public : La méthode est accessible de n'importe où.
static : La méthode est appelée sans créer une instance de la classe.
void : La méthode ne renvoie aucune valeur.
String[] args : C'est un tableau de chaînes de caractères qui permet de passer des arguments à l'application lorsqu'elle est lancée depuis la ligne de commande.
2. Différence entre application principale et méthode :
Méthode :

Une méthode en Java est une fonction définie à l'intérieur d'une classe qui effectue une tâche spécifique. Elle peut être appelée depuis d'autres parties du programme.
Elle peut avoir un type de retour (par exemple, int, String, void).
Une méthode peut prendre des arguments et renvoyer des résultats.
Exemple d'une méthode simple dans une classe :


public class Utilitaire {

    // Méthode qui effectue une addition
    public int additionner(int a, int b) {
        return a + b;
    }
}
Ici, la méthode additionner prend deux arguments (int a et int b) et renvoie leur somme.
Application principale :

L'application principale est une classe spécifique qui contient la méthode main. C'est elle qui démarre le programme en appelant d'autres méthodes ou en instanciant des objets nécessaires.
Elle peut contenir des méthodes et des objets comme n'importe quelle autre classe, mais elle est distinguée par la présence de la méthode main, qui sert de point d'entrée.
En résumé :

Méthode : Fonction dans une classe, effectuée lorsqu'elle est appelée.
Application principale : Contient la méthode main, qui est le point de démarrage de l'exécution d'un programme en Java.