# Les Boucles en Java

En Java, les boucles permettent d'exécuter un bloc de code plusieurs fois tant qu'une condition est satisfaite. Il existe plusieurs types de boucles : `for`, `while`, `do-while`. De plus, les instructions `break` et `continue` permettent de contrôler le déroulement des boucles.

## 1. La boucle `for`

La boucle `for` est utilisée lorsqu'on connaît à l'avance le nombre d'itérations.

### Syntaxe :

```java
for (initialisation; condition; incrémentation) {
    // Instructions
}
```

### Exemple :

```java
public class BoucleFor {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration : " + i);
        }
    }
}
```

#### Sortie :

```
Iteration : 0
Iteration : 1
Iteration : 2
Iteration : 3
Iteration : 4
```

## 2. La boucle `while`

La boucle `while` est utilisée lorsque le nombre d'itérations n'est pas connu à l'avance et dépend d'une condition.

### Syntaxe :

```java
while (condition) {
    // Instructions
}
```

### Exemple :

```java
public class BoucleWhile {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println("Iteration : " + i);
            i++;
        }
    }
}
```

#### Sortie :

```
Iteration : 0
Iteration : 1
Iteration : 2
Iteration : 3
Iteration : 4
```

## 3. La boucle `do-while`

La boucle `do-while` fonctionne comme `while`, mais garantit qu'au moins une itération sera exécutée.

### Syntaxe :

```java
do {
    // Instructions
} while (condition);
```

### Exemple :

```java
public class BoucleDoWhile {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("Iteration : " + i);
            i++;
        } while (i < 5);
    }
}
```

#### Sortie :

```
Iteration : 0
Iteration : 1
Iteration : 2
Iteration : 3
Iteration : 4
```

## 4. L'instruction `break`

L'instruction `break` permet de sortir prématurément d'une boucle.

### Exemple :

```java
public class BreakExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("Iteration : " + i);
        }
    }
}
```

#### Sortie :

```
Iteration : 0
Iteration : 1
Iteration : 2
Iteration : 3
Iteration : 4
```

## 5. L'instruction `continue`

L'instruction `continue` permet de sauter une itération et de passer directement à la suivante.

### Exemple :

```java
public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("Iteration : " + i);
        }
    }
}
```

#### Sortie :

```
Iteration : 0
Iteration : 1
Iteration : 2
Iteration : 3
Iteration : 4
Iteration : 6
Iteration : 7
Iteration : 8
Iteration : 9
```

(Nous avons sauté l'affichage de `Iteration : 5`.)

## 6. Différences entre les boucles `for`, `while`, et `do-while`

| Type de boucle | Utilisation principale                              | Exécution minimale                  |
| -------------- | --------------------------------------------------- | ----------------------------------- |
| `for`          | Quand on connaît le nombre d'itérations             | 0 si condition fausse dès le départ |
| `while`        | Quand le nombre d'itérations dépend d'une condition | 0 si condition fausse dès le départ |
| `do-while`     | Quand on veut exécuter au moins une fois            | Au moins 1 fois                     |

## Conclusion

Les boucles sont essentielles en Java pour automatiser les répétitions d'instructions. Le choix entre `for`, `while` et `do-while` dépend du contexte. Les instructions `break` et `continue` offrent plus de contrôle sur l'exécution des boucles.
