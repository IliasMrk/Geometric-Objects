
/**
 * A Circle is a type of GeometricObject. In addition to the properties and
 * behaviours
 * of GeometricObject, it has a radius
 * 
 * @author Ilias Markou
 */
public class Circle extends GeometricObject {
    private double radius;
    private double diameter;
    private double perimeter;

    /**
     * Constructs a new circle with default value of radius as 1.0
     */

    public Circle() {
        this.radius = 1.0;
    }

    /**
     * Constructs a new circle using the variable radius
     * 
     * @param radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Constructs a new Circle using the inherited variables from the super class
     * and the radius of this Circle
     * 
     * @param radius
     * @param color
     * @param filled
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * The setRadius method sets the Circle's radius
     * 
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * accessor method get Radius
     * 
     * @return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * accessor method get Diameter
     * 
     * @return diameter
     */
    public double getDiameter() {
        diameter = (2 * radius);
        return diameter;
    }

    /**
     * accessor method get Area
     * 
     * @return area
     */
    @Override
    public double getArea() {
        return Math.pow((3.14 * radius), 2);
    }

    /**
     * accessor method get Perimeter
     * 
     * @return perimeter
     */
    @Override
    public double getPerimeter() {
        perimeter = 3.14 * diameter;
        return perimeter;
    }

    /**
     * @return String simple string showing properties of the circle
     */
    @Override
    public String toString() {
        return super.toString() + ", radius: " + radius;
    }

    /** Overriden method scale which scales the Circle based on factor variable */
    @Override
    public void scale(double factor) {

        if (factor > 0) {
            radius = factor * radius;
        }
    }

}