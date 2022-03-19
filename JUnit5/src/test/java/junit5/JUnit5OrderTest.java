package junit5;


import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//@TestMethodOrder(MethodOrderer.Random.class)
@TestMethodOrder(MethodNameOrderer.class)
public class JUnit5OrderTest {
	

	@Test
	//@Order(1)
	public void userLoginTest() {
		System.out.println("User logged in test passed");
	}
	
	@Test
	//@Order(2)
	public void purchase() {
		System.out.println("User purchased test passed");
	}
	
	@Test
	//@Order(3)
	public void userLogoutTest() {
		System.out.println("User logged out test passed");
	}
	
}
