/**
 * to get the film and its details
 * @author Hsin Yi Chiu
 * @version 2019-10-18
 */
public class Film {
	private String title;
	private Date releaseDate;
	private int length;
	
	/**
	 * a constructor of the film with 3 variable
	 * @param title is a String to know the title of the film
	 * @param releaseDate is a Date to know the launch date of the film
	 * @param length is a int to know the time length of the film
	 */
	public Film(String title, Date releaseDate, int length) {
		this.title = title;
		this.releaseDate = releaseDate;
		this.length = length;
	}
	/**
	 * Getter for title
	 * @return title to get the title of the film
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * Getter for release date
	 * @return realeaseDate to get the launch date of the film
	 */
	public Date getReleaseDate() {
		return releaseDate;
	}
	/**
	 * Getter for the length
	 * @return length to get the time length of the film
	 */
	public int getLength() {
		return length;
	}

	/**
	 * Setter to set the released date
	 * @param releaseDate to get the new releaseDate
	 */
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	/**
	 * using a readable description to present the details of film
	 */
	@Override
	public String toString() {
		return "The film is " + title +". It will be launched on "+releaseDate+" and the film length is "+
	length+" minutes.";
	}
	
	/**
	 * Main method and test the toString
	 * @param args unused
	 */
	public static void main(String[]args) {
		Film adAstra = new Film("Ad Astra",new Date(03,"October",2019),123);
		System.out.println(adAstra);
	}
	
}
