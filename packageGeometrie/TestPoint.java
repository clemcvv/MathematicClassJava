package packageGeometrie;

public class TestPoint {

    public static void main(String[] args) {
        // Création de deux points
        Point point1 = new Point(3.0, 4.0);
        Point point2 = new Point(6.0, 8.0);
        
        // Test des getters
        System.out.println("Point 1: " + point1);
        // Résultat attendu : Point de coordonnée x 3.0 et coordonnée y 4.0.
        
        System.out.println("Point 2: " + point2);
        // Résultat attendu : Point de coordonnée x 6.0 et coordonnée y 8.0.
        
        // Test de la méthode confondu
        System.out.println("Les points sont confondus ? " + point1.confondu(point2));
        // Résultat attendu : Les points sont confondus ? false
        
        Point point3 = new Point(3.0, 4.0);
        System.out.println("Les points sont confondus ? " + point1.confondu(point3));
        // Résultat attendu : Les points sont confondus ? true
        
        // Test de la méthode distance
        System.out.println("Distance entre Point 1 et Point 2 : " + point1.distance(point2));
        // Calcul : distance = sqrt((6.0 - 3.0)^2 + (8.0 - 4.0)^2) = sqrt(9 + 16) = sqrt(25) = 5
        // Résultat attendu : Distance entre Point 1 et Point 2 : 5
        
        // Modifications des coordonnées du point1
        point1.setX(1.0);
        point1.setY(1.0);
        System.out.println("Nouvelles coordonnées de Point 1 : " + point1);
        // Résultat attendu : Nouvelles coordonnées de Point 1 : Point de coordonnée x 1.0 et coordonnée y 1.0.
        
        // Recalcul de la distance avec les nouvelles coordonnées
        System.out.println("Nouvelle distance entre Point 1 et Point 2 : " + point1.distance(point2));
        // Calcul : distance = sqrt((6.0 - 1.0)^2 + (8.0 - 1.0)^2) = sqrt(25 + 49) = sqrt(74) ≈ 8
        // Résultat attendu : Nouvelle distance entre Point 1 et Point 2 : 8
    }
}
