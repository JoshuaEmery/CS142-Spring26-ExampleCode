//It is possible for one object to contain instance of other object
//This is a HAS A relationship. A line HAS A POINT
//This is referred to as object containment
public class Line {

    //A line is defined by two points on the Cartesian plane
    private Point p1;
    private Point p2;

    //There are two basic ways to implement this.
    //Containment by Composition (STRONG OWNERSHIP)
    //The corresponding points live and die within the line and do not exist outside of the line
    //The line is responsible for creating and managing its own points
    public Line(double x1, double y1, double x2, double y2) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }

    //Containment by Aggregation (Weak Ownership)
    //Points exist outside of the line and are passed to the constructor
    //The line references the points but does not own them
    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    //Getters
    //Since Point is an object, if I expose it through a getter IT CAN be changed
    //Additionally if you are doing Containment by Composition, you would NOT expose these.
    //Remember the idea of Containment by Composition is that contained class should not exist outside
    //This is an important distinction from returning a primitive like int or double and is easy to miss
    //If I call this method I get a REFERENCE to the point which means I can change it
    public Point getP1() { return p1; }
    public Point getP2() { return p2; }

    //If you need to prevent them from changing it, instead return the primitives directly
    //This is how you would do Containment by Composition
    //Now the caller gets a copy of the value — there is no reference to the internal object
    //Changes to these values have no effect on the Line's internal state
    public double getX1() { return p1.getX(); }
    public double getY1() { return p1.getY(); }
    public double getX2() { return p2.getX(); }
    public double getY2() { return p2.getY(); }

    //Length is calculated using the distance formula
    //We delegate to Point's static method rather than rewriting the formula
    public double length() {
        return Point.distanceBetweenPoints(p1, p2);
    }

    //Slope is rise over run: change in y divided by change in x
    //A vertical line has no defined slope, so we return NaN (Not a Number)
    //Callers can check for this with Double.isNaN()
    public double slope() {
        double dx = p2.getX() - p1.getX();
        double dy = p2.getY() - p1.getY();
        if (dx == 0) return Double.NaN;
        return dy / dx;
    }

    //The midpoint is the average of the x coordinates and the average of the y coordinates
    //This returns a brand new Point object — another example of object creation inside a method
    public Point midpoint() {
        double midX = (p1.getX() + p2.getX()) / 2.0;
        double midY = (p1.getY() + p2.getY()) / 2.0;
        return new Point(midX, midY);
    }

    //By default equals() checks if two variables point to the same object in memory
    //We override it to define what equality actually means for a Line
    //Two lines are equal if their endpoints have the same coordinates
    //We compare the primitives directly rather than the Point objects
    //This avoids relying on Point's equals behavior — we stay in control of the comparison
    @Override
    public boolean equals(Object obj) {
        if ( this.getClass() != obj.getClass()){
            return false;
        }
        Line other = (Line) obj;
        //return this.p1 == other.p1 && this.p2 == other.p2;
        return getX1() == other.getX1() &&
                getY1() == other.getY1() &&
                getX2() == other.getX2() &&
                getY2() == other.getY2();
    }

    //toString lets us print a Line object in a readable format
    //It relies on Point's toString method to print each endpoint
    @Override
    public String toString() {
        return "Line[" + p1 + " -> " + p2 + "]";
    }
}
