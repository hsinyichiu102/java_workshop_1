import java.util.ArrayList;
/**
 *  a standard account is an account for customers who can download
 *  music from the music web site.
 * @author hs.chiu
 * @version 2019-11-18
 */
public class AccountStandard extends Account implements AccountStandardInterface {
	
	private int balance;
	private ArrayList<MusicTitle> titlesBought;
	private int failedLoginAttempts;
	
	/**
	 * a construct which contain the variable from the superclass
	 * @param name is the name of the user as String
	 * @param salutation is the salutation of the user
	 * @param email is the email of the user
	 * @param password is the password of the user
	 */
	
	public AccountStandard(String name, String salutation, String email, String password) {
		super(name, salutation, email, password);
		// TODO Auto-generated constructor stub
		this.balance=0;
		this.titlesBought=new ArrayList<MusicTitle>();
		this.failedLoginAttempts=0;
	
	}
	
	/**
     * Getter method to return the balance.
     * @return The balance of the account.
     */
	@Override
	public int getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
	
	/**
	 * A method of login
	 * if the password is correct return true,
	 * if the password is failed then can be tried again and maximum is three times for trying
	 * after three times failed need to be reset
	 * if the password is correct by trying within three times, then the count of failedLoginAttempts will be reset
	 * @param password to check if the password is correct
	 */
	@Override
	public void login(String password) {
		// TODO Auto-generated method stub

	if(getFailedLoginAttempts()<MAXIMAL_LOGIN_ATTEMPTS) {
			if (password.equals(super.getPassword())) {
				loggedIn=true;
				setFailedLoginAttempts(0);
			}
			else {
				loggedIn=false;
				failedLoginAttempts=getFailedLoginAttempts()+1;
			}
		}
	else {
		System.out.print("account is blocked.");
	}
		
		}
		
	/**
	 * a getter for the titlesBought
	 * @return titlesBought as an array
	 */

	@Override
	public ArrayList<MusicTitle> getTitlesBought() {
		// TODO Auto-generated method stub
		return titlesBought;
	}
	
	/** 
     * Adds the amount - if positive - to the current balance. For
     * non-positive amounts the action does nothing.
     * @param amount The amount being deposited.
     */
	
	@Override
	public void deposit(int amount) {
		// TODO Auto-generated method stub
		if(amount>0) {
		setBalance(getBalance()+amount);
		}
	}
	/**
	 * a setter for set a new Balance
	 * @param balance is a int
	 */
	@Override
	public void setBalance(int balance) {
		// TODO Auto-generated method stub
		this.balance=balance;
		
	}
	
	/**
	 * a getter for getting FailedLoginAttempts
	 * @return failedLoginAttempts as int
	 */
	@Override
	public int getFailedLoginAttempts() {
		// TODO Auto-generated method stub
	
		return failedLoginAttempts;
	}
	/**
	 * a setter for setting new failedLoginAttempts, especially for setting back to 0
	 * @param failedLoginAttempts as a integer
	 */
	@Override
	public void setFailedLoginAttempts(int failedLoginAttempts) {
		// TODO Auto-generated method stub
			this.failedLoginAttempts=failedLoginAttempts;
			
	}

	/** 
     *  1. If the user is logged in and has sufficient funds, a music
     *  title is bought by adding the title to the ArrayList of
     *  titlesBought of the customer.  
     *  2.the price of the
     *  title is subtracted from the funds of the customer. 
     *  3.If the user is not logged in, a corresponding warning is to be
     *  printed. Likewise if the user has insufficient funds, they
     *  should be asked to pay money into their account.
     *  @param musicTitle The music title that the customer wants to
     *  buy.
     */
	@Override
	public void buy(MusicTitle musicTitle) {
		// TODO Auto-generated method stub
		
		if (loggedIn==true ) {
			if(getBalance()>=musicTitle.getPrice()){
				titlesBought.add(musicTitle);
				setBalance(getBalance()-musicTitle.getPrice());
			}
			else {
				System.out.print("not enough deposit, please pay the deposit.");
			}
		}
		else {
			System.out.print("the password is wrong, please enter again.");
		}
	}
	/**
     * Standard toString method to represent the object in a human
     * readable form. If the user is not logged in, only a warning
     * should be printed, but no substantial information be given.
     * @return The object in a human readable form.
     */
	public String toString() {
    	if(loggedIn=false) {
    	return ("please try again.");
    	}
    	else {
    		return ("please log in.");
    	}
	}
		
	}
	
	


