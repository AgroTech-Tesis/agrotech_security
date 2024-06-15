package com.agrotech.agrotech_security.Model.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "tx_is_active", length = 40)
    private Boolean isActive;
    @Column(name = "tx_created_at")
    private LocalDateTime createdAt;
    @Column(name = "tx_email_address", length = 40)
    @Email
    private String emailAddress;
    @Column(name = "tx_password", length = 40)
    private String password;
    @Column(name = "tx_account_status", length = 40)
    private String accountStatus;

    @OneToOne(mappedBy = "account")
    private Farmer farmer;
}
