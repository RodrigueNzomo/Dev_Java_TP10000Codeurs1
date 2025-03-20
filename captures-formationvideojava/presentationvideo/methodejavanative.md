# Liste Complète des Méthodes en Java, Classées par Catégorie et Utilité

## 1. Méthodes Fondamentales de `Object`

Toutes les classes Java héritent de `Object`, qui fournit ces méthodes de base :

| Méthode                        | Utilité                          |
| ------------------------------ | -------------------------------- |
| `equals(Object obj)`           | Compare deux objets.             |
| `hashCode()`                   | Retourne un code de hachage.     |
| `toString()`                   | Convertit l'objet en chaîne.     |
| `clone()`                      | Crée une copie de l'objet.       |
| `getClass()`                   | Retourne la classe de l'objet.   |
| `notify()`, `notifyAll()`      | Réveille les threads en attente. |
| `wait()`, `wait(long timeout)` | Met en pause un thread.          |

---

## 2. Méthodes des Chaînes de Caractères

### `String`

| Méthode                                                  | Utilité                            |
| -------------------------------------------------------- | ---------------------------------- |
| `length()`                                               | Retourne la longueur de la chaîne. |
| `charAt(int index)`                                      | Retourne un caractère.             |
| `concat(String s)`                                       | Concatène deux chaînes.            |
| `replace(CharSequence target, CharSequence replacement)` | Remplace une sous-chaîne.          |
| `split(String regex)`                                    | Divise une chaîne en tableau.      |

### La Classe `String` en Java

La classe `String` en Java est l'une des classes les plus utilisées pour manipuler les chaînes de caractères. Elle fait partie du package `java.lang`, ce qui signifie qu'elle est automatiquement importée dans chaque programme Java. Les objets `String` sont immuables, ce qui signifie que leur valeur ne peut pas être modifiée une fois qu'ils sont créés.

### Création d'Objets `String`

Vous pouvez créer un objet `String` de plusieurs façons :

```java
String str1 = "Hello, World!";
String str2 = new String("Hello, World!");
```

### Méthodes Natifs de la Classe `String`

La classe `String` offre une variété de méthodes pour manipuler et interroger les chaînes de caractères. Voici quelques-unes des méthodes les plus couramment utilisées :

1. **`charAt(int index)`**

   - Retourne le caractère à la position spécifiée.

   ```java
   String str = "Hello";
   char c = str.charAt(1); // 'e'
   ```

2. **`length()`**

   - Retourne la longueur de la chaîne.

   ```java
   String str = "Hello";
   int len = str.length(); // 5
   ```

3. **`substring(int beginIndex)`**

   - Retourne une nouvelle chaîne qui est un sous-ensemble de cette chaîne.

   ```java
   String str = "Hello, World!";
   String subStr = str.substring(7); // "World!"
   ```

4. **`substring(int beginIndex, int endIndex)`**

   - Retourne une nouvelle chaîne qui est un sous-ensemble de cette chaîne, commençant à `beginIndex` et se terminant juste avant `endIndex`.

   ```java
   String str = "Hello, World!";
   String subStr = str.substring(7, 12); // "World"
   ```

5. **`concat(String str)`**

   - Concatène cette chaîne avec une autre chaîne spécifiée.

   ```java
   String str1 = "Hello, ";
   String str2 = "World!";
   String result = str1.concat(str2); // "Hello, World!"
   ```

6. **`equals(Object anObject)`**

   - Compare cette chaîne avec l'objet spécifié.

   ```java
   String str1 = "Hello";
   String str2 = "Hello";
   boolean isEqual = str1.equals(str2); // true
   ```

7. **`equalsIgnoreCase(String anotherString)`**

   - Compare cette chaîne avec une autre chaîne, ignorant la casse.

   ```java
   String str1 = "Hello";
   String str2 = "hello";
   boolean isEqual = str1.equalsIgnoreCase(str2); // true
   ```

8. **`replace(char oldChar, char newChar)`**

   - Retourne une nouvelle chaîne résultant du remplacement de toutes les occurrences de `oldChar` par `newChar`.

   ```java
   String str = "Hello, World!";
   String newStr = str.replace('o', 'a'); // "Hella, Warld!"
   ```

9. **`split(String regex)`**

   - Divise cette chaîne autour des correspondances de l'expression régulière donnée.

   ```java
   String str = "one,two,three";
   String[] parts = str.split(","); // ["one", "two", "three"]
   ```

10. **`toLowerCase()`**

    - Convertit tous les caractères de cette chaîne en minuscules.

    ```java
    String str = "Hello, World!";
    String lowerStr = str.toLowerCase(); // "hello, world!"
    ```

11. **`toUpperCase()`**

    - Convertit tous les caractères de cette chaîne en majuscules.

    ```java
    String str = "Hello, World!";
    String upperStr = str.toUpperCase(); // "HELLO, WORLD!"
    ```

12. **`trim()`**
    - Supprime les espaces blancs en début et fin de chaîne.
    ```java
    String str = "  Hello, World!  ";
    String trimmedStr = str.trim(); // "Hello, World!"
    ```

### Illustrations en Java

Voici un exemple de programme Java qui illustre l'utilisation de certaines des méthodes de la classe `String` :

```java
public class StringExample {
    public static void main(String[] args) {
        String text = "Hello, World!";

        // Utilisation de charAt
        System.out.println("Character at index 1: " + text.charAt(1)); // 'e'

        // Utilisation de length
        System.out.println("Length of the string: " + text.length()); // 13

        // Utilisation de substring
        System.out.println("Substring from index 7: " + text.substring(7)); // "World!"

        // Utilisation de concat
        String greeting = "Hi, ";
        String name = "Alice";
        System.out.println(greeting.concat(name)); // "Hi, Alice"

        // Utilisation de equals
        String str1 = "Test";
        String str2 = "Test";
        System.out.println("str1 equals str2: " + str1.equals(str2)); // true

        // Utilisation de replace
        System.out.println("Replace 'o' with 'a': " + text.replace('o', 'a')); // "Hella, Warld!"

        // Utilisation de split
        String numbers = "1,2,3,4,5";
        String[] numArray = numbers.split(",");
        System.out.println("Split string: " + java.util.Arrays.toString(numArray)); // ["1", "2", "3", "4", "5"]

        // Utilisation de toLowerCase et toUpperCase
        System.out.println("Lower case: " + text.toLowerCase()); // "hello, world!"
        System.out.println("Upper case: " + text.toUpperCase()); // "HELLO, WORLD!"

        // Utilisation de trim
        String trimmedText = "  Hello, World!  ";
        System.out.println("Trimmed text: '" + trimmedText.trim() + "'"); // "Hello, World!"
    }
}
```

Ce programme montre comment utiliser certaines des méthodes natives de la classe `String` pour manipuler et interroger les chaînes de caractères en Java. La classe `String` est essentielle pour toute manipulation de texte en Java, et une bonne compréhension de ses méthodes est cruciale pour le développement efficace en Java.

### `StringBuilder` et `StringBuffer`

| Méthode                        | Utilité              |
| ------------------------------ | -------------------- |
| `append(String s)`             | Ajoute du texte.     |
| `insert(int offset, String s)` | Insère du texte.     |
| `delete(int start, int end)`   | Supprime une partie. |
| `reverse()`                    | Inverse la chaîne.   |

---

## 3. Méthodes des Collections (`List`, `Set`, `Map`)

### `List` (`ArrayList`, `LinkedList`)

| Méthode             | Utilité              |
| ------------------- | -------------------- |
| `add(E e)`          | Ajoute un élément.   |
| `get(int index)`    | Récupère un élément. |
| `remove(int index)` | Supprime un élément. |

### `Set` (`HashSet`, `TreeSet`)

| Méthode              | Utilité                           |
| -------------------- | --------------------------------- |
| `add(E e)`           | Ajoute un élément unique.         |
| `contains(Object o)` | Vérifie si l'élément est présent. |

### `Map` (`HashMap`, `TreeMap`)

| Méthode               | Utilité                      |
| --------------------- | ---------------------------- |
| `put(K key, V value)` | Ajoute une paire clé-valeur. |
| `get(K key)`          | Récupère une valeur.         |
| `containsKey(K key)`  | Vérifie si une clé existe.   |

---

## 4. Méthodes des Tableaux (`Arrays`)

| Méthode                                      | Utilité             |
| -------------------------------------------- | ------------------- |
| `Arrays.sort(T[] a)`                         | Trie un tableau.    |
| `Arrays.fill(T[] a, T val)`                  | Remplit un tableau. |
| `Arrays.copyOf(T[] original, int newLength)` | Copie un tableau.   |

---

## 5. Méthodes des Fichiers (`java.io`, `java.nio.file`)

| Méthode                         | Utilité                       |
| ------------------------------- | ----------------------------- |
| `File.exists()`                 | Vérifie si un fichier existe. |
| `File.createNewFile()`          | Crée un fichier.              |
| `Files.readAllBytes(Path path)` | Lit un fichier.               |

---

## 6. Méthodes des Threads (`Thread`)

| Méthode              | Utilité                          |
| -------------------- | -------------------------------- |
| `start()`            | Démarre un thread.               |
| `run()`              | Code du thread.                  |
| `sleep(long millis)` | Pause temporaire.                |
| `join()`             | Attend la fin d'un autre thread. |

---

## 7. Méthodes pour la Gestion des Dates (`java.time`)

| Méthode                    | Utilité           |
| -------------------------- | ----------------- |
| `LocalDate.now()`          | Date actuelle.    |
| `LocalTime.now()`          | Heure actuelle.   |
| `plusDays(long daysToAdd)` | Ajoute des jours. |

---

## 8. Méthodes Réseau (`java.net`)

| Méthode                    | Utilité                      |
| -------------------------- | ---------------------------- |
| `URL.openStream()`         | Ouvre un flux sur une URL.   |
| `Socket.getInputStream()`  | Flux de lecture d'un socket. |
| `Socket.getOutputStream()` | Flux d'écriture d'un socket. |

---

## 9. Méthodes Système (`System`)

| Méthode                                        | Utilité                                |
| ---------------------------------------------- | -------------------------------------- |
| `System.currentTimeMillis()`                   | Temps actuel en millisecondes.         |
| `System.nanoTime()`                            | Temps en nanosecondes.                 |
| `System.exit(int status)`                      | Quitte le programme.                   |
| `System.gc()`                                  | Suggère au GC de s'exécuter.           |
| `System.getenv(String name)`                   | Récupère une variable d'environnement. |
| `System.getProperty(String key)`               | Récupère une propriété système.        |
| `System.setProperty(String key, String value)` | Définit une propriété système.         |
| `System.out.println(String s)`                 | Affiche un message sur la console.     |
| `System.err.println(String s)`                 | Affiche un message d'erreur.           |

---

## Conclusion

Cette liste couvre les méthodes essentielles en Java. Pour approfondir une catégorie, n'hésite pas à explorer la documentation officielle de Java. 🚀
