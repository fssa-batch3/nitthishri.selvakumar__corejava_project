package day2.practice;

//(For Encapsulation): Create a **User** class with 
//attribute id, name, password, emailId and create setters 
//and getters for the same. Please note no attribute should be
//available publicly they should be only be accessible via the 
//access modifiers.

public class User {
	private int id;
	private String name;
	private String password;
	private String emailId;
	
	
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	
	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setId(23);
		user1.setName("Bheem");
		user1.setPassword("Bheem@1999");
		user1.setEmailId("bheem@gmail.com");
		
		System.out.println("User1");
		System.out.println("userId: "+ user1.getId());
		System.out.println("userName: "+ user1.getName());
		System.out.println("userPassword: "+ user1.getPassword());
		System.out.println("userEmail: "+ user1.getEmailId());
	}
	

}
