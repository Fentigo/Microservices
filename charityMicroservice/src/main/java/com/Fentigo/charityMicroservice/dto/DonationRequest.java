package com.Fentigo.charityMicroservice.dto;

public class DonationRequest {
	private long accountId;
	private double amount;
	
	//getters and setters
	
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId( long accountId) {
		this.accountId = accountId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount( double amount) {
		if (amount!= 0 && amount>0) {
			this.amount = amount;
			
		}else {
			throw new IllegalArgumentException(" Donation amount must be positive!");
		}	
	}
}
