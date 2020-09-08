/**
 * a class of the date to set the date and year
 * @author Hsin Yi Chiu
 * @version 2019-10-18
 */
public class Date {
	private int day;
	private String month;
	private int year;
	/**
	 * a constructor of the date with 4 variable
	 * @param day to get the int day 
	 * @param month to get the String month
	 * @param year to get the int year
	 */
	public Date(int day, String month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	/**
	 * Getter for day
	 * @return the day
	 */
	public int getDay() {
		return day;
	}
	/**
	 * Setter of the day
	 * @param day to set int day of a new day
	 */
	public void setDay(int day) {
		this.day = day;
	}
	/**
	 * Getter for the month
	 * @return String month
	 */
	public String getMonth() {
		return month;
	}
	/**
	 * Setter for the month
	 * @param month to set the int month of a new month
	 */
	public void setMonth(String month) {
		this.month = month;
	}
	/**
	 * Getter for the year
	 * @return the int year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * Setter of the year
	 * @param year to set int year of a new year
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * to set the ideal present of the date
	 */
	@Override
	public String toString() {
		return day+" "+month+" "+year;
	}
	
}
