package javaTutorial16Encapsulation;

public class User {
	private final int userID;
	private String userName;
	private String firstName, lastName;
	
	
	User(int userID, String userName, String firstName, String lastName) {
		this.userID = userID;
		this.userName= userName;
		this.firstName = firstName;
		this.lastName= lastName;
	}
	
	int getUserID() {
		return userID;
	}
	String getUserName() {
		return userName;
	}
	String getFirstName() {
		return firstName;
	}
	String getlastName() {
		return lastName;
	}
	void setUserName(String userName) {
		this.userName = userName;
	}
	void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
