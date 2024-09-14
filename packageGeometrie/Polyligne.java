package packageGeometrie;

public class Polyligne {
	
	/* ATTRIBUT */
	private Point[] sommetsArray;
	
	/* CONSTRUCTEUR */
	public Polyligne(Point[] sommetsArray) {
		this.sommetsArray = sommetsArray;
	}
	
	/* GETTER */
	public Point[] getSommetsArray() {
		return this.sommetsArray;
	}
	
	/* SETTER */
	public void setSommetsArray(Point[] sommetsArray) {
		this.sommetsArray = sommetsArray;
	}
	
	/* AFFICHAGE */
	public String toString() {
		String polyligneStr = "Les sommets du polyligne : ";
		
		for (int i = 0; i < getSommetsArray().length ; i++) {	
			polyligneStr += getSommetsArray()[i].toString();
			if (i != getSommetsArray().length -1) {
				polyligneStr += " -> ";
			}
		}
		return polyligneStr;
	}
	
	/* METHODE */
	public int nbPoint() {
		return getSommetsArray().length;
	}
	
	public void translate(Vecteur v) {
	 for (int i = 0; i < nbPoint(); i++) {

	        double newX = getSommetsArray()[i].getX() + v.getPoint().getX();
	        double newY = getSommetsArray()[i].getY() + v.getPoint().getY();
	        
	        getSommetsArray()[i].setX(newX);
	        getSommetsArray()[i].setY(newY);
	 }
	}
	
	public boolean estPolygone() {
		return this.getSommetsArray()[0].confondu(this.getSommetsArray()[this.getSommetsArray().length -1]);
	}
	
	
	

}
