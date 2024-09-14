package packageGeometrie;

public class TestSegment {

    public static void main(String[] args) {
        // Création de deux points
        Point point1 = new Point(1.0, 2.0);
        Point point2 = new Point(4.0, 6.0);
        
        // Création d'un segment avec les deux points
        Segment segment = new Segment(point1, point2);
        
        // Test du toString()
        System.out.println("Description du segment : " + segment);
        // Résultat attendu : Description du segment : Segment de Point de coordonnée x 1.0 et coordonnée y 2.0. à Point de coordonnée x 4.0 et coordonnée y 6.0.
        
        // Test de la méthode longueur
        System.out.println("Longueur du segment : " + segment.longueur());
        // Calcul : distance = sqrt((4.0 - 1.0)^2 + (6.0 - 2.0)^2) = sqrt(9 + 16) = sqrt(25) = 5
        // Résultat attendu : Longueur du segment : 5
        
        // Modifications des points du segment
        Point point3 = new Point(0.0, 0.0);
        Point point4 = new Point(3.0, 4.0);
        segment.setPoint1(point3);
        segment.setPoint2(point4);
        
        // Affichage du nouveau segment
        System.out.println("Nouveau segment : " + segment);
        // Résultat attendu : Nouveau segment : Segment de Point de coordonnée x 0.0 et coordonnée y 0.0. à Point de coordonnée x 3.0 et coordonnée y 4.0.
        
        // Recalcul de la longueur avec les nouveaux points
        System.out.println("Nouvelle longueur du segment : " + segment.longueur());
        // Calcul : distance = sqrt((3.0 - 0.0)^2 + (4.0 - 0.0)^2) = sqrt(9 + 16) = sqrt(25) = 5
        // Résultat attendu : Nouvelle longueur du segment : 5
    }
}
