package packageGeometrie;

public class TestPolyligne {

    public static void main(String[] args) {
        // Création de quelques points
        Point p1 = new Point(0, 0);
        Point p2 = new Point(2, 3);
        Point p3 = new Point(4, 6);
        Point p4 = new Point(0, 0); // Fermeture de la polyligne (polygone)

        // Création d'une polyligne avec ces points
        Point[] points = {p1, p2, p3, p4}; 
        Polyligne polyligne = new Polyligne(points);

        // Test de la méthode toString
        System.out.println(polyligne.toString());

        // Test de la méthode estPolygone()
        System.out.println("Test estPolygone() : " + polyligne.estPolygone());
        // Résultat attendu : true

        // Test de la méthode nbPoint() : doit retourner 4
        System.out.println("Test nbPoint() : " + polyligne.nbPoint());
        // Résultat attendu : 4

        // Création d'une nouvelle polyligne avec un point supplémentaire
        Point p5 = new Point(7, 1); // Point différent du premier
        Point[] pointsNonFerme = {p1, p2, p3, p4, p5}; // 5 points cette fois
        Polyligne polyligneNonFermee = new Polyligne(pointsNonFerme);

        // Test de la méthode nbPoint() sur la polyligne avec 5 points
        System.out.println("Test nbPoint() sur polyligne avec 5 points : " + polyligneNonFermee.nbPoint());
        // Résultat attendu : 5
    }
}
