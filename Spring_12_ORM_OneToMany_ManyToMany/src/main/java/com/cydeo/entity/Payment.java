package com.cydeo.entity;


import com.cydeo.enums.Status;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Payments")
@Data
@NoArgsConstructor
public class Payment extends BaseEntity{
    protected BigDecimal amount;
    @Column(columnDefinition = "DATE")
    LocalDate createdDate;
    @Enumerated(EnumType.STRING)
    Status paymentStatus;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "paymentDetail_ID")
    PaymentDetail paymentDetail;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "merchantId")
    private Merchant merchant;

//    @ManyToOne(cascade = CascadeType.ALL)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customerId")
    private Customer customer;


    public Payment(LocalDate createdDate, BigDecimal amount, Status paymentStatus) {
        this.createdDate = createdDate;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
    }
}
