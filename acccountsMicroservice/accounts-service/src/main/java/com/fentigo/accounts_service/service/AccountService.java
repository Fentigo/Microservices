package com.fentigo.accounts_service.service;
import com.fentigo.accounts_service.model.AccountModel;
import java.util.Optional;
import com.fentigo.accounts_service.repository.AccountsRepository;
import com.fentigo.accounts_service.dto.AccountRequest;
import com.fentigo.accounts_service.dto.AccountResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
	 @Autowired
	    private AccountsRepository accountRepository;

	    public AccountResponse createAccount(AccountRequest request) {
	        // Create and save the account
	        AccountModel account = new AccountModel();
	        account.setId(account.getId()); 
	        account.setAccountId(account.getAccountId());
	    	account.setAccountId( account.getAccountId());
	    	account.setEmailAddress (account.getEmailAddress());	    	
	    	account.setPassword(account.getPassword()); 
	    	account.setDateofBirth(account.getDateofBirth());
	    	account.setFirstName(account.getFirstName());
	    	account.setLastName(account.getLastName());
	    	account.setPhoneNumber(account.getPhoneNumber());
	        

	        accountRepository.save(account);

	        // Prepare the response
	        AccountResponse response = new AccountResponse();
	    	response.setId(account.getId()); 
	    	response.setAccountId( account.getAccountId());
	    	response.setEmailAddress (account.getEmailAddress());	    	
	    	//response.setPassword(account.getPassword());  security risk
	    	response.setDateofBirth(account.getDateofBirth());
	    	response.setFirstName(account.getFirstName());
	    	response.setLastName(account.getLastName());
	    	response.setPhoneNumber(account.getPhoneNumber());


	        return response;

	    }
	    //other methods
	    //get account by id
	    public AccountResponse getAccountById(long id) {
	        // Retrieve the account from the database
	        Optional<AccountModel> accountOptional = accountRepository.findById(id);

	        if (accountOptional.isPresent()) {
	            AccountModel account = accountOptional.get();
	            AccountResponse response = new AccountResponse();
	            response.setId(account.getId());
	            response.setAccountId(account.getAccountId());
	            response.setEmailAddress(account.getEmailAddress());
	            //response.setPassword(account.getPassword()); removing for security
	            response.setDateofBirth(account.getDateofBirth());
	            response.setFirstName(account.getFirstName());
	            response.setLastName(account.getLastName());
	            response.setPhoneNumber(account.getPhoneNumber());
	            return response;
	        } else {
	            throw new RuntimeException("Account not found with id: " + id);
	        }
	    }
	    public void deleteAccount(long id) {
	        Optional<AccountModel> accountOptional = accountRepository.findById(id);

	        if (accountOptional.isPresent()) {
	            accountRepository.deleteById(id); // Delete the account if found
	        } else {
	            throw new RuntimeException("Account not found with id: " + id); // Handle case where account doesn't exist
	        }
	    }
	    //delete account
	    
	    
}