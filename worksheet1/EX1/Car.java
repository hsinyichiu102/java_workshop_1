/**
 * Writing a Car class with four field
 * @author Hsin Yi Chiu
 * @version 2019-10-15
 */
public class Car {
	
	private String make;
	private int price;
	private int maxSpeed;
	private String colour;
	
	/**
	 * a constructor of the Car to define the the param
	 * @param make is a String to get the car maker/brand
	 * @param price is a int to get the value of the car
	 * @param maxSpeed is a int to get the maximum speed of the car
	 * @param colour is the String to get the surface colour of the car
	 */
	public Car(String make, int price, int maxSpeed, String colour) {
		this.make = make;
		this.price = price;
		this.maxSpeed = maxSpeed;
		this.colour = colour;
	}

	/**
	 * Getter for make
	 * @return make to get the brand of the car
	 */
	public String getMake() {
		return make;
	}

	/**
	 * Setter for make
	 * @param make to set a new brand of the car
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * Getter for price
	 * @return price to get the value of the car
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * Setter for price
	 * @param price to set a new value of the car
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * Getter for maxSpeed
	 * @return maxSpeed to get the maximum speed of the car
	 */
	public int getMaxSpeed() {
		return maxSpeed;
	}

	/**
	 * Setter for maxSpeed
	 * @param maxSpeed to set a new maximum speed of the car
	 */
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	/**
	 * 	Getter for colour
	 * @return colour to get the colour of the car
	 */
	public String getColour() {
		return colour;
	}

	/**
	 * Setter for colour
	 * @param colour to set a new colour of the car
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}

	/**
	 * using a human readable description to present the car in form of the four field variable
	 */
	@Override
	public String toString() {
		return "the bran of the car is "+make+". its price is "+price+". "
				+ "the maximum speed of the car is "+maxSpeed+" and the colour is "+colour+".";
	}
	
	/**
	 * main method with the test of toString method
	 * @param args unused
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car("BMW",1000,200,"Black");
		
		System.out.println(car.toString());

	}

}