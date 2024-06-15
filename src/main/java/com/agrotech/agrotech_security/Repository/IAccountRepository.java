package com.agrotech.agrotech_security.Repository;

import com.agrotech.agrotech_security.Model.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IAccountRepository extends JpaRepository<Account, Long> {
    Account findByEmailAddressAndPassword(String emailAddress, String password);
}
