import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;




import org.junit.jupiter.api.Test;



class AccountTest {
	private Account user1 = new Account ("Amy","Ms","123@yahoo","apple");
	private Account user2 = new Account("Bill", "Mr", "234@gmail", null);
	private AccountStandard user3 = new AccountStandard("Gill","Ms","1234@gmail","123");
	private AccountAdministrator user4= new AccountAdministrator
			("sponge","Mr","square@square","undersea");

	
	@Test
	void test1() {
	 String expectedUserName="Amy";
	 assertEquals(expectedUserName, user1.getName());
	 String expectedUserSalutation="Ms";
	 assertEquals(expectedUserSalutation, user1.getSalutation());
	 String expectedUserEmail="123@yahoo";
	 assertEquals(expectedUserEmail, user1.getEmail());
	 String expectedUserPassword="apple";
	 assertEquals(expectedUserPassword, user1.getPassword());
	}
	@Test
	void test2() {
		user2.setPassword("00");
		String expectedUserName="Bill";
		assertEquals(expectedUserName, user2.getName());
		String expectedUserPassword="00";
		assertEquals(expectedUserPassword, user2.getPassword());
	}
	@Test
	void test3() {
		String checkPassword = "apple";
		assertTrue(user1.checkPassword(checkPassword));
	}
	@Test
	void test4() {
		String expectedNewPassword="pineapple";
		user1.changePassword("apple", "pineapple");
		assertEquals(expectedNewPassword,user1.getPassword());
	}
	@Test
	void test5() {
		user1.login("Apple");
		assertFalse(user1.loggedIn);
		user1.login("applE");
		assertFalse(user1.loggedIn);
		user1.login("apPlE");
		assertFalse(user1.loggedIn);
	}
	@Test
	void test6() {
		user3.login("456");
		assertFalse(user3.getLoggedIn());
	    assertEquals(1, user3.getFailedLoginAttempts());
	    user3.login("356");
		assertFalse(user3.getLoggedIn());
	    assertEquals(2, user3.getFailedLoginAttempts());
	    user3.login("123");
		assertTrue(user3.getLoggedIn());
	    assertEquals(0, user3.getFailedLoginAttempts());
	}
	@Test
	void test7() {
		MusicTitle music1= new MusicTitle("wang", "stone", 20);
	
		user3.setBalance(20);
		user3.deposit(30);
		int totalAmount= 50;
		assertEquals(totalAmount, user3.getBalance());
		user3.login("123");
		user3.buy(music1);
		int restAmount = 30;
		assertEquals(restAmount, user3.getBalance());
		user3.logout();
		
		String expectedTitle = "wang";
	    String expectedArtist = "stone";
	    int expectedPrice = 20;
	    String actualTitle = user3.getTitlesBought().get(0).getTitle();
	    String actualArtist = user3.getTitlesBought().get(0).getArtist();
	    int actualPrice = user3.getTitlesBought().get(0).getPrice();
	    assertEquals(expectedTitle, actualTitle);
	    assertEquals(expectedArtist, actualArtist);
	    assertEquals(expectedPrice, actualPrice);
	}
	@Test
	void test8() {
		user4.login("undersea");
		assertTrue(user4.getLoggedIn());
	    assertEquals(0, user4.getFailedLoginAttempts());
	    user4.resetAccount(user1, "abc");
	    String newPassword= "abc";
	    assertEquals(newPassword, user1.getPassword());
	   
	}

}
