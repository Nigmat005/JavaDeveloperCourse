package com.cydeo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
public class Ticket extends BaseEntity{
   @Column(name = "seat_number")
    private int seatNumber;
   @Column(name = "row_number")
    private int rowNumber;

   @Column(name = "date_time", columnDefinition = "TIMESTAMP")
    private LocalDateTime dateTime;

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "movie_cinema_id")
    private MovieCinema movieCinema;

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "user_account_id")
   private UserAccount userAccount;
}
