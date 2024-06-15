
package com.agrotech.agrotech_security.Mapping;

import com.agrotech.agrotech_security.Model.Dto.AccountDto;
import com.agrotech.agrotech_security.Model.Dto.CreateDto.AccountCreateDto;
import com.agrotech.agrotech_security.Model.Entity.Account;
import com.agrotech.agrotech_security.Util.Shared.mapping.EnhancedModelMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

@Component
@AllArgsConstructor
public class AccountMapper implements Serializable {
    @Autowired
    EnhancedModelMapper mapper;

    public AccountDto toResource(Account account){
        return mapper.map(account, AccountDto.class);
    }
    public Account toModel(AccountDto model){
        return mapper.map(model, Account.class);
    }
    public Account toModel(AccountCreateDto model){
        return mapper.map(model, Account.class);
    }
    public List<AccountDto> listToResource(List<Account> model){
        return mapper.mapList(model, AccountDto.class);
    }

}
