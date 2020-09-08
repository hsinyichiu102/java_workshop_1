import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * to test the good
 * @author Hsin Yi Chiu
 * @version 2019-10-18
 */
public class GoodTest {

	/**
	 * set a new variable of the apple and the tolerance
	 */
	private Good apple = new Good("apple",0.95);
	public final static double TOLERANCE = 0.000001;
	
	/**
	 * to test the getter of the name and netPrice
	 * to test the setting rate is the same as expected
	 * to test the method of grossPrice
	 * to test the discount, the price after discount and the toString
	 */
	public void appleTest() {
		assertEquals("apple",apple.getName());
		assertEquals(0.95,apple.getNetPrice(),TOLERANCE);
		double setVAT_RATE = 20;
		assertEquals(setVAT_RATE,Good.VAT_RATE,TOLERANCE);
		double appleGrossPrice = 1.14;
		assertEquals(appleGrossPrice,apple.grossPrice(),TOLERANCE);
		apple.discount(10);
		String appleDiscountPrice = "The apple has a gross price of "+ "\u00a3" + "1.02.";
		assertEquals(appleDiscountPrice,apple.toString());
	}
	/**
	 * to test the setNamev and the setNetPrice
	 * to test the method of the grossPrice after new good
	 * to test the discount after the new netPrice
	 */
	public void setTest() {
		apple.setName("sweet apple");
		assertEquals("sweet apple",apple.getName());
		apple.setNetPrice(1.5);
		assertEquals(1.5,apple.getNetPrice(),TOLERANCE);
		double sweetAppleGrossPrice = 1.8;
		assertEquals(sweetAppleGrossPrice,apple.grossPrice(),TOLERANCE);	
		apple.discount(20);
		String sweetAppleDiscountPrice = "The apple has a gross price of "+ "\u00a3" + "1.44.";
		assertEquals(sweetAppleDiscountPrice,apple.toString());
	}

}