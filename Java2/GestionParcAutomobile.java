import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Classe Moto qui représente une moto avec des propriétés de base
class Moto {
    private String marque;  // La marque de la moto
    private String modele;  // Le modèle de la moto
    private int annee;      // L'année de fabrication de la moto
    private String etat;    // L'état de la moto (disponible, en livraison, en maintenance)

    // Constructeur de la classe Moto pour initialiser les attributs de la moto
    public Moto(String marque, String modele, int annee, String etat) {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
        this.etat = etat;
    }

    // Getters pour obtenir les attributs de la moto
    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public int getAnnee() {
        return annee;
    }

    public String getEtat() {
        return etat;
    }

    // Setter pour mettre à jour l'état de la moto
    public void setEtat(String etat) {
        this.etat = etat;
    }

    // Redéfinition de la méthode toString pour afficher l'état d'une moto sous forme de chaîne lisible
    @Override
    public String toString() {
        return "Moto{" +
                "marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", annee=" + annee +
                ", etat='" + etat + '\'' +
                '}';
    }
}

// Classe principale de gestion du parc automobile
public class GestionParcAutomobile {
    private List<Moto> parcMotos; // Liste qui contiendra toutes les motos du parc

    // Constructeur de la classe pour initialiser la liste des motos
    public GestionParcAutomobile() {
        this.parcMotos = new ArrayList<>();
    }

    // Méthode pour ajouter une moto au parc
    public void ajouterMoto(Moto moto) {
        parcMotos.add(moto);  // Ajout de la moto dans la liste
    }

    // Méthode pour afficher toutes les motos présentes dans le parc
    public void afficherParc() {
        for (Moto moto : parcMotos) {
            System.out.println(moto);  // Affichage des informations de chaque moto
        }
    }

    // Méthode pour changer l'état d'une moto en fonction de sa marque et de son modèle
    public void changerEtatMoto(String marque, String modele, String nouvelEtat) {
        for (Moto moto : parcMotos) {
            // Recherche de la moto en fonction de la marque et du modèle
            if (moto.getMarque().equalsIgnoreCase(marque) && moto.getModele().equalsIgnoreCase(modele)) {
                moto.setEtat(nouvelEtat);  // Mise à jour de l'état de la moto
                System.out.println("État de la moto " + marque + " " + modele + " mis à jour à : " + nouvelEtat);
                return;  // Fin de la méthode après la mise à jour
            }
        }
        // Si la moto n'est pas trouvée, message d'erreur
        System.out.println("Moto non trouvée.");
    }

    // Méthode principale pour interagir avec l'utilisateur
    public static void main(String[] args) {
        // Création d'un objet GestionParcAutomobile pour gérer le parc de motos
        GestionParcAutomobile gestion = new GestionParcAutomobile();
        Scanner scanner = new Scanner(System.in);  // Scanner pour lire les entrées de l'utilisateur

        // Boucle infinie pour afficher un menu et demander une action à l'utilisateur
        while (true) {
            // Affichage des options disponibles dans le menu
            System.out.println("1. Ajouter une moto");
            System.out.println("2. Afficher le parc de motos");
            System.out.println("3. Changer l'état d'une moto");
            System.out.println("4. Quitter");
            System.out.print("Choisissez une option : ");
            
            // Lecture du choix de l'utilisateur
            int choix = scanner.nextInt();
            scanner.nextLine(); // Consommer la nouvelle ligne après la saisie d'un entier

            // Structure switch pour gérer l'action en fonction du choix de l'utilisateur
            switch (choix) {
                case 1:
                    // Ajouter une moto au parc
                    System.out.print("Marque : ");
                    String marque = scanner.nextLine();
                    System.out.print("Modèle : ");
                    String modele = scanner.nextLine();
                    System.out.print("Année : ");
                    int annee = scanner.nextInt();
                    System.out.print("État (disponible, en livraison, en maintenance) : ");
                    String etat = scanner.next();
                    gestion.ajouterMoto(new Moto(marque, modele, annee, etat));  // Création et ajout de la moto
                    break;
                case 2:
                    // Afficher toutes les motos du parc
                    gestion.afficherParc();
                    break;
                case 3:
                    // Changer l'état d'une moto
                    System.out.print("Marque de la moto à mettre à jour : ");
                    marque = scanner.nextLine();
                    System.out.print("Modèle de la moto à mettre à jour : ");
                    modele = scanner.nextLine();
                    System.out.print("Nouvel état : ");
                    etat = scanner.nextLine();
                    gestion.changerEtatMoto(marque, modele, etat);  // Mise à jour de l'état de la moto
                    break;
                case 4:
                    // Quitter l'application
                    System.out.println("Au revoir!");
                    return;  // Sortie du programme
                default:
                    // Si l'utilisateur entre un choix invalide
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        }
    }
}
