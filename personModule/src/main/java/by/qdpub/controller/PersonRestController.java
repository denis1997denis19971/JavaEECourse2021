package by.qdpub.controller;

import by.qdpub.entities.PersonEntity;
import by.qdpub.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonRestController {

    @Autowired
    PersonService personService;

    @GetMapping("/rest/person/list")
    public List<PersonEntity> mk() {
        List<PersonEntity> personEntities = null;
        personEntities = personService.readAllPersons();
        return personEntities;
    }

}
