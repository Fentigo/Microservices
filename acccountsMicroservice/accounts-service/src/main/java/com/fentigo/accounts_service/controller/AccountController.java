package com.fentigo.accounts_service.controller;
import com.fentigo.accounts_service.dto.AccountRequest;
import com.fentigo.accounts_service.dto.AccountResponse;
import com.fentigo.accounts_service.service.AccountService;
import org.springframework.http.ResponseEntity;
//import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }
    // Create Account 
    @PostMapping
    public ResponseEntity<AccountResponse>createAccount(@Valid @RequestBody AccountRequest accountRequest){
    	AccountResponse accountResponse = accountService.createAccount(accountRequest);
        return ResponseEntity.ok(accountResponse);
    }
    
    //GET account by UD
    @GetMapping("/{id}")
    public ResponseEntity<AccountResponse> getAccountById(@PathVariable long id) {
        AccountResponse accountResponse = accountService.getAccountById(id);
        return ResponseEntity.ok(accountResponse);
    }

    // Update Account TBA
    
    //@PutMapping("/{id}")
    //public ResponseEntity<AccountResponse> updateAccount(@PathVariable long id, @Valid @RequestBody AccountRequest accountRequest) {
       // AccountResponse accountResponse = accountService.updateAccount(id, accountRequest);
      //  return ResponseEntity.ok(accountResponse);
    //}
    // Delete Account
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAccount(@PathVariable long id) {
        accountService.deleteAccount(id);
        return ResponseEntity.noContent().build();
    }
}
