/**
 * The subclass SubscriptionPrime.java has the
* additional field address of type String, 
* indicating where hard copies of the journal should be sent to.
 * @author hs.chiu
 *
 */
public class SubscriptionPrime extends Subscription implements SubscriptionPrimeInterface{
	
	private String address;
	
	/**
	 * a constructor of SubscriptionPrime which is the subclass of subscription 
	 * and implements the interface of SubscriptionPrimeInterface
	 * @param title is a string which is inherited from the super class
	 * @param email is a string which is inherited from the super class
	 * @param cost is a integer which is inherited from the super class
	 * @param address is a String variable
	 */
	public SubscriptionPrime(String title, String email, int cost, String address) {
		super(title, email, cost);
		this.address=address;
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * a getter of address which has been defined in the interface
	 * @return address which is override by the address in the SubscriptionPrime class
	 */
	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return address;
	}
	
	/**
	 * a string to present all the variable in human readable way
	 */
	@Override
	public String toString() {
		return "SubscriptionPrime:\n title: " + super.getTitle() + "\n email: " + super.getEmail() 
		+ "\n cost: " + super.getCost()+"\n address: "+ address;
	}

}
