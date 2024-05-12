package com.cydeo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "COURSES")
public class Course{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NAME")
    private String name;

    @Column(name = "CATEGORY")
    private String category;
    @Column(name = "RATING")
    private String rating;
    @Column(columnDefinition = "TEXT",name = "DESCRIPTION")
    private String descriptions;
}
