
package com.agrotech.agrotech_security.Mapping;

import com.agrotech.agrotech_security.Model.Dto.CreateDto.FarmerCreateDto;
import com.agrotech.agrotech_security.Model.Dto.FarmerDto;
import com.agrotech.agrotech_security.Model.Entity.Farmer;
import com.agrotech.agrotech_security.Util.Shared.mapping.EnhancedModelMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

@Component
@AllArgsConstructor
public class FarmerMapper implements Serializable {
    @Autowired
    EnhancedModelMapper mapper;

    public FarmerDto toResource(Farmer model){
        return mapper.map(model, FarmerDto.class);
    }
    public Farmer toModel(FarmerDto model){
        return mapper.map(model, Farmer.class);
    }
    public Farmer toModel(FarmerCreateDto model){
        return mapper.map(model, Farmer.class);
    }
    public List<FarmerDto> listToResource(List<Farmer> model){
        return mapper.mapList(model, FarmerDto.class);
    }
}
