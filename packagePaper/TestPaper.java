package packagePaper;

public class TestPaper {

    public static void main(String[] args) {
        // Test du constructeur
        Paper paper = new Paper("Face avant", "Face arrière");
        
        // Vérifier que la face avant est montrée par défaut
        System.out.println("Test 1 - Face montrée par défaut : " + paper.toString()); // Doit afficher "Face avant"
        
        // Retourner le papier et vérifier que la face arrière est montrée
        paper.returnPaper();
        System.out.println("Test 2 - Après retour du papier : " + paper.toString()); // Doit afficher "Face arrière"
        
        // Retourner le papier à nouveau et vérifier que la face avant est de nouveau montrée
        paper.returnPaper();
        System.out.println("Test 3 - Après un deuxième retour : " + paper.toString()); // Doit afficher "Face avant"
        
        // Tester les setters et getters
        paper.setFaceShown(false);  // Forcer la face arrière à être montrée
        System.out.println("Test 4 - Face arrière forcée : " + paper.toString()); // Doit afficher "Face arrière"
        
        paper.setFaceShown(true);  // Forcer la face avant à être montrée
        System.out.println("Test 5 - Face avant forcée : " + paper.toString()); // Doit afficher "Face avant"
    }
}
