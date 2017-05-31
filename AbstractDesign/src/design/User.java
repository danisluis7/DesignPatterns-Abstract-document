package design;
import java.util.ArrayList;

/**
 * User interface
 */
@SuppressWarnings("all")
public interface User {
	/**
	 * Gets all objects from database
	 * 
	 * @param 
	 * @return ArrayList<Object>
	 */
	ArrayList<Object> getList();
	
	/**
	 * Puts the value related to the id
	 * 
	 * @param id --> identify user 
	 * @return Object and null
	 */
	Object getUserById(int id);
	
	/**
	 * Puts the value related to the name
	 * 
	 * @param name --> name of user 
	 * @return Object and null
	 */
	Object getUserByName(String name);
	
	/**
	 * Puts the value related to the email
	 * 
	 * @param name --> name of email 
	 * @return Object and null
	 */
	Object getUserByEmail(String email);
	
	/**
	 * Puts the value related to the phone
	 * 
	 * @param name --> name of phone 
	 * @return Object and null
	 */
	Object getUserByPhone(String phone);
	
	/**
	 * Puts the value related to the userID
	 * 
	 * @param name --> name of userID 
	 * @return Object and null
	 */
	ArrayList<Object> getUserByGroupUserId(String userID);
}
