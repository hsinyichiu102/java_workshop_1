/**
 * Write a class Aircraft.java with the two field variables
passengerNumber and maxSpeed both of type int 
with a standard constructor, getter(s), setter(s), and a toString method. 
 * @author HSIN YI CHIU
 * @version 2019-11-14
 *
 */
public class Aircraft {
	
	private int passengerNumber;
	private int maxSpeed;
	/**
	 * a constructor for the aircraft with two integer variable
	 * @param passengerNumber is a integer variable of the passenger's number
	 * @param maxSpeed is a integer variable of the maximum Speed
	 */
	public Aircraft(int passengerNumber, int maxSpeed) {
		super();
		this.passengerNumber = passengerNumber;
		this.maxSpeed = maxSpeed;
	}
	
	/**
	 * a getter to get the passengers's number
	 * @return passengerNumber to have the number of the passenger
	 */
	public int getPassengerNumber() {
		return passengerNumber;
	}
	
	/**
	 * a setter to set a new number of the passenger
	 * @param passengerNumber to set a new number for the passenger
	 */
	public void setPassengerNumber(int passengerNumber) {
		this.passengerNumber = passengerNumber;
	}
	
	/**
	 * a getter to get the maximum speed of the aircraft
	 * @return maxSpeed to get the speed of the aircraft
	 */
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	/**
	 * a setter to set the new maxSpeed
	 * @param maxSpeed to set a new speed of the aircraft
	 */
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	/**
	 * a String using human readable way to display the information of the aircraft
	 */
	@Override
	public String toString() {
		return "Aircraft:\n passengerNumbe: " + passengerNumber + "\n maxSpeed: " + maxSpeed+"\n";
	}
	
	/**
	 * to test the method of aircraft and aeroplane
	 * @param args unused
	 */
	public static void main(String[]args) {
		 Aircraft aircraft1 = new Aircraft(300, 870);
		 System.out.print(aircraft1);
		 Aeroplane aircraft2 = new Aeroplane(280, 800, 14.5);
		 System.out.print(aircraft2);
	}

}
