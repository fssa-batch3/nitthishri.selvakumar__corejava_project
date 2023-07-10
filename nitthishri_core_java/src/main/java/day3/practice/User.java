package day3.practice;

// Create a User class with 2 constructors. the second overloaded
//constructor User(name, password, emailId)
class UserDetail{
	
private String name;
private String password;
private String emailId;


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


public UserDetail() {
	
}
public UserDetail(String name, String password, String emailId) {
    this.name = name;
    this.password = password;
    this.emailId = emailId;
}

}

public class User{
	public static void main(String[] args) {
		UserDetail user1 = new UserDetail();
		user1.setName("Nitthi");
		user1.setPassword("nitthi@0222");
		user1.setEmailId("nitthi@gmail.com");
		
		System.out.print(user1.getName()+" "+ "-");
		System.out.print(user1.getPassword()+" "+ "-" );
		System.out.print(user1.getEmailId()+" ");
		System.out.println();
		
		UserDetail user2 = new UserDetail("Yogi","Yogi@22","yogi@gmail.com");
		
		System.out.print(user2.getName()+" "+ "-" );
		System.out.print(user2.getPassword()+" "+ "-" );
		System.out.print(user2.getEmailId()+" ");
		System.out.println();

		
	}

}
