package ru.filini.hibernate.Person;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "person")
@NamedNativeQuery(
        name = "findPersonByCity",
        query = "select * from persons p where p.city_of_living = :city"
)
public class Person {
    @EmbeddedId
    private PersonId id;

    @Column(length = 20, name = "phone_number")
    private String phoneNumber;
    @Column(length = 40, name = "city_of_living")
    private String cityOfLiving;
}
