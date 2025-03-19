# 📌 Introduction au Langage Java et Installation sur Ubuntu & Windows

## 🔷 Introduction

Java est un langage de programmation orienté objet, développé par Sun Microsystems en 1995 et racheté par Oracle en 2010. Il est utilisé pour des applications multiplateformes, du développement web, mobile et d'entreprise.

## 🚀 Caractéristiques Clés de Java

1. **Portabilité** : "Write Once, Run Anywhere" (WORA), exécution via la JVM.
2. **Programmation Orientée Objet (POO)** : Encapsulation, héritage, polymorphisme.
3. **Gestion Automatique de la Mémoire** : Garbage Collector.
4. **Écosystème riche** :
   - Java SE (Standard Edition) : Applications générales.
   - Java EE (Enterprise Edition / Jakarta EE) : Applications d'entreprise.
   - JavaFX : Interfaces graphiques.
5. **Sécurité** : Gestion des accès et protection des données.

---

## 🖥️ Installation et Configuration

### 🔹 Installation sous Ubuntu (avec OpenJDK et Eclipse)

#### 📌 Étape 1 : Installation d'OpenJDK

```bash
sudo apt update
sudo apt install openjdk-17-jdk -y
```

✅ Vérification de l'installation :

```bash
java -version
```

#### 📌 Étape 2 : Installation de l'IDE Eclipse

1. Télécharger Eclipse :

```bash
sudo snap install eclipse --classic
```

2. Lancer Eclipse :

```bash
eclipse &
```

#### 📌 Étape 3 : Installation des Extensions Recommandées pour Eclipse

- **Eclipse Java Development Tools (JDT)** : Développement Java.
- **Maven Integration for Eclipse** : Gestion de dépendances.
- **Spring Tools 4 for Eclipse** : Développement Spring.
- **Eclipse Marketplace Client** : Installation d’autres plugins.

### 🔹 Installation sous Windows (avec Java SE et VS Code)

#### 📌 Étape 1 : Installation de Java SE

1. Télécharger Java SE depuis [Oracle](https://www.oracle.com/java/technologies/javase-downloads.html)
2. Installer et configurer la variable d'environnement `JAVA_HOME` :
   - Aller dans **Paramètres système avancés** > **Variables d’environnement**.
   - Ajouter `JAVA_HOME` avec le chemin du JDK installé.
   - Ajouter `%JAVA_HOME%\bin` dans la variable `Path`.
     ✅ Vérification de l'installation :

```powershell
java -version
```

#### 📌 Étape 2 : Installation de Visual Studio Code

1. Télécharger et installer [VS Code](https://code.visualstudio.com/).
2. Installer les extensions suivantes :
   - **Extension Pack for Java** (Microsoft) 📌 _Indispensable pour le développement Java._
   - **Debugger for Java** 🔍 _Outils de débogage._
   - **Maven for Java** 🏗️ _Gestion des dépendances avec Maven._
   - **Spring Boot Extension Pack** 🌱 _Développement avec Spring Boot._
   - **Checkstyle for Java** ✅ _Analyse du code Java._

---

## 🔥 Comparatif Ubuntu vs Windows

| Critère            | Ubuntu (OpenJDK + Eclipse) | Windows (Java SE + VS Code)                      |
| ------------------ | -------------------------- | ------------------------------------------------ |
| Version Java       | OpenJDK 17+                | Java SE 17+                                      |
| IDE                | Eclipse                    | VS Code                                          |
| Extensions         | JDT, Maven, Spring Tools   | Extension Pack for Java, Debugger, Maven, Spring |
| Gestion de mémoire | Garbage Collector          | Garbage Collector                                |
| Performance        | Légèrement plus rapide     | Compatible, mais plus lourd                      |

---

## 🎯 Conclusion

Que vous soyez sous **Ubuntu avec OpenJDK et Eclipse** ou **Windows avec Java SE et VS Code**, Java reste un langage incontournable avec un écosystème puissant. L'installation et la configuration varient légèrement selon l'OS, mais les outils permettent un développement fluide et efficace. 🚀

📌 **Mots-clés** : JVM, OpenJDK, Java SE, Eclipse, VS Code, Spring Boot, Maven, POO, Debugging.
