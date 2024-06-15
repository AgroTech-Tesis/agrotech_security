package com.agrotech.agrotech_security.Services.Interfaces;

import com.agrotech.agrotech_security.Model.Dto.CreateDto.SignInDto;
import com.agrotech.agrotech_security.Model.Entity.Account;

import java.util.List;

public interface IAccountService {
    Account SignIn(SignInDto signInDto);
}
