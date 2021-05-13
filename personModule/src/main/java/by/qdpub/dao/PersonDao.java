package by.qdpub.dao;

import by.qdpub.entities.PersonEntity;

import java.sql.SQLException;

public interface PersonDao {

    void createPerson(PersonEntity person) throws SQLException;

    void createPerson(String name, int age) throws SQLException;

    PersonEntity readPersonById(int id) throws SQLException;

    Iterable<PersonEntity> readAllPersons() throws SQLException;

    void updatePersonById(int id, String new_name, int new_age);

    void updatePerson(PersonEntity updated_person);

    void deletePersonById(int id);

}
