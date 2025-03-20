Voici des notes détaillées sur la lecture au clavier en Java, incluant les bonnes pratiques et des exemples de code.

📌 1. Lire l'entrée utilisateur en Java
En Java, on peut lire des entrées clavier en utilisant plusieurs classes :
✔ Scanner (facile à utiliser, recommandé)
✔ BufferedReader (plus performant pour de gros volumes de texte)
✔ Console (utilisé principalement en mode console)

📌 2. Lire une entrée avec Scanner (Recommandé)
Scanner est la manière la plus simple pour lire du texte ou des nombres entrés par l'utilisateur.

🏷 Exemple : Lire une chaîne et un nombre
java
Copier le code
import java.util.Scanner; // Import de Scanner

public class LectureClavier {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in); // Création d'un Scanner

        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine();  // Lecture d'une ligne

        System.out.print("Entrez votre âge : ");
        int age = scanner.nextInt();  // Lecture d'un entier

        System.out.println("Bonjour " + nom + ", vous avez " + age + " ans.");
        scanner.close();  // Toujours fermer le Scanner
    }

}
✅ Bonnes pratiques :

Toujours fermer le Scanner avec scanner.close().
Utiliser nextLine() après nextInt() pour éviter des bugs d’entrée clavier.
📌 3. Lire avec BufferedReader (Alternative efficace)
BufferedReader est plus rapide et consomme moins de mémoire. Il fonctionne avec InputStreamReader.

🏷 Exemple : Lire un texte
java
Copier le code
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LectureBuffered {
public static void main(String[] args) throws IOException {
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Entrez votre ville : ");
        String ville = reader.readLine();  // Lecture d'une ligne

        System.out.println("Vous habitez à " + ville + ".");
    }

}
✅ Bonnes pratiques :

BufferedReader est plus performant que Scanner pour lire plusieurs lignes.
Nécessite de gérer les exceptions (throws IOException).
📌 4. Lire avec Console (Mode Console)
Console est utile si le programme est exécuté dans un terminal.

🏷 Exemple : Lire un mot de passe sans l'afficher
java
Copier le code
import java.io.Console;

public class LectureConsole {
public static void main(String[] args) {
Console console = System.console();
if (console == null) {
System.out.println("Aucune console détectée.");
return;
}

        String user = console.readLine("Nom d'utilisateur : ");
        char[] password = console.readPassword("Mot de passe : ");

        System.out.println("Utilisateur : " + user);
    }

}
✅ Bonnes pratiques :

console.readPassword() masque les entrées sensibles comme les mots de passe.
Ne fonctionne pas avec les IDE comme Eclipse, mais seulement en ligne de commande.
📌 5. Tableau comparatif des méthodes
Méthode Facilité Performance Lire du texte Lire un nombre Sécurité
Scanner ✅✅✅ ✅✅ ✅✅✅ ✅✅✅ ❌
BufferedReader ✅✅ ✅✅✅ ✅✅✅ ✅ ❌
Console ✅ ✅✅ ✅✅ ✅ ✅✅✅
📌 6. Astuces et Bonnes Pratiques
✅ Utiliser Scanner pour la simplicité et BufferedReader pour la performance.
✅ Fermer les flux (scanner.close(), reader.close()).
✅ Utiliser console.readPassword() pour les mots de passe.
✅ Gérer les exceptions (try-catch) pour éviter les erreurs.
