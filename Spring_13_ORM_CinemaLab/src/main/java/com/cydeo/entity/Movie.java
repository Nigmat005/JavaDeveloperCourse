package com.cydeo.entity;

import com.cydeo.enums.State;
import com.cydeo.enums.Type;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@Data
@Entity
@Table(name = "movie")
public class Movie extends BaseEntity{
    private String name;
    private BigDecimal price;
    @Enumerated(EnumType.STRING)
    private Type type;
    @Enumerated(EnumType.STRING)
    private State state;
    @Column(columnDefinition = "DATE",name = "release_date")
    private LocalDate releaseDate;
    private Integer duration;
    @Column(columnDefinition = "text")
    private String summary;

    @ManyToMany
    @JoinTable(
            name = "movie_genre_rel",
            joinColumns = @JoinColumn(name = "movie_id")
            ,inverseJoinColumns = @JoinColumn(name = "genre_id")
    )
    private Set<Genre> genreList;

    @OneToMany(mappedBy = "movie")
    private Set<MovieCinema> movieCinema;


}
