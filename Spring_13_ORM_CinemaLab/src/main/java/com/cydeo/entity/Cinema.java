package com.cydeo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@Entity
public class Cinema extends BaseEntity{
    private String name;
    @Column(name = "sponsored_name")
    private String sponsoredName;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "location_id")
    private Location location;

    @OneToMany(mappedBy = "cinema")
    private Set<MovieCinema> movieCinemas;
}
