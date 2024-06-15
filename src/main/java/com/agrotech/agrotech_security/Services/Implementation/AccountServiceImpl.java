package com.agrotech.agrotech_security.Services.Implementation;

import com.agrotech.agrotech_security.Model.Dto.CreateDto.SignInDto;
import com.agrotech.agrotech_security.Model.Entity.Account;
import com.agrotech.agrotech_security.Repository.IAccountRepository;
import com.agrotech.agrotech_security.Services.Interfaces.IAccountService;
import com.agrotech.agrotech_security.Util.Shared.constants.Constants;
import com.agrotech.agrotech_security.Util.Shared.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

@Service
public class AccountServiceImpl implements IAccountService {
    private final IAccountRepository accountRepository;

    public AccountServiceImpl(IAccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account SignIn(SignInDto signInDto) {
        Account account = accountRepository.findByEmailAddressAndPassword(signInDto.getEmailAddress(), signInDto.getPassword());
        if (account == null)
            throw new ResourceNotFoundException("Account is exist");
        try {
            //Account newAccount = new Account();
            //newAccount.setEmailAddress(signInDto.getEmailAddress());
            //newAccount.setPassword(signInDto.getPassword());
            //newAccount.setCreatedAt(LocalDateTime.now(ZoneId.of(Constants.TIME_ZONE_DEFAULT)));
            //newAccount.setIsActive(true);
            //newAccount.setAccountStatus(Constants.STATUS_ACTIVE);
            //accountRepository.save(newAccount);
            return account;
        } catch (Exception e) {
            throw new ResourceNotFoundException("Error");
        }
    }
}
