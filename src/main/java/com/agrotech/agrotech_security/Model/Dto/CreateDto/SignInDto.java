package com.agrotech.agrotech_security.Model.Dto.CreateDto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class SignInDto {
    private String emailAddress;
    private String password;
}
