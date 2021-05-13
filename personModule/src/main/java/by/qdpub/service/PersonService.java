package by.qdpub.service;

import by.qdpub.dao.PersonDao;
import by.qdpub.entities.PersonEntity;
import by.qdpub.exception.PersonException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.List;

@Service
public class PersonService {


    @Autowired
    @Qualifier("personSpringDataJPADao")
    PersonDao personD;


    public PersonService() {
        //personD = new PersonJdbcDao();
        //personD = new PersonHibernateDao();
        //personD = new PersonSpringDataJPADao();
    }

    public void createPerson(PersonEntity person) {
        try {
            personD.createPerson(person.getName(), person.getAge());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    public void createPerson(HttpServletRequest req, HttpServletResponse resp) throws PersonException {

        String ret;

        String personName = req.getParameter("personName");
        Integer personAge = Integer.valueOf(req.getParameter("personAge"));

        if ((personName != null) && (personAge != null) && (personName != "")) {
            try {
                personD.createPerson(personName, personAge);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } else {
            throw new PersonException("Unbelievable by.qdpub.exception!");
        }


    }

    public void createPerson(String name, int age) {
        try {
            personD.createPerson(name, age);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public PersonEntity readPersonById(int id) throws SQLException {
        return personD.readPersonById(id);
    }

    public List<PersonEntity> readAllPersons() {

        try {
            return (List<PersonEntity>) personD.readAllPersons();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return null;

    }

    public void updatePersonById(int id, String new_name, int new_age) {
        personD.updatePersonById(id, new_name, new_age);
    }

    public void updatePerson(PersonEntity updated_person) {
        personD.updatePerson(updated_person);
    }

    public void deletePersonById(int id) {
        personD.deletePersonById(id);
    }
}
