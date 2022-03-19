package dao;

public interface UserDAO {
	
	public String getUserName(String id);
	
	public void updateUserName(String id, String name);

}
