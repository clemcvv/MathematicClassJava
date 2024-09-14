package packageGeometrie;

public class Segment {
	
	/* VALUE */
    private Point point1;
    private Point point2;

    /* CONSTRUCTOR */
    public Segment(Point p1, Point p2) {
        this.point1 = p1;
        this.point2 = p2;
    }

    /* GETTERS */
    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    /* SETTERS */
    public void setPoint1(Point p) {
        this.point1 = p;
    }

    public void setPoint2(Point p) {
        this.point2 = p;
    }
    
    /* PRINTER */
    public String toString() {
        return "Segment de " + point1.toString() + " à " + point2.toString();
    }
    
    /* METHODE */
    public double longueur() {
        return getPoint1().distance(getPoint2());
    }


}

