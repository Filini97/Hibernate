package ru.filini.hibernate.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.filini.hibernate.Person.Person;

import java.util.List;

@AllArgsConstructor
@Repository
public class PersonsTableRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> getPersonsByCity(String city) {
        var query = entityManager.createNamedQuery("findPersonByCity");
        query.setParameter("city", city);
        List<Person> personList = query.getResultList();

        return personList;
    }
}
