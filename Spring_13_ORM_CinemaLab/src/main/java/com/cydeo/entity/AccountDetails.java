package com.cydeo.entity;

import com.cydeo.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "account_details")
public class AccountDetails extends BaseEntity{
  private String name;
  private String address;
  private String country;
  private String city;
  private String state;
  private int age;
  private String postal_code;
  @Enumerated(EnumType.STRING)
  private UserRole role=UserRole.USER;

  @OneToOne(mappedBy = "accountDetails")
  private UserAccount userAccount;
}
