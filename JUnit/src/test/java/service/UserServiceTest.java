package service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import dao.UserDAO;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {
	
	@InjectMocks
	UserService userService = new UserService();
     
    @Mock
    UserDAO userDAO;

	@Test
	public void testGetUserName() {
		when(userDAO.getUserName("u768034")).thenReturn("John Bocelli");
		String userName = userService.getUserName("u768034");
		assertNotNull(userName);
		verify(userDAO, times(1)).getUserName("u768034");
		verify(userDAO, never()).updateUserName("u768034" , "John");
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
