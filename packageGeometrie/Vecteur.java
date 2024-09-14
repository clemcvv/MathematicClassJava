package packageGeometrie;

public class Vecteur {
	private String nom;
	private Point p;
	
	/* CONSTRUCTOR */
	public Vecteur(String nom,Point p) {
		this.nom = nom;
		this.p = p;
	}
	
	/* GETTERS */
	public String getNom() {
		return this.nom;
	}
	public Point getPoint() {
		return this.p;
	}
	
	/* SETTERS */
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPoint(Point p) {
		this.p = p;
	}
	
	/* PRINT */
	public String toString() {
		return "Le vecteur " + this.getNom() + " à pour point de départ (0,0) et point d'arrivé : " + this.getPoint().toString();
	}
	
	/* METHODE */
	public void addition(Vecteur v) {
		String newNom = getNom() +"And"+v.getNom();
		double newX =getPoint().getX() + v.getPoint().getX();
		double newY =getPoint().getY() + v.getPoint().getY();
		setNom(newNom);
		getPoint().setX(newX);
		getPoint().setY(newY);
	}
	
	public double multiplication(Vecteur v) {
	    double x1 = this.getPoint().getX();
	    double y1 = this.getPoint().getY();
	    double x2 = v.getPoint().getX();
	    double y2 = v.getPoint().getY();
	    
	    return x1 * x2 + y1 * y2;
	}
	
	public double norme() {
		double somme = Math.pow(this.getPoint().getX(), 2)+Math.pow(this.getPoint().getY(), 2);
		return Math.sqrt(somme);
	}
	
    public void rotation(double angle) {
        double radians = Math.toRadians(angle); // angle en radian
        double cosAngle = Math.cos(radians);
        double sinAngle = Math.sin(radians);
        double x = this.getPoint().getX();
        double y = this.getPoint().getY();
        double rx = cosAngle * x - sinAngle * y;
        double ry = sinAngle * x + cosAngle * y;
        this.setPoint(new Point(rx, ry)); 
    }
    
    public boolean colineaire(Vecteur v) {
        final double EPSILON = 1e-10; 
        return Math.abs(this.getPoint().getX() * v.getPoint().getY() - v.getPoint().getX() * this.getPoint().getY()) < EPSILON;
    }
    
    public boolean equals(Vecteur v) {
        final double EPSILON = 1e-10; 
        return Math.abs(this.getPoint().getX() - v.getPoint().getX()) < EPSILON &&
               Math.abs(this.getPoint().getY() - v.getPoint().getY()) < EPSILON;
    }
    

}
