package by.qdpub.service;

import org.springframework.stereotype.Service;

@Service
public class PersonService {
/*
    PersonDao personD;


    public PersonService() {
        personD = new PersonHibernateDao();
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
        Integer personAge = Integer.valueOf(req.getParameter("personAge").toString());

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
            return personD.readAllPersons();
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
    }*/
}
