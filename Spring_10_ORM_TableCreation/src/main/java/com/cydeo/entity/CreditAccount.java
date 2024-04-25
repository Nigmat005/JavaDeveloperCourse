package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;
@Entity
@Table(name = "creditaccounts")
public class CreditAccount extends Account{
    private BigDecimal creditLimit;
}
