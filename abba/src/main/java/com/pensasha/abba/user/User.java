package com.pensasha.abba.user;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	private String firstName;
	private String secondName;
	private String thirdName;
	
	@Id
	private String userName;
	private String password;
	
	public User(String firstName, String secondName, String thirdName, String userName, String password) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.thirdName = thirdName;
		this.userName = userName;
		this.password = password;
	}

	public User() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getThirdName() {
		return thirdName;
	}

	public void setThirdName(String thirdName) {
		this.thirdName = thirdName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", secondName=" + secondName + ", thirdName=" + thirdName
				+ ", userName=" + userName + ", password=" + password + "]";
	}

	
}
