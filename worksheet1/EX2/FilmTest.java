import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**
 * JUnit test for Film class
 * @author hs.chiu
 * @version 2019-10-18
 */
public class FilmTest {

	/**
	 * set date and film first for the test
	 */
	private Date date = new Date(15,"October",2020);
	private Film film = new Film ("Avanda", new Date(14,"October",2021),99);
	
	/**
	 * to test the getter of the day
	 */
	@Test
	public void testGetDay() {
		assertEquals(15,date.getDay());
	}
	
	/**
	 * to test the getter of the month
	 */
	@Test
	public void testGetMonth() {
		assertEquals("October",date.getMonth());
	}
	/**
	 * to test the getter of the year
	 */
	@Test
	public void testGetYear() {
		assertEquals(2020,date.getYear());
	}
	/**
	 * to test the setter of the day
	 */
	@Test
	public void testSetDay() {
		date.setDay(2);
		assertEquals(2,date.getDay());
	}
	
	/**
	 * to test the setter of the Month
	 */
	@Test
	public void testSetMonth() {
		date.setMonth("December");
		assertEquals("December",date.getMonth());
	}
	/**
	 * to test the setter of the year
	 */
	@Test
	public void testSetYear() {
		date.setYear(1999);
		assertEquals(1999,date.getYear());
	}
	/**
	 * to test the getter of title
	 */
	@Test
	public void testGettitle() {
		assertEquals("Avanda",film.getTitle());
	}
	/**
	 * to test the getter of releaseDate
	 */
	@Test
	public void testGetReleaseDate() {
		Date newReleaseDate = new Date(18,"December",2020);
		film.setReleaseDate(newReleaseDate);
		assertEquals(newReleaseDate,film.getReleaseDate());
	}
	/**
	 * to test the getter of the length
	 */
	@Test
	public void testGetLength() {
		assertEquals(99,film.getLength());
	}
	
	/**
	 * to test the whole class with new variable
	 * and test the toString
	 */
	public void testWholeClass() {
		Date updateDate = new Date(01,"January",2021);
		Film zootopia = new Film("Zootopia",updateDate,89);
		zootopia.setReleaseDate(new Date(01,"Feb",2018));
		assertEquals("The film is Zootopia. It will be launched on 01 Feb 2019 and the film length is 89 minutes.",zootopia.toString());
	}
	
}
