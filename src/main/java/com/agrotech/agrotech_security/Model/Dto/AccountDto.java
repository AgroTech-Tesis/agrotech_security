package com.agrotech.agrotech_security.Model.Dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {
    private Long id;
    private Boolean isActive;
    private LocalDateTime createdAt;
    private String emailAddress;
    private String password;
    private String accountStatus;
}
