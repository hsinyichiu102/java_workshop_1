/**
 *  The Account class should have 5 field variables, namely, name,
 *  salutation, email, password, and loggedIn of types String, String,
 *  String, String, and boolean.
 * @author hs.chiu
 * @version 2019-11-18
 */


public class Account implements AccountInterface{

	private String name;
	private String salutation;
	private String email;
	private String password;
	boolean loggedIn;
	
	/**
	 * Class account with 4 variable
	 * @param name is a String for the name
	 * @param salutation is a String for the salutation(Mr/Ms)
	 * @param email is a String 
	 * @param password is a String 
	 */
	public Account(String name, String salutation, String email, String password) {
		super();
		this.name = name;
		this.salutation = salutation;
		this.email = email;
		this.password = password;
	}
	/**
	 * MAXIMAL_LOGIN_ATTEMPTS to define the maximal login times if it is failed
	 */
	public static final int MAXIMAL_LOGIN_ATTEMPTS = 3;
	
	/**
	 * to check if the loggedIn password is correct or failed
	 * the maximal trial is 3 times
	 * @param password is the user's password 
	 */
	@Override
	public void login(String password) {
		// TODO Auto-generated method stub
		int i=0;
		if(i <MAXIMAL_LOGIN_ATTEMPTS) {
			if (password.equals(getPassword())) {
				loggedIn=true;
				i=0;
			}
			else {
				loggedIn=false;
				i++;
				System.out.print("password is wrong, please try again.");
			}
		}
		else {
			System.out.print("account is blocked.");
		}
	
	}
	/**
	 * Getter to check whether a user is logged in.
     *  If the user is not loggedIn the toString method should be
     *  disabled and only a warning should be printed that first a
     *  login is necessary. Further methods may be disabled in
     *  sub-classes.
     *  @return true if the user is looged in, false else.
	 */
	@Override
	public boolean getLoggedIn() {
		// TODO Auto-generated method stub
		return loggedIn;
		}
	
	 /**
     *  setter for loggedIn
     *  @param loggedIn New value for the variable loggedIn
     */
	@Override
	public void setLoggedIn(boolean loggedIn) {
		// TODO Auto-generated method stub
		this.loggedIn=loggedIn;
		
	}
	
	 /**
     *  The user is no longer logged in, that is, the
     *  loggedIn variable set to false.
     */
	@Override
	public void logout() {
		// TODO Auto-generated method stub
		loggedIn=false;
	}
	
	/**
     * Getter method to return the name of the user.
     * @return The name of the user of the account.
     */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	/**
     * Getter method to return the salutation of the account holder.
     * @return The salutation of the account holder (e.g., "Mr", "Ms",
     * "Mrs", "Dr", "Prof")
     */
	@Override
	public String getSalutation() {
		// TODO Auto-generated method stub
		return salutation;
	}
	
	/**
     * Getter method to return the email address of the account holder.
     * @return The email address of the account holder.  
     */
	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}
	
	/**
     * Getter method to return the password. 
     * @return The password of the account.
     */
	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}
	
	
	/**
     *  Setter for the password.
     *  @param password The new password.
     */
	@Override
	public void setPassword(String password) {
		// TODO Auto-generated method stub
		this.password=password;
		
	}
	
	/**
     * Method to compare a provided password with the stored password.
     * @param password The provided password to which the password of
     * the this object is compared.
     * @return true if the password of the account agrees with the
     * argument, false else.
     */
	@Override
	public boolean checkPassword(String password) {
		// TODO Auto-generated method stub
		return this.password.equals(password);
	}
	
	/**
     * Standard toString method to represent the object in a human
     * readable form.
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
    
    /** 
     * Changes the password from old to new if the old password is
     * correct, else an error message is printed.
     * @param oldPassword The current password.
     * @param newPassword The future password.
     */
	@Override
	public void changePassword(String oldPassword, String newPassword) {
		// TODO Auto-generated method stub
		password=oldPassword;
		oldPassword=newPassword;
		setPassword(newPassword);
	}

//	public static void main(String[]args) {
//		Account a = new Account("Amy","Ms","123@yahoo.com","1234");
//		System.out.print(a);
//		
//	}
}
