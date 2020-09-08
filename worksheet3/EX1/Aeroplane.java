/**
 * Furthermore write a subclass Aeroplane.java with the additional field variable
 * fuelConsumption of type double. 
 * The class should contain a constructor, getter(s) and setter(s), and a
 * toString method. Make use of inheritance as far as possible.
 * @author HSIN YI CHIU
 * @version 2019-11-04
 *
 */
public class Aeroplane extends Aircraft{
	
	private double fuelConsumption;
	
	/**
	 * A constructor of the Aeroplane to have 2 variable from superclass and an additional variable
	 * @param passengerNumber is integer variable of the passenger's number and inherited from the super class 
	 * @param maxSpeed is integer variable of the maximum speed of the aeroplane and inherited from the super class
	 * @param fuelConsumption is a double variable of the fuel consumption 
	 */
	public Aeroplane(int passengerNumber, int maxSpeed,double fuelConsumption) {
		super(passengerNumber, maxSpeed);
		// TODO Auto-generated constructor stub
		this.fuelConsumption=fuelConsumption;
	}
	
	/**
	 * a getter of the fuelConsumption to get the value of fuelConsumption
	 * @return fuelConsumption of the aeroplane
	 */
	public double getFuelConsumption() {
		return fuelConsumption;
	}
	
	/**
	 * a setter of the fuelConsumption to set a new fuelConsumption
	 * @param fuelConsumption is a double variable to set the new fuelConsumption
	 */
	public void setFuelConsumption(double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	/**
	 * a String using human readable way to display the information of the aerocraft
	 */
	@Override
	public String toString() {
		return "Aeroplane:\n passengerNumbe: " + super.getPassengerNumber() +"\n maxSpeed: "+ super.getMaxSpeed()
				+"\n fuelConsumption: " + fuelConsumption+ "\n";
		
		

	}
	
	

}
