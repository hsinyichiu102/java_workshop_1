/**
 * 
 * @author Manfred Kerber 
 * @version 2019-09-25
 */ 


/** public class Rectangle {
	private double width;
	private double height;
    private double perimeter;
/**
 * 
 * @param width The width of the rectangle
 * @param height the height of the rectangle
 * @param perimeter the perimeter of the rectangle as 2 times the width plus the height
 */
/**	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	public double getPerimeter() {
		return perimeter;
	}
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	
	public double Perimeter() {
		return 2*(width+height);
	}
	@Override
	public String toString() {
		return "The rectangle has a width of " + width +" a height of "+ height+", and a perimeter of "+ perimeter+ ".";
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2,4);
		System.out.println(r);
		r.setHeight(5);
		System.out.println(r);
	}
}
*/

/**
 * 
 * improving the code
 * @version 2019-10-17
 * @author Hsin Yi Chiu
 *
 */

public class Rectangle {
	private double width;
	private double height;
/**
 * 
 * @param width The width of the rectangle
 * @param height the height of the rectangle
 *--- remove the constructor of the perimeter, as the perimeter number is relative with the width and length
 */
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	/**
	 * Getter for width
	 * @return the width of the rectangle
	 */
	public double getWidth() {
		return width;
	}
	/**
	 * Setter for width, the width of the rectangle will be updated
	 * @param width The new width of the rectangle
	 */
	public void setWidth(double width) {
		this.width = width;
	}
	/**
	 * Getter for height
	 * @return the height of the rectangle
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * Setter for height, the height of the rectangle will be updated
	 * @param height the new heihgt of the rectangle
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	/**
	 * A method to get the perimeter of the rectangle
	 * @return 2 times of width plus height
	 */
	public double Perimeter() {
		return 2*(width+height);
	}
	
	/**
	 * return a human readable description of the rectangle in form of the two field and return variable from perimeter method
	 */
	@Override
	public String toString() {
		return "The rectangle has a width of " + width +" a height of "+ height+", and a Perimeter of "+ Perimeter()+ ".";
	}
	/**
	 * Main method with a test of the setHeight setter and toString method
	 * @param args unused
	 */
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2,4);
		System.out.println(r);
		r.setHeight(5);
		System.out.println(r);
	}
}