package com.fentigo.accounts_service.dto;

public class AccountResponse {
	private long id;
	private long accountid;
	private String emailAddress;
	private String password;
	private String dateofBirth; //should this be a date?
	private String firstName;
	private String lastName;
	private String phoneNumber;
	
	//getters and setters 
	public Long getId() {
		return id;}
	public void setId(long id) {
	        this.id = id;}
	
	public long getAccountId() {
		return accountid;
	}
	public void setAccountId(long accountid) {
		this.accountid = accountid;	}
	
	public String getEmailAddress () {
		return emailAddress;
	}
	public void setEmailAddress (String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getDateofBirth() {
		return dateofBirth;
	}
	public void setDateofBirth(String dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
	public String getfirstName() {
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}


