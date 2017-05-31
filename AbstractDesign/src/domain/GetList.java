package domain;

import java.util.ArrayList;

import design.User;

public interface GetList extends User{
	/** From client or domain to see see service and 
	 * get value from service 
	 * 
	 * @param no parameter
	 * @return ArrayList<Object> 
	 */
	default ArrayList<Object> getList(){
		return null;
	}
}
