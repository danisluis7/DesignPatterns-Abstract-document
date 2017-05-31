package domain;

import java.util.List;

import design.AbstractUser;

public class Teacher extends AbstractUser implements GetList,GetUserByName{

	public Teacher(List<Object> listOfUser) {
		super(listOfUser);
	}

	@Override
	public void getBySomeThing() {
		// TODO Auto-generated method stub
		/**
		 * This is method that you definite inside GetUserByName
		 */
	}
	
}
