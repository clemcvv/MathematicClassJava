package packagePaper;

public class TestEnvelope {
    public static void main(String[] args) {
        // Création de quelques papiers
        Paper paper1 = new Paper("Front 1", "Back 1");
        Paper paper2 = new Paper("Front 2", "Back 2");
        Paper paper3 = new Paper("Front 3", "Back 3");
        Paper paper4 = new Paper("Front 4", "Back 4");

        // Création d'une enveloppe avec une capacité maximale de 3 papiers
        Envelope envelope = new Envelope(3);
        
        // Affichage de l'état initial de l'enveloppe
        System.out.println("Initial state:");
        System.out.println("Envelope open: " + envelope.getOpenOrClose());
        System.out.println("Number of papers: " + envelope.getNbPaper());
        
        // Ajout de papiers à l'enveloppe
        System.out.println("\nAdding papers:");
        envelope.addPaper(paper1);
        envelope.addPaper(paper2);
        envelope.addPaper(paper3);
        envelope.addPaper(paper4); // Devrait afficher que l'enveloppe est pleine
        
        System.out.println("Number of papers: " + envelope.getNbPaper());
        
        // Affichage du contenu de l'enveloppe avant ouverture
        System.out.println("\nReading papers while envelope is closed:");
        envelope.read(); // Devrait afficher un message indiquant que l'enveloppe est fermée
        
        // Ouverture de l'enveloppe
        envelope.open();
        System.out.println("\nEnvelope opened.");
        
        // Lecture des papiers dans l'enveloppe après ouverture
        System.out.println("\nReading papers after opening:");
        envelope.read(); // Devrait afficher les papiers avant et après retournement
        
        // Fermeture de l'enveloppe
        envelope.close();
        System.out.println("\nEnvelope closed.");
        
        // Affichage de l'état final de l'enveloppe
        System.out.println("\nFinal state:");
        System.out.println("Envelope open: " + envelope.getOpenOrClose());
        System.out.println("Number of papers: " + envelope.getNbPaper());
    }
}
