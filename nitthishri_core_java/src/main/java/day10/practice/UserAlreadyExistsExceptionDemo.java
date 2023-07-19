package day10.practice;

import java.util.*;

//Write a register(User user) throws UserAlreadyExistsException method which throws UserAlreadyExistsException 
//if there is a user with user.emailID is already present in the ArrayList<User>

class UserAlreadyExistsException extends RuntimeException {
	
	public UserAlreadyExistsException(String msg) {
		super(msg);
	}

	public UserAlreadyExistsException(Throwable te) {
		super(te);
	}

	public UserAlreadyExistsException(String msg, Throwable te) {
		super(msg, te);
	}
}


class User {
	int id;
	String name;
	String emailId;
	public User(int id,String name,String emailId) {
		this.id=id;
		this.name=name;
		this.emailId=emailId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}


class UserValidator {
	static ArrayList<User> arr = new ArrayList<User>();
	public static boolean register(User user) throws UserAlreadyExistsException {
		if (user == null) {
			throw new UserAlreadyExistsException("User Object Cann't be Null");
		}
		
		for(User element:arr) {
			if(element.emailId.equals(user.getEmailId())) {
				throw new UserAlreadyExistsException("User already added");
			}
			
		}
		arr.add(user);
		System.out.println(arr);
		System.out.println("User added");
		return true;
	}
}


public class UserAlreadyExistsExceptionDemo {
	
	public static void main(String[] args) {
		User user1=new User(1, "Niki", "niki@gmail.com");
		User user2=new User(1, "Ramu", "ramu@gmail.com");
		
		UserValidator.register(user1);
		UserValidator.register(user2);
		UserValidator.register(user1);

		
		
	}
	


}