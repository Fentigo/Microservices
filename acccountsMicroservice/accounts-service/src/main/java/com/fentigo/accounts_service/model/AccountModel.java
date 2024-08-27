package com.fentigo.accounts_service.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;

@Entity
public class AccountModel{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	long accountid;
	@Email
	String emailAddress;
	String password;
	String dateofBirth;
	String firstName;
	String lastName;
	String phoneNumber;
	
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
	@Email
	public String getEmailAddress () {
		return emailAddress;
	}
	@Email
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
