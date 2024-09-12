package PackageGeometrie;

public class Point {
	
	/* VALUE */
	double x;
	double y;
	int nbPoints = 0;
	
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
        return "Point de coordonnée x " + this.x + " et coordonnée y " + this.y +".";
    }
	
	/* METHODE */
	public boolean confondu(Point p) {
		return this.x == p.x && this.y == p.y;
	}
	
	public int distance(Point p) {
		double subtractionX = Math.pow(this.x - p.x, 2);
		double subtractionY = Math.pow(this.y - p.y, 2);
		double distance = Math.sqrt(subtractionX + subtractionY);
		return (int) distance;
	}
	
}
