import java.util.ArrayList;

/**
 * AccountAdminstrator is a sub-class of Account. An adminstrator can
 *  reset the accounts of standard users (in case they have forgotten
 *  their password or have attempted to login unsuccessfully to
 *  often). An administrator can have arbitrarily many unsuccessful
 *  login attempts
 * @author hs.chiu
 * @version 2019-11-19
 */
public class AccountAdministrator extends AccountStandard implements AccountAdministratorInterface{
	
	private ArrayList<Account> accounts;
	
	
	/**
	 * a construct which contain the variable from the superclass
	 * @param name is the name of the user as String
	 * @param salutation is the salutation of the user
	 * @param email is the email of the user
	 * @param password is the password of the user
	 */
	public AccountAdministrator(String name, String salutation, String email, String password) {
		super(name, salutation, email, password);
		// TODO Auto-generated constructor stub
		this.accounts= new ArrayList<Account>();
	}
	
	/**
     * Getter method to return the list of accounts the administrator
     * looks after.
     * @return The list of accounts the administrator looks after.
     */
	@Override
	public ArrayList<Account> getAccounts() {
		// TODO Auto-generated method stub
		return accounts;
	}
    /**
     *  The method adds an account to the list of accounts the
     *  administrator looks after.
     *  @param customer The new account to be added to the list of accounts
     *  the administrator looks after.
     */
	@Override
	public void addAccount(Account account) {
		// TODO Auto-generated method stub
		accounts.add(account);
		
	}
    /**
     *  If an account can no longer be used, since either the user has
     *  forgotten their password or in case of a standard user has
     *  entered the password incorrectly too often the administrator
     *  can reset the account by setting a new password and resetting
     *  the number of failed login attempts to zero (the latter only
     *  if the account is a standard account).
     *  @param account The account that is to be reset.
     *  @param password The new password for the account that is to be
     *  reset.
     */
	@Override
	public void resetAccount(Account account, String password) {
		// TODO Auto-generated method stub
		if(getLoggedIn()== true) {
			account.setPassword(password);
			if(account instanceof AccountStandard) {
				((AccountStandard) account).setFailedLoginAttempts(0);
			}
		}
		
		
	}
    /**
     *  Method for an adminstrator to log in by providing a
     *  password. It is checked whether the password provided is
     *  correct.
     *  @param password The password provided for the login; this is
     *  to be compared to the password stored on the system.
     */
	@Override
	public void login(String password) {
		// TODO Auto-generated method stub

		if (getFailedLoginAttempts()<MAXIMAL_LOGIN_ATTEMPTS) {
			if (password.equals(getPassword())) {
				loggedIn=true;
				setFailedLoginAttempts(0);
			}
			else {
				loggedIn=false;
			}
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