package service;

import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import dao.UserDAO;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTestException {
	
	@InjectMocks
	private UserService userService = new UserService();
     
    @Mock
    private UserDAO userDAO;

	@Test(expected = IllegalArgumentException.class)
	public void testGetUserNameThrowsException() {
		when(userDAO.getUserName("")).thenThrow(new IllegalArgumentException("userid is empty"));
		userService.getUserName("");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testUpdateUserNameThrowsException() {
		doThrow(new IllegalArgumentException("username is empty")).when(userDAO).updateUserName("u768034", "");
		userService.updateUserName("u768034", "");
	}

}
