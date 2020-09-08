import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
/**
* JUnit test for car
* @author Hsin Yi Chiu
* @version 2019-10-19
*/

public class CarTest {

	/**
	 * set 3 different variable for testing
	 */
	private Car a1 = new Car ("BMW",10000,250,"Red");
	private Car a2 = new Car ("Renault",5000,200,"White");
	private Car a3 = new Car ("Nissan", 2500,100,"Black");
	
	/**
	 * to test the getMake from a1 to a3 variable
	 */
	@Test
	public void testMake1() {
		assertEquals("BMW",a1.getMake());
	}

	@Test
	public void testMake2() {
		assertEquals("Renault",a2.getMake());
	}

	@Test
	public void testMake3() {
		assertEquals("Nissan",a3.getMake());
	}
	/**
	 * to test the getPrice from a1 to a3
	 */

	@Test
	public void testPrice1() {
		assertEquals(10000,a1.getPrice());
	}
	
	@Test
	public void testPrice2() {
		assertEquals(5000,a2.getPrice());
	}
	
	@Test
	public void testPrice3() {
		assertEquals(2500,a3.getPrice());
	}
	
	/**
	 * to test the getMaxSpeed from a1 to a3
	 */
	@Test
	public void testMaxSpeed1() {
		assertEquals(250,a1.getMaxSpeed());
	}
	
	@Test
	public void testMaxSpeed2() {
		assertEquals(200,a2.getMaxSpeed());
	}
	
	@Test
	public void testMaxSpeed3() {
		assertEquals(100,a3.getMaxSpeed());
	}
	/**
	 * to test the getColour from a1 to a3
	 */
	@Test
	public void testColour1() {
		assertEquals("Red",a1.getColour());
	}
	
	@Test
	public void testColour2() {
		assertEquals("White",a2.getColour());
	}
	
	@Test
	public void testColour3() {
		assertEquals("Black",a3.getColour());
	}
	/**
	 * to test the setMake with new variable for a1, a2 and a3
	 */
	@Test
	public void testSetMake1() {
		a1.setMake("Vauxhall");
		assertEquals("Vauxhall", a1.getMake());
	}
	
	@Test
	public void testSetMake2() {
		a2.setMake("VW");
		assertEquals("VW",a2.getMake());
	}
	
	
	@Test
	public void testSetMake3() {
		a3.setMake(" ");
		assertEquals(" ",a3.getMake());
	}
	/**
	 * to test the setPrice with new variable for a1, a2 and a3
	 */
	
	@Test
	public void testSetPrice1() {
		a1.setPrice(100);
		assertEquals(100,a1.getPrice());
	}
	
	@Test
	public void testSetPrice2() {
		a2.setPrice(10000);
		assertEquals(10000,a2.getPrice());
	}
	
	@Test
	public void testSetPrice3() {
		a3.setPrice(0);
		assertEquals(0,a3.getPrice());
	}

	/**
	 * to test the setMaxSpeed with new variable for a1, a2 and a3
	 */
	@Test
	public void testSetMaxSpeed1() {
		a1.setMaxSpeed(0);
		assertEquals(0,a1.getMaxSpeed());
	}
	
	@Test
	public void testSetMaxSpeed2() {
		a2.setMaxSpeed(200);
		assertEquals(200,a2.getMaxSpeed());
	}
	
	@Test
	public void testSetMaxSpeed3() {
		a3.setMaxSpeed(300);
		assertEquals(300,a3.getMaxSpeed());
	}
	
	/**
	 * to test the setColour with new variable for a1, a2 and a3
	 */
	@Test
	public void testSetColour1() {
		a1.setColour("Pink");
		assertEquals("Pink",a1.getColour());
	}
	
	@Test
	public void testSetColour2() {
		a2.setColour("Blue");
		assertEquals("Blue",a2.getColour());
	}
	
	@Test
	public void testSetColour3() {
		a3.setColour("");
		assertEquals("",a3.getColour());
	}
}
