package com.agrotech.agrotech_security.Services.Implementation;

import com.agrotech.agrotech_security.Model.Dto.CreateDto.SignInDto;
import com.agrotech.agrotech_security.Model.Entity.Account;
import com.agrotech.agrotech_security.Repository.IAccountRepository;
import com.agrotech.agrotech_security.Services.Interfaces.IAccountService;
import com.agrotech.agrotech_security.Util.Shared.constants.Constants;
import com.agrotech.agrotech_security.Util.Shared.exception.ResourceNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

@Service
public class AccountServiceImpl implements IAccountService {
    private final IAccountRepository accountRepository;
    PasswordEncoder passwordEncoder;

    public AccountServiceImpl(IAccountRepository accountRepository) {
        this.accountRepository = accountRepository;
        passwordEncoder = new BCryptPasswordEncoder();
    }

    @Override
    public Account SignIn(SignInDto signInDto) {
        Account account = accountRepository.findByEmailAddress(signInDto.getEmailAddress());
        if (account == null)
            throw new ResourceNotFoundException("The email address is incorrect");
        boolean isPasswordMatch = passwordEncoder.matches(signInDto.getPassword(), account.getPassword());
        if(isPasswordMatch)
            return account;
        else
            throw new ResourceNotFoundException("Password is incorrect");
    }
}
