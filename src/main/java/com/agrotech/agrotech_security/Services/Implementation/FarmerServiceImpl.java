package com.agrotech.agrotech_security.Services.Implementation;

import com.agrotech.agrotech_security.Model.Entity.Account;
import com.agrotech.agrotech_security.Model.Entity.Farmer;
import com.agrotech.agrotech_security.Repository.IAccountRepository;
import com.agrotech.agrotech_security.Repository.IFarmerRepository;
import com.agrotech.agrotech_security.Services.Interfaces.IFarmerService;
import com.agrotech.agrotech_security.Util.Shared.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class FarmerServiceImpl implements IFarmerService {
    private final IFarmerRepository farmerRepository;
    private final IAccountRepository accountRepository;

    public FarmerServiceImpl(IFarmerRepository farmerRepository, IAccountRepository accountRepository) {
        this.farmerRepository = farmerRepository;
        this.accountRepository = accountRepository;
    }

    @Override
    public Farmer getById(Long id) {
        return farmerRepository.getById(id);
    }

    @Override
    public Farmer getFarmerByAccountId(Long id) {
        return farmerRepository.findByAccountId(id);
    }

    @Override
    public Farmer add(Long accountId, Farmer farmer) {
        Account account = accountRepository.getById(accountId);
        if(account == null)
            throw new ResourceNotFoundException("Error");
        try{
            farmer.setAccount(account);
            farmerRepository.save(farmer);
            return farmer;
        }catch (Exception e){
            throw new ResourceNotFoundException("Error");
        }
    }

    @Override
    public Farmer update(Long id, Farmer farmer) {
        return null;
    }
}
