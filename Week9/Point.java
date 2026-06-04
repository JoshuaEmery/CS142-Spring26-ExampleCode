/**
 * Represents a point on the Cartesian plane.
 */
public class Point {

    // Fields
    private double x;
    private double y;

    // Constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    /**
     * Calculates the distance from this point to the origin (0, 0).
     */
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    /**
     * Returns which quadrant this point falls in.
     * Returns "On Axis" if the point lies on the x or y axis.
     */
    private String quadrant() {
        if (x == 0 && y == 0) return "Origin";
        if (x == 0) return "On Y-Axis";
        if (y == 0) return "On X-Axis";
        if (x > 0 && y > 0) return "Q1";
        if (x < 0 && y > 0) return "Q2";
        if (x < 0 && y < 0) return "Q3";
        return "Q4";
    }

    /**
     * Calculates the distance between two points.
     */
    public static double distanceBetweenPoints(Point p1, Point p2) {
        double dx = p2.x - p1.x;
        double dy = p2.y - p1.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "(X: " + x + ", Y:" + y + ")";
    }
}
