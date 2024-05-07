package com.cydeo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "user_account")
public class UserAccount extends BaseEntity{
    private String email;
    private String password;
    private String username;

    @OneToMany(mappedBy = "userAccount")
    private Set<Ticket> ticketSet;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "account_details_id")
    private AccountDetails accountDetails;
}
