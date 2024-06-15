package com.agrotech.agrotech_security.Model.Dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class FarmerDto {
    private Long id;
    private String name;
    private String address;
    private String phoneNumber;
}
