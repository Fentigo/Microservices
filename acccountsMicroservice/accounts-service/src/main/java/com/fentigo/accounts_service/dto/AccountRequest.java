package com.fentigo.accounts_service.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class AccountRequest {
	
	private long id;
	private long accountid;
	@Email(message = "Email is required")
	@NotBlank(message = "Email should be valid")
	private String emailAddress;
	@NotBlank(message = "This field should not be blank")
	@Size(min=8, message= "Password must be at least 8 characters long")
	private String password;
	@NotBlank(message = "This field should not be blank")
	private String dateofBirth; //should this be a date?
	@NotBlank(message = "Email should be valid")
	private String firstName;
	@NotBlank(message = "This field should not be blank")
	private String lastName;
	@NotBlank(message = "This field should not be blank")
	@Size(min=11,max=11, message =" Please enter valid phone number!")
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

	
	
	