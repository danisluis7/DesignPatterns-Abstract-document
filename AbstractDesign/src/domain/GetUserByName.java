package domain;

import java.util.List;

import design.User;

public interface GetUserByName extends User{
	default Object getUserByName(String name){
		return name;
	}
	/**
	 * default means get from parent and show in client
	 */
	
	default List<Object> getByGroupUserId(){
		return null;
	}
	
	/**
	 * With method will definite and add default before.
	 * => When we call and no necessary to import
	 */
	void getBySomeThing();
}
