import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author hs.chiu
 * @version 2019-11-18
 */

class SubscriptionTest {
	
	private Subscription sub1 = new Subscription("apple","1@apple.com",100);
	private SubscriptionPrime sub2 = new SubscriptionPrime("pineapple", "square.sponge@pineapple.com", 
			200, "a pineapple under the sea");
	private Subscription sub3 = new Subscription("", "", 0);
	private SubscriptionPrime sub4 = new SubscriptionPrime("a", "a@com", 0, "under the sea");
	
	
	@Test
	void test1() {
		String expectedReturn= "Subscription:\n title: apple\n email: 1@apple.com\n cost: 100\n";
		String actualReturn = sub1.toString();
		assertEquals(expectedReturn,actualReturn);
	}
	
	@Test
	void test2() {
		String expectedTitle= "pineapple";
		assertEquals(expectedTitle,sub2.getTitle());
	}

	@Test
	void test3() {
		String expectedEmail= "square.sponge@pineapple.com";
		assertEquals(expectedEmail,sub2.getEmail());	
	}
	
	@Test
	void test4() {
		int expectedCost= 200;
		assertEquals(expectedCost,sub2.getCost());	
	}
	
	@Test
	void test5() {
		String expectedAddress= "a pineapple under the sea";
		assertEquals(expectedAddress,sub2.getAddress());	
	}
	@Test
	void test6() {
		String expectedReturn= "Subscription:\n title: \n email: \n cost: 0\n";
		assertEquals(expectedReturn,sub3.toString());
		
	}
	@Test
	void test7() {
		String expectedReturn= "SubscriptionPrime:\n title: a\n email: a@com\n cost: 0\n address: under the sea";
		assertEquals(expectedReturn,sub4.toString());
	}
}
