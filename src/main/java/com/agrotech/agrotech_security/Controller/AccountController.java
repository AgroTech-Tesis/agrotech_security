package com.agrotech.agrotech_security.Controller;

import com.agrotech.agrotech_security.Mapping.AccountMapper;
import com.agrotech.agrotech_security.Model.Dto.AccountDto;
import com.agrotech.agrotech_security.Model.Dto.CreateDto.SignInDto;
import com.agrotech.agrotech_security.Services.Implementation.AccountServiceImpl;
import com.agrotech.agrotech_security.Util.Shared.exception.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<?> SignIn(@RequestBody SignInDto signInDto){
        try {
            AccountDto accountDto = accountMapper.toResource(accountService.SignIn(signInDto));
            return ResponseEntity.ok(accountDto);
        } catch (ResourceNotFoundException e) {
            // Si la cuenta o la contraseña es incorrecta, devolver el mensaje de error
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        } catch (Exception e) {
            // Manejar cualquier otra excepción inesperada
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An unexpected error occurred");
        }
    }
}
