/**
* Subscription.java describes the subscription to a journal by the 3 field variables title, email, and
* cost of types String, String, and int, respectively. 
* The subclass SubscriptionPrime.java has the
* additional field address of type String, indicating where hard copies of the journal should be sent to.
* Make use of inheritance as far as possible.
* 
* @author hs.chiu
* @version 2019-11-14
*/
public class Subscription implements SubscriptionInterface {
	
	private String title;
	private String email;
	private int cost;
	
	/**
	 * A constructor for subscription with 2 string and 1 integer
	 * @param title is a String variable of title
	 * @param email is a email variable of email
	 * @param cost is a integer of cost
	 */
	public Subscription(String title, String email, int cost) {
		super();
		this.title = title;
		this.email = email;
		this.cost = cost;
	}
	
	/**
	 * a getter of title which has been defined in the interface 
	 * @return title to be override by the title in the Subscription class
	 */
	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}
	
	/**
	 * a getter of email which has been defined in the interface
	 * @return email to be override by the email in the Subscription class
	 */
	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}
	
	/**
	 * a getter of cost which has been defined in the interface
	 * @return cost to be override by the cost in the Subscription class
	 */
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return cost;
	}
	
	/**
	 * a string to present all the variable in human readable way
	 */
	@Override
	public String toString() {
		return "Subscription:\n title: " + title + "\n email: " + email + "\n cost: " + cost+"\n";
	}
	
//	public static void main(String [] args) {
//	    Subscription sub1 = new Subscription("Financial Times", "mary@mary.org", 2);
//	    System.out.print(sub1);
//	    SubscriptionPrime subPrime1 = new SubscriptionPrime("Garden News", "josh@josh.org", 3, "CS Birmingham");
//	    System.out.println(subPrime1);
//	}
	

}
