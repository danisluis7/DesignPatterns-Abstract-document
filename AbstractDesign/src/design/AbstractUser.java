package design;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class AbstractUser implements User{

	/**
	 * 
	 * Definition Constructor to get value from outside and process
	 * inside class.
	 * 
	 * @param listOfUser :=> Contain all of subjects
	 * @return Global listOfUser and use all these functions.
	 */
	private List<Object> listOfUser;
	
	public AbstractUser(List<Object> listOfUser){
		this.listOfUser = listOfUser;
	}
	
	@Override
	public ArrayList<Object> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getUserByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getUserByPhone(String phone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Object> getUserByGroupUserId(String userID) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
