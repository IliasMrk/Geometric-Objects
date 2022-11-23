import javax.imageio.plugins.tiff.GeoTIFFTagSet;
import javax.swing.text.DefaultStyledDocument.ElementSpec;

/**
 * The Rotatable interface uses the rotate method to rotate a Rectangle object
 * 90degrees
 */
interface Rotatable {
	// abstract method rotate
	public abstract void rotate();

}

/**
 * A Rectangle is a type of GeometricObject. In addition to the properties and
 * behaviours
 * of GeometricObject, it has a height and a width
 * 
 * @author Paul Nulty
 */

public class Rectangle extends GeometricObject implements Rotatable {
	private double width; // The width of a rectangle
	private double height; // The height of a rectangle

	/**
	 * Construct a default rectangle object with height 1.0 and width 1.0
	 */
	public Rectangle() {
		this(1.0, 1.0);
	}

	/**
	 * Construct a rectangle object with the specified width, height, color and
	 * filled value
	 * 
	 * @param width  width of the rectangle
	 * @param height height of the rectangle
	 */
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	/**
	 * Construct a rectangle object with the specified width, height, color and
	 * filled value
	 * 
	 * @param width  width of the rectangle
	 * @param height height of the rectangle
	 * @param color  color of the rectangle
	 * @param filled initial filled value of the rectangle
	 */
	public Rectangle(double width, double height, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.height = height;
	}

	/**
	 * @return double width accessor
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * @return double height accessor
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return double area of the rectangle
	 */
	@Override
	public double getArea() {
		return width * height;
	}

	/**
	 * @return double perimeter of the rectangle
	 */
	@Override
	public double getPerimeter() {
		return 2 * (width + height);
	}

	/**
	 * @return String simple string showing properties of the rectangle
	 */
	@Override
	public String toString() {
		return super.toString() + ", width: " + width + ", height: " + height;
	}

	/** Rotatates the rectangle by 90degrees (by swapping the height with width) */
	@Override
	public void rotate() {

		double newHeight = this.width;
		this.width = getHeight();
		this.height = newHeight;
	}

	/**
	 * Overriden method scale which scales the Rectangle based on factor variable
	 */
	@Override
	public void scale(double factor) {

		if (factor > 0) {
			this.width = (this.width * factor);
			this.height = (this.height * factor);
		}
	}
}
