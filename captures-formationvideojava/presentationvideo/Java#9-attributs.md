# 📌 Les Attributs, Constructeurs et Bonnes Pratiques en Java

## 1️⃣ **Les Attributs en Java**
### 🔹 Définition
Un **attribut** (ou **champ**) est une variable déclarée dans une classe pour stocker l'état d'un objet.

### 🔹 Déclaration d'un Attribut
```java
public class Chat {
    private String nom;
    private int age;
}
```

### 🔹 Modificateurs d'Accès
| Modificateur  | Accessibilité |
|--------------|---------------|
| `private`    | Accessible uniquement dans la classe |
| `protected`  | Accessible dans le même package et par héritage |
| `public`     | Accessible partout |
| *(default)*  | Accessible uniquement dans le package |

### 🔹 Accès aux Attributs avec Getters et Setters
Pour respecter **l'encapsulation**, on utilise des méthodes d'accès.
```java
public class Chat {
    private String nom;
    private int age;
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
```

---

## 2️⃣ **Les Constructeurs en Java**
### 🔹 Définition
Un **constructeur** est une méthode spéciale appelée lors de la création d'un objet.

### 🔹 Déclaration d'un Constructeur
```java
public class Chat {
    private String nom;
    private int age;
    
    // Constructeur
    public Chat(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
}
```

### 🔹 Constructeur par Défaut
Si aucun constructeur n'est défini, Java crée un constructeur sans argument :
```java
public class Chat {
    public Chat() {
        System.out.println("Un chat est créé !");
    }
}
```

### 🔹 Surcharge des Constructeurs
On peut définir plusieurs constructeurs avec des paramètres différents (**surcharge**).
```java
public class Chat {
    private String nom;
    private int age;
    
    public Chat() {
        this("Inconnu", 0);
    }
    
    public Chat(String nom) {
        this(nom, 0);
    }
    
    public Chat(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
}
```

---

## 3️⃣ **Bonnes Pratiques sur les Attributs et Constructeurs**

✅ **Encapsulation** : Toujours rendre les attributs `private` et utiliser des getters/setters.
✅ **Immutabilité** : Utiliser `final` pour empêcher la modification après initialisation.
✅ **Respecter le principe DRY** : Utiliser `this()` dans les constructeurs pour éviter la duplication de code.
✅ **Initialisation propre** : Toujours initialiser les attributs soit dans le constructeur, soit avec des valeurs par défaut.

---

## 4️⃣ **Exemple Complet**
```java
public class Chat {
    private String nom;
    private int age;
    
    public Chat() {
        this("Sans nom", 0);
    }
    
    public Chat(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
    
    public String getNom() {
        return nom;
    }
    
    public int getAge() {
        return age;
    }
    
    public static void main(String[] args) {
        Chat minou = new Chat("Minou", 3);
        System.out.println("Nom: " + minou.getNom() + ", Age: " + minou.getAge());
    }
}
```

**🔹 Résultat de l'exécution** :
```
Nom: Minou, Age: 3
```

---

🚀 **Avec ces concepts, vous pouvez structurer votre code Java proprement et efficacement !**

# 📌 Les Attributs en Java : Notions Complètes

## 1️⃣ **Qu'est-ce qu'un Attribut en Java ?**
Un **attribut** (ou **champ**) est une variable déclarée dans une classe pour stocker l'état d'un objet.

### 🔹 Déclaration d'un Attribut
```java
public class Chat {
    private String nom;
    private int age;
}
```

---

## 2️⃣ **Modificateurs d'Accès des Attributs**

| Modificateur  | Accessibilité |
|--------------|---------------|
| `private`    | Accessible uniquement dans la classe |
| `protected`  | Accessible dans le même package et par héritage |
| `public`     | Accessible partout |
| *(default)*  | Accessible uniquement dans le package |

---

## 3️⃣ **Encapsulation et Accès aux Attributs**

### 🔹 Pourquoi utiliser l'encapsulation ?
L'encapsulation protège les données et empêche l'accès direct aux attributs. Cela permet :
- D'éviter des modifications involontaires.
- De contrôler l'accès avec des méthodes spécifiques.

### 🔹 Utilisation des Getters et Setters
```java
public class Chat {
    private String nom;
    private int age;
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}
```

---

## 4️⃣ **Attributs Statics et Constants**

### 🔹 Attribut `static`
Un attribut `static` appartient à la classe et non à l'instance.
```java
public class Chat {
    public static int nombreDeChats = 0;
    
    public Chat() {
        nombreDeChats++;
    }
}
```

### 🔹 Attribut `final` (Constante)
Un attribut déclaré `final` ne peut pas être modifié après initialisation.
```java
public class Chat {
    public static final String ESPECE = "Félin";
}
```

---

## 5️⃣ **Bonnes Pratiques pour les Attributs en Java**

✅ Toujours utiliser `private` pour protéger les attributs.
✅ Utiliser des getters et setters pour l'accès aux données.
✅ Préférer `final` pour les valeurs constantes.
✅ Utiliser `static` si un attribut est partagé entre toutes les instances.
✅ Respecter les conventions de nommage (`camelCase`).

---

## 6️⃣ **Exemple Complet**
```java
public class Chat {
    private String nom;
    private int age;
    public static int nombreDeChats = 0;
    public static final String ESPECE = "Félin";
    
    public Chat(String nom, int age) {
        this.nom = nom;
        this.age = age;
        nombreDeChats++;
    }
    
    public String getNom() {
        return nom;
    }
    
    public int getAge() {
        return age;
    }
    
    public static int getNombreDeChats() {
        return nombreDeChats;
    }
    
    public static void main(String[] args) {
        Chat minou = new Chat("Minou", 3);
        Chat felix = new Chat("Felix", 2);
        
        System.out.println("Nom: " + minou.getNom() + ", Age: " + minou.getAge());
        System.out.println("Nombre total de chats: " + Chat.getNombreDeChats());
    }
}
```

**🔹 Résultat de l'exécution** :
```
Nom: Minou, Age: 3
Nombre total de chats: 2
```

---

🚀 **Avec ces notions, vous maîtrisez parfaitement les attributs en Java !**

