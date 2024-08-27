package com.Fentigo.charityMicroservice.dto;

public class DonationResponse {
	private long donationId; // unique identifier for the donation
	private long accountId; // The ID of the account 
	private double amount;//amount donation
	private String status; // donation status
	
	//getter for donation 
	
	public long getDonationID() {
		return donationId;
		
	}
	//setter for donation id
	public void setDonationId(long donationId) {
		this.donationId = donationId;
	}
	//getter for accountId
	public long getAccountId() {
		return accountId;
	}
	//setter for accountId
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	//getter for amount 
	public double getAmount() {
		return amount;
	}
	
	//setter for amount 
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	//getter for status 
	public String getStatus() {
		return status;
	}
	
	//setter for status
	public void setStatus(String status) {
		this.status = status;
	}

}