package com.agrotech.agrotech_security.Controller;

import com.agrotech.agrotech_security.Mapping.AccountMapper;
import com.agrotech.agrotech_security.Model.Dto.AccountDto;
import com.agrotech.agrotech_security.Model.Dto.CreateDto.SignInDto;
import com.agrotech.agrotech_security.Services.Implementation.AccountServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("")
public class AccountController {
    private final AccountServiceImpl accountService;
    private final AccountMapper accountMapper;

    public AccountController(AccountServiceImpl accountService, AccountMapper accountMapper) {
        this.accountService = accountService;
        this.accountMapper = accountMapper;
    }

    @PostMapping("/sign-in")
    public AccountDto SignIn(@RequestBody SignInDto signInDto){
        return accountMapper.toResource(accountService.SignIn(signInDto));
    }
}
