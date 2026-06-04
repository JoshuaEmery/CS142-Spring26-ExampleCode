//Inheritance = an IS A relationship. A point3d IS a point
public class Point3D extends Point{
    //handle only fields that are unique to point3d
    private double z;
    //If Point3D is a point then at a minimum it must have a constructor that takes in two doubles
    public Point3D(double x, double y, double z) {
        //pass x and y up to the Point constructor
        super(x, y);
        this.z = z;

    }
    //getters and setters for x and y already exist and do not need to be repeated

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    //Distance from origin must be rewritten
    @Override
    public double distanceFromOrigin() {
        return super.distanceFromOrigin();
    }

}
