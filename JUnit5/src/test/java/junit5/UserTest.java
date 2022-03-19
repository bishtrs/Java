package junit5;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled(value = "skipping all tests for now")
public class UserTest {

	//@Disabled(value = "skipping this test for now")
	public void testUserNameIsNotNull() {
		User user = new User("Nicolas Cage");
		assertNotNull(user);
	}

	@Test
	public void testUserNameIsNotEmpty() {
		User user = new User("Nicolas Cage");
		assertTrue(user.getName().length() > 0);
	}

}
