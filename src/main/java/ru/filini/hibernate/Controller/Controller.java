package ru.filini.hibernate.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.filini.hibernate.Person.Person;
import ru.filini.hibernate.Repository.PersonsTableRepository;

import java.util.List;

@AllArgsConstructor
@RestController
public class Controller {

    private final PersonsTableRepository repository;
    
    @GetMapping("/persons/by-city")
    protected List<Person> getPersonsByCity(@RequestParam(value = "city", required = false) String city) {
        return repository.getPersonsByCity(city);
    }

}