
/**
 * A GeometricObject has a color, a dateCreated, and a boolean filled.
 *
 * @author Paul Nulty
 */

import java.util.Date;

/**
 * Geometric Object abstract class implements the Comparable and Scalable
 * interface
 * 
 * @author Ilias Markou
 */
public abstract class GeometricObject implements Comparable<GeometricObject>, Scalable {
	private String color; // The color
	private boolean filled; // Filled (true for yes)
	private Date dateCreated; // The date of creation

	/**
	 * The Comparable interface compares Geometric Objects based on area
	 * 
	 * @param GeometricObject
	 * 
	 */
	public interface Comparable<T> {
		// compare to method using placeholder
		int compareTo(T other);
	}

	/**
	 * The Scalable interface uses the scale method to scale the Object based on the
	 * variable factor
	 * For Circle,the method scale multiplies the radius by the parameter factor.
	 * For Rectangle, the scale method multiplies both the width and the height by
	 * the parameter factor.
	 * For both Circle and Rectangle, if factor ≤ 0, the values of the instance
	 * variable(s) remains unchanged.
	 * 
	 * @param factor
	 * 
	 */
	public interface Scalable {

		// Abstract method scale
		public abstract void scale(double factor);
	}

	/**
	 * Construct a default GeometricObject with color white, unfilled
	 */
	protected GeometricObject() {
		this("white", false);
	}

	/**
	 * Construct a GeometricObject with the specified color and filled value,
	 * initialise the dateCreated
	 * 
	 * @param color  color of the shape
	 * @param filled is the shape filled in - true for yes
	 */
	protected GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
		dateCreated = new Date();
	}

	/**
	 * @return String color accessor
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return boolean color accessor
	 */
	public boolean isFilled() {
		return filled;
	}

	/**
	 * @param filled set the boolean value for filled
	 */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/**
	 * @return Date date accessor
	 */
	public Date getDateCreated() {
		return dateCreated;
	}

	// Abstract method getArea
	public abstract double getArea();

	// Abstract method getPerimeter
	public abstract double getPerimeter();

	/**
	 * The compareTo method overrides the Comparable interface's method to compare
	 * Geometric Objects based on area
	 * 
	 * @param GeometricObject
	 */
	@Override
	public int compareTo(GeometricObject o) {
		if (this.getArea() < o.getArea()) {
			return -1;
		} else if (this.getArea() > o.getArea()) {
			return 1;
		} else {
			return 0;
		}
	}

	/**
	 * @return String return a string describing the GeometricObject
	 */
	@Override
	public String toString() {
		return "created: " + dateCreated + ", color: " + color + ", filled: " + filled;
	}

}
