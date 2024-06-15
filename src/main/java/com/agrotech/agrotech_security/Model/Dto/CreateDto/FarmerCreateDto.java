package com.agrotech.agrotech_security.Model.Dto.CreateDto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class FarmerCreateDto {
    private String name;
    private String address;
    private String phoneNumber;
}
