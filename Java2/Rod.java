public class Rod {
    // Constante d'instance
    private final int NOMBRE_MAX = 100;

    public static void main(String[] args) {
        // Créer une instance de la classe
        Rod instance = new Rod();
        // Accéder à la constante via l'instance
        System.out.println("Nombre max: " + instance.NOMBRE_MAX);
    }
}
