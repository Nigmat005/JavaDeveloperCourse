package com.cydeo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "PaymentDetails")
@Data
@NoArgsConstructor
public class PaymentDetail extends BaseEntity{

    private BigDecimal commissionAmount;
    protected BigDecimal merchantPayoutAmount;
    @Column(columnDefinition = "DATE")
    protected LocalDate payoutDate;

    @OneToOne(mappedBy = "paymentDetail")
    Payment payment;

    public PaymentDetail(BigDecimal merchantPayoutAmount, BigDecimal commissionAmount, LocalDate payoutDate) {
        this.merchantPayoutAmount = merchantPayoutAmount;
        this.commissionAmount = commissionAmount;
        this.payoutDate = payoutDate;
    }
}
