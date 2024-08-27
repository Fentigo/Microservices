package com.fentigo.accounts_service.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.fentigo.accounts_service.model.AccountModel;

@Repository
public interface AccountsRepository extends JpaRepository<AccountModel, Long> {
}
