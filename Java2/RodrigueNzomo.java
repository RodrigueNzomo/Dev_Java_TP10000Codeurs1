public class RodrigueNzomo {
    // Constante
    private static final int NOMBRE_MAX = 100;

    public static void main(String[] args) {
        // Déclaration des variables
        final int age = 25;
        final String nom = "Alice";
        final double prix = 19.99;
        final boolean estActif = true;

        // Affichage des informations
        afficherDetails(nom, age, prix, estActif);
        
        // Affichage de la constante
        System.out.println("Nombre max: " + NOMBRE_MAX);
    }

    /**
     * Méthode pour afficher les détails d'un utilisateur
     */
    private static void afficherDetails(String nom, int age, double prix, boolean estActif) {
        // Variables
        int age = 25;
        String nom = "Alice";
        double prix = 19.99;
        boolean estActif = true;

        // Utilisation des variables et constantes
        System.out.println("Nom: " + nom);
        System.out.println("Âge: " + age);
        System.out.println("Prix: " + prix);
        System.out.println("Est actif: " + estActif);
        System.out.println("Nombre max: " + NOMBRE_MAX);
    }
}
