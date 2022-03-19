package service;

import dao.UserDAO;

public class UserService {
	
	private UserDAO userDAO;
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public String getUserName(String id) {
		return userDAO.getUserName(id);
	}
	
	public void updateUserName(String id, String name) {
		userDAO.updateUserName(id, name);
	}

}
