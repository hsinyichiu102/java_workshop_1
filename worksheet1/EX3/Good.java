/**
 * to get the price of the good
 * @author Hsin Yi Chiu
 * @version 16.10.2019
 */
public class Good {
	private String name;
	private double netPrice;
	public final static double VAT_RATE = 20.00;
	/**
	 * a constructor of the Good to define the param
	 * @param name is the String name of the goods
	 * @param netPrice is the Double net price of the goods
	 */
	public Good(String name, double netPrice) {
		super();
		this.name = name;
		this.netPrice = netPrice;
	}
	/**
	 * Getter to get the name of good
	 * @return the name of the good
	 */
	public String getName() {
		return name;
	}
	/**
	 * Setter to set a new name of the good
	 * @param name is the new name of the good
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Getter to get the net price of the good
	 * @return to get the new price of the good
	 */
	public double getNetPrice() {
		return netPrice;
	}
	/**
	 * Setter to set a new price of the good
	 * @param netPrice to set the new price of the good
	 */
	public void setNetPrice(double netPrice) {
		this.netPrice = netPrice;
	}
	
	/**
	 * a method to have the gross price of the good
	 * @return the net price with the vat, which is the gross price
	 */
	public double grossPrice() {
		return netPrice+netPrice*(VAT_RATE/100.00);	
	}
	
	/**
	 * a method to set the discount net price
	 * @param rate to get the discount rate
	 */
	public void discount(double rate) {
		this.netPrice= netPrice-netPrice*(rate/100.00);
	}
	
	/**
	 * to present the good with a readable description of the two variable
	 */
	public String toString() {
		return "The "+ name +" has a gross price of "+ "\u00a3" + String.format("%.2f", grossPrice()) + ".";
	}
	
	/**
	 * main method with the test of toString
	 * @param args unused
	 */
	public static void main(String[] args) {
		
		Good milk = new Good("milk",0.50);
		System.out.println(milk);
		milk.discount(20);
		System.out.println(milk);
	}



	

}
