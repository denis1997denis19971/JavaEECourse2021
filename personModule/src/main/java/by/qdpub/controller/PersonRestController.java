package by.qdpub.controller;

import by.qdpub.entities.PersonEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonRestController {

/*    @Autowired
    PersonService personService;*/

    @GetMapping("/rest/person/list")
    public List<PersonEntity> mk() {
        List<PersonEntity> personEntities = null;
        /*                personService.readAllPersons();*/
        return personEntities;
    }

}
