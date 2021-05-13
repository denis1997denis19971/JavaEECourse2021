package by.qdpub.dao;

import by.qdpub.entities.PersonEntity;
import by.qdpub.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.Optional;

@Component
public class PersonSpringDataJPADao implements PersonDao {

    @Autowired
    PersonRepository personRepository;

    @Override
    public void createPerson(PersonEntity person) throws SQLException {
        personRepository.save(person);
    }

    @Override
    public void createPerson(String name, int age) throws SQLException {
        PersonEntity pe = new PersonEntity(name, age);
        personRepository.save(pe);
    }

    @Override
    public PersonEntity readPersonById(int id) throws SQLException {
        Optional<PersonEntity> person = personRepository.findById(id);
        PersonEntity personObj = person.orElse(new PersonEntity());
        return personObj;
    }

    @Override
    public Iterable<PersonEntity> readAllPersons() throws SQLException {
        Iterable<PersonEntity> allPersons = personRepository.findAll();
        return allPersons;
    }

    @Override
    public void updatePersonById(int id, String new_name, int new_age) {
        PersonEntity personEntity = new PersonEntity(id, new_name, new_age);
        personRepository.save(personEntity);
    }

    @Override
    public void updatePerson(PersonEntity updated_person) {
        personRepository.save(updated_person);
    }

    @Override
    public void deletePersonById(int id) {
        personRepository.deleteById(id);
    }
}
