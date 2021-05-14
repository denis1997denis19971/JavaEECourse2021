package by.qdpub.dao;

import by.qdpub.entities.PersonEntity;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.SQLException;
import java.util.List;

public class PersonHibernateDao implements PersonDao {

    public static void main(String[] args) {

        new PersonHibernateDao().createPersonWithPassport();


        try {
            new PersonHibernateDao().readPersonById(1);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    private void createPersonWithPassport() {

        //EntityManager
        SessionFactory factory = null;
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }

        Session session = factory.openSession();
        Transaction tx = null;
        Integer personID = null;

        try {
            tx = session.beginTransaction();
            personID = (Integer) session.save(new PersonEntity("вцавуца", 3234));
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public void createPerson(PersonEntity person) throws SQLException {
        //EntityManager
        SessionFactory factory = null;
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }

        Session session = factory.openSession();
        Transaction tx = null;
        Integer personID = null;

        try {
            tx = session.beginTransaction();
            personID = (Integer) session.save(person);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

    }

    @Override
    public void createPerson(String name, int age) throws SQLException {
        //EntityManager
        SessionFactory factory = null;
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }

        Session session = factory.openSession();
        Transaction tx = null;
        Integer personID = null;

        try {
            tx = session.beginTransaction();
            personID = (Integer) session.save(new PersonEntity(name, age));
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public PersonEntity readPersonById(int id) throws SQLException {

        PersonEntity tempPerson;
        tempPerson = null;

        SessionFactory factory = null;
        try {

            factory = new Configuration().configure().buildSessionFactory();

        } catch (Throwable ex) {

            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);

        }

        Session session = factory.openSession();

        Integer personID = null;

        try {

            tempPerson = session.get(PersonEntity.class, id);
            System.out.println();

        } catch (HibernateException e) {

            e.printStackTrace();

        } finally {

            session.close();

        }

        return tempPerson;
    }

    @Override
    public Iterable<PersonEntity> readAllPersons() {

        SessionFactory factory = null;
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }

        Session session = factory.openSession();
        List employees = null;

        try {
            employees = session.createQuery("FROM PersonEntity ").list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return employees;
    }

    public void getPersonWithNameLikeAndAgeBetween(String likeName, int minage, int maxage) {


    }

    @Override
    public void updatePersonById(int id, String new_name, int new_age) {

        PersonEntity tempPerson;

        SessionFactory factory = null;
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }

        Session session = factory.openSession();
        Transaction tx = null;
        Integer personID = null;

        try {
            tx = session.beginTransaction();

            tempPerson = session.get(PersonEntity.class, id);

            tempPerson.setName(new_name);
            tempPerson.setAge(new_age);

            session.update(tempPerson);


            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

    }

    @Override
    public void updatePerson(PersonEntity updated_person) {

        PersonEntity tempPerson;

        SessionFactory factory = null;
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }

        Session session = factory.openSession();
        Transaction tx = null;
        Integer personID = null;

        try {
            tx = session.beginTransaction();

            session.update(updated_person);


            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public void deletePersonById(int id) {

        PersonEntity tempPerson;

        SessionFactory factory = null;
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }

        Session session = factory.openSession();
        Transaction tx = null;
        Integer personID = null;

        try {
            tx = session.beginTransaction();

            tempPerson = session.get(PersonEntity.class, id);
            session.delete(tempPerson);


            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }


    }
}
