package service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import dao.UserDAO;

public class UserServiceTestUsingWithoutAnnotation {
	
	private UserService userService = new UserService();
     
	private UserDAO userDAO;
    
    @Before
    public void setUp() {
    	userDAO = Mockito.mock(UserDAO.class);
    	userService.setUserDAO(userDAO);
    }

	@Test
	public void testGetUserName() {
		when(userDAO.getUserName("u768034")).thenReturn("John Bocelli");
		String userName = userService.getUserName("u768034");
		assertNotNull(userName);
	}
	
	@Test
	public void testUpdateUserName() {
		doNothing().when(userDAO).updateUserName("u768034", "John");
		userService.updateUserName("u768034", "John");
	}
	
	@Test
	public void testUpdateUserNameArguments() {
	    ArgumentCaptor<String> valueCapture = ArgumentCaptor.forClass(String.class);

		doNothing().when(userDAO).updateUserName(any(String.class), valueCapture.capture());
		userService.updateUserName("u768034", "John");
		
	    assertEquals("John", valueCapture.getValue());
	}

}
