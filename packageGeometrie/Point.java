package packageGeometrie;

public class Point {
	
	/* VALUE */
	private double x;
	private double y;
	
	/* CONSRUCTOR */
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/* GETTERS */
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	/* SETTERS */
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	/* PRINTER */
    public String toString() {
        return "Point de coordonnée x " + this.getX() + " et coordonnée y " + this.getY() +".";
    }
	
	/* METHODE */
	public boolean confondu(Point p) {
		return this.getX() == p.getX() && this.getY() == p.getY();
	}
	
	public int distance(Point p) {
		double subtractionX = Math.pow(this.getX() - p.getX(), 2);
		double subtractionY = Math.pow(this.getY() - p.getY(), 2);
		double distance = Math.sqrt(subtractionX + subtractionY);
		return (int) distance;
	}
	
}
