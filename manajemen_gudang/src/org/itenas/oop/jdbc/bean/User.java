package org.itenas.oop.jdbc.bean;

public class User {
	private String firstName;
	private String lastName;
	private String address;
	private String phone;
	private String dob;
	private char sex;
	private String email;
	private String password;
	private int isAdmin;
	private int isActive = 1;
	
	public User() {
		
	}
	
	public User(String firstName, String lastName, String address, String phone, String dob, char sex, String email,
			String password, int isAdmin, int isActive) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
		this.dob = dob;
		this.sex = sex;
		this.email = email;
		this.password = password;
		this.isActive = isActive;
		this.isAdmin = isAdmin;
	}



	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public int isAdmin() {
		return isAdmin;
	}

	public void setAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}

	public int isActive() {
		return isActive;
	}

	public void setActive(int isActive) {
		this.isActive = isActive;
	}



	//Data nanti di load dari json file
	private String[][] accounts = {{"jeje@gmail.com", "1234"}, {"putra@gmail.com", "1234"}, {"siti", "1234"}};
	
	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	/*
	 * TODO:
	 * 1. Add User
	 * 2. Modify
	 * 3. List
	 * 4. View Detail
	 * 5. Delete or remove (suggestion: update attribute isActive)
	 * 6. getAllUser
	 * 7. validateLogin (find user by username)
	 */
	
	public boolean isAuth(String email, String password) {
		return ((email.equals(accounts[0][0])) && (password.equals(accounts[0][1])));
	}
}
