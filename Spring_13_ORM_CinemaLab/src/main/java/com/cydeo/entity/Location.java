package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@Entity
public class Location extends BaseEntity{
    private String name;
    private String latitude;
    private String longitude;
    private String country;
    private String city;
    private String state;
    private String postal_code;
    private String address;

    @OneToMany(mappedBy = "location")
    private Set<Cinema> cinema;
}
