/**
 * The class is used to represent music titles in form of a title, an
 *  artist, and a price, of types String, String, and int,
 *  respectively.  login attempts.
 * @author hs.chiu
 * @version 2019-11-18
 */
public class MusicTitle implements MusicTitleInterface{
	
	private String title;
	private String artist;
	private int price;
	
	/**
	 * a construct which contain the variable from the superclass
	 * @param name is the name of the user as String
	 * @param salutation is the salutation of the user
	 * @param email is the email of the user
	 * @param password is the password of the user
	 */

	public MusicTitle(String title, String artist, int price) {
		super();
		this.title = title;
		this.artist = artist;
		this.price = price;
	}

//	/** 
//	 * a setter to set a new title
//	 * @param title as String
//	 */
//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//	/**
//	 * a setter to set a new A
//	 * @param artist
//	 */
//	public void setArtist(String artist) {
//		this.artist = artist;
//	}
//
//	public void setPrice(int price) {
//		this.price = price;
//	}
	
	/**
     *  Standard getter for the title
     *  @return The title of the music title.
     */
	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}

	/**
     *  Standard getter for the artist
     *  @return The artist of the music title.
     */
	@Override
	public String getArtist() {
		// TODO Auto-generated method stub
		return artist;
	}
	/**
     *  Standard getter for the price
     *  @return The price of the music title.
     */
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	
	/**
     * Standard toString method to represent the object in a human
     * readable form.
     * @return The object in a human readable form.
     */
    public String toString() {
    	
    	return("please log in");
    
    }

}
