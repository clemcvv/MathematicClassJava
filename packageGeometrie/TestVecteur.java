package packageGeometrie;

public class TestVecteur {
    public static void main(String[] args) {
        // Création de points pour les vecteurs
        Point p1 = new Point(3.0, 4.0);
        Point p2 = new Point(1.0, 2.0);
        
        // Création des vecteurs
        Vecteur v1 = new Vecteur("V1", p1);
        Vecteur v2 = new Vecteur("V2", p2);
        
        // Test de la méthode toString()
        System.out.println("Test toString() :");
        System.out.println(v1.toString()); // Attendu : Le vecteur V1 a pour point de départ (0,0) et point d'arrivée (3.0, 4.0)
        
        
        // Test de la méthode multiplication()
        System.out.println("Test multiplication() :");
        double produitScalaire = v1.multiplication(v2);
        System.out.println(produitScalaire); // Attendu : 3.0 * 1.0 + 4.0 * 2.0 = 11.0
        
        
        // Test de la méthode addition() : Modification de v1
        System.out.println("Test addition() :");
        v1.addition(v2);
        System.out.println(v1.toString()); // Attendu : Le vecteur V1AndV2 a pour point de départ (0,0) et point d'arrivée (4.0, 6.0)

        // Test de la méthode norme()
        System.out.println("Test norme() :");
        double normeV1 = v1.norme(); // Note : v1 a été modifié par addition(), donc le résultat peut ne pas correspondre à l'état initial
        System.out.println(normeV1); // Attendu : √(4.0² + 6.0²) = 7.211
        
        // Test de la méthode rotation()
        System.out.println("Test rotation() :");
        v1.rotation(90); // Rotation de 90 degrés
        System.out.println(v1.toString()); // Attendu : Le vecteur V1AndV2 a pour point de départ (0,0) et point d'arrivée (-6.0, 4.0)
        
        // Création des points
        Point p8 = new Point(2.0, 3.0);
        Point p9 = new Point(4.0, 6.0); // Proportionnel à p8

        
        // Création des vecteurs
        Vecteur v6 = new Vecteur("V6", p8);
        Vecteur v7 = new Vecteur("V7", p9);
        
        // Test de la méthode colineaire()
        System.out.println("Test colineaire() :");
        System.out.println(v6.colineaire(v7)); // Attendu : true

        // Test de la méthode equals()
        System.out.println("Test equals() :");
        Vecteur v5 = new Vecteur("V5", new Point(-6.0, 4.0)); // Même point que après rotation de v1
        System.out.println(v1.equals(v5)); // Attendu : true
    }
}
