package com.user.registration;

public class User {
			
	private String fName;
	private String lName;
	private String emailId;
	private String phoneNum;
	private String password;

	public String getfName() {
		return fName;
	}
	
	public String getlName() {
		return lName;
	}
	
	public String getEmailId() {
		return emailId;
	}
	
	public String getPhoneNum() {
		return phoneNum;
	}
	
	public String getPassword() {
		return password;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}
	
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
