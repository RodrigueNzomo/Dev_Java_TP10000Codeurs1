# Les Tableaux et Matrices en Java

En Java, les **tableaux** et **matrices** sont des structures de données fondamentales utilisées pour stocker des collections d'éléments du même type. Java fournit également plusieurs méthodes natives pour manipuler ces structures.

## 1. Les Tableaux en Java

### Définition d'un tableau

Un **tableau** est une structure de données qui permet de stocker plusieurs éléments du même type sous un même nom. Chaque élément est accessible via un index.

### Déclaration et initialisation

#### a. Déclaration d'un tableau

Un tableau peut être déclaré de plusieurs façons :

```java
// Déclaration d'un tableau d'entiers
int[] nombres;
```

#### b. Initialisation d'un tableau

Un tableau doit être initialisé avant d'être utilisé :

```java
// Initialisation avec une taille fixe
int[] nombres = new int[5]; // Tableau de 5 éléments
```

On peut aussi initialiser un tableau directement avec des valeurs :

```java
// Initialisation avec des valeurs spécifiques
int[] nombres = {10, 20, 30, 40, 50};
```

### Accès aux éléments d'un tableau

Les éléments d'un tableau sont accessibles par leur index (qui commence à 0) :

```java
int premierElement = nombres[0]; // Accéder au premier élément
nombres[1] = 25; // Modifier un élément du tableau
```

### Parcourir un tableau

On peut utiliser une boucle `for` ou `foreach` pour parcourir un tableau :

```java
for (int i = 0; i < nombres.length; i++) {
    System.out.println(nombres[i]);
}

// Utilisation d'une boucle foreach
for (int n : nombres) {
    System.out.println(n);
}
```

---

## 2. Les Matrices en Java

### Déclaration et initialisation d'une matrice

Une **matrice** est un tableau à plusieurs dimensions. En Java, une **matrice 2D** est un tableau contenant d'autres tableaux.

#### a. Déclaration d'une matrice

```java
int[][] matrice;
```

#### b. Initialisation d'une matrice

```java
int[][] matrice = new int[3][3]; // Matrice 3x3 remplie de zéros
```

Ou avec des valeurs spécifiques :

```java
int[][] matrice = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

### Accès aux éléments d'une matrice

On utilise **deux indices** pour accéder aux éléments d'une matrice :

```java
int valeur = matrice[1][2]; // Accède à l'élément de la 2ème ligne, 3ème colonne
matrice[2][1] = 10; // Modifier un élément
```

### Parcourir une matrice

```java
for (int i = 0; i < matrice.length; i++) {
    for (int j = 0; j < matrice[i].length; j++) {
        System.out.print(matrice[i][j] + " ");
    }
    System.out.println();
}
```

---

## 3. Méthodes Système Natives pour les Tableaux en Java

Java fournit des méthodes natives pour manipuler les tableaux via la classe `Arrays`.

### a. Trier un tableau (`Arrays.sort()`)

```java
import java.util.Arrays;

int[] nombres = {5, 2, 8, 3, 1};
Arrays.sort(nombres); // Trie le tableau en ordre croissant
```

### b. Rechercher un élément (`Arrays.binarySearch()`)

Cette méthode recherche un élément dans un tableau **trié** :

```java
int index = Arrays.binarySearch(nombres, 3);
```

### c. Remplir un tableau (`Arrays.fill()`)

```java
int[] tableau = new int[5];
Arrays.fill(tableau, 7); // Remplit le tableau avec la valeur 7
```

### d. Copier un tableau (`Arrays.copyOf()`)

```java
int[] copie = Arrays.copyOf(nombres, nombres.length);
```

### e. Vérifier l'égalité entre deux tableaux (`Arrays.equals()`)

```java
boolean estEgal = Arrays.equals(nombres, copie);
```

---

## 4. Conclusion

Les tableaux et matrices sont des structures essentielles en Java, permettant de manipuler des ensembles de données efficacement. Java propose également des méthodes natives dans la classe `Arrays` pour faciliter leur gestion.

En maîtrisant ces concepts, vous serez capable de gérer et manipuler efficacement des collections d'éléments dans vos programmes Java.
