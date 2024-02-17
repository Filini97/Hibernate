package ru.filini.hibernate.Person;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Embeddable
public class PersonId implements Serializable {
    @Column(length = 50, name = "name")
    private String name;
    @Column(length = 50, name = "surname")
    private String surName;
    @Column(length = 3, name = "age")
    private int age;
}
