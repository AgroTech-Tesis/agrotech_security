package com.agrotech.agrotech_security.Controller;

import com.agrotech.agrotech_security.Mapping.AccountMapper;
import com.agrotech.agrotech_security.Mapping.FarmerMapper;
import com.agrotech.agrotech_security.Model.Dto.AccountDto;
import com.agrotech.agrotech_security.Model.Dto.CreateDto.SignInDto;
import com.agrotech.agrotech_security.Model.Dto.FarmerDto;
import com.agrotech.agrotech_security.Services.Implementation.AccountServiceImpl;
import com.agrotech.agrotech_security.Services.Implementation.FarmerServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("farmer")
public class FarmerController {
    private final FarmerServiceImpl farmerService;
    private final FarmerMapper farmerMapper;

    public FarmerController(FarmerServiceImpl farmerService, FarmerMapper farmerMapper) {
        this.farmerService = farmerService;
        this.farmerMapper = farmerMapper;
    }

    @GetMapping("/account/{accountId}")
    public FarmerDto getByAccountId(@PathVariable("accountId") Long accountId){
        return farmerMapper.toResource(farmerService.getFarmerByAccountId(accountId));
    }
    @GetMapping("/{farmerId}")
    public FarmerDto getFarmerById(@PathVariable("farmerId") Long farmerId){
        return farmerMapper.toResource(farmerService.getById(farmerId));
    }
}
