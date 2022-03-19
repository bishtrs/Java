package service;
// https://jar-download.com/maven-repository-class-search.php?search_box=org.jmock.integration.junit4.JUnitRuleMockery
import static org.junit.Assert.assertNotNull;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JMock;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import dao.UserDAO;

@RunWith(JMock.class)
public class UserServiceTestUsingJMock {

	private Mockery context = new JUnit4Mockery();

	private UserDAO userDAO;

	@Before
	public void setUp() {
		userDAO = context.mock(UserDAO.class);
	}

	@Test
	public void testGetUserName() {
		
		context.checking(new Expectations() {{
		    oneOf (userDAO).getUserName("u768034"); will(returnValue("John Bocelli"));
		}});
		UserService userService = new UserService();
		userService.setUserDAO(userDAO);
		String userName = userService.getUserName("u768034");
		assertNotNull(userName);
	}

}
