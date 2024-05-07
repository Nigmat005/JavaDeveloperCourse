package com.cydeo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name="movie_cinema")
public class MovieCinema extends BaseEntity {

    @Column(columnDefinition = "TIMESTAMP",name = "date_time")
    private LocalDateTime dateTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_id")
    private Movie movie;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "cinema_id")
    private Cinema cinema;

    @OneToMany(mappedBy = "movieCinema")
    private Set<Ticket> ticket;
}
