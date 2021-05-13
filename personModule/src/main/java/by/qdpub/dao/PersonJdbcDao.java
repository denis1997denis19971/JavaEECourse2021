package by.qdpub.dao;

import by.qdpub.entities.PersonEntity;

import java.sql.*;
import java.util.ArrayList;

public class PersonJdbcDao implements PersonDao {


    @Override
    public void createPerson(PersonEntity person) throws SQLException {


        //new
        createPerson(person.getName(), person.getAge());
    }

    @Override
    public void createPerson(String name, int age) {

        String sql;
        Statement statement;
        Connection connection = null;
        try {
            JdbcMysqlUtil JDBCUtil = new JdbcMysqlUtil();


            if (JDBCUtil.checkJdbcDriver()) {

                connection = JDBCUtil.getConnection();

                connection.setAutoCommit(false);


                statement = JDBCUtil.getStatement();
                sql = "INSERT INTO `webapp`.`person` (`person_name`, `person_age`) VALUES ('" + name + "', '" + age + "');";

                try {
                    statement.execute(sql);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } finally {
                    JDBCUtil.closeStatementAndConnection();
                }
                connection.commit();

            } else {
                System.out.println("Mysql connector isn't work!");
            }

        } catch (SQLException throwables) {

            try {
                connection.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            throwables.printStackTrace();
        }

    }

    public void createDefaultPerson() {

        ArrayList<PersonEntity> personEntityArr = new ArrayList<>();
        personEntityArr.add(new PersonEntity(0, "BaseAdmin", 100));
        personEntityArr.add(new PersonEntity(0, "BaseValera", 100));
        personEntityArr.add(new PersonEntity(0, "BaseVasya", 100));


        String sql;
        Statement statement;
        Connection connection = null;
        try {
            JdbcMysqlUtil JDBCUtil = new JdbcMysqlUtil();


            if (JDBCUtil.checkJdbcDriver()) {

                connection = JDBCUtil.getConnection();

                connection.setAutoCommit(false);

                //statement = JDBCUtil.getStatement();
                /*      sql = ;*/
                PreparedStatement prstatment = connection.prepareStatement("INSERT INTO `webapp`.`person` (`person_name`, `person_age`) VALUES (?, ?);");

                for (PersonEntity i : personEntityArr
                ) {

                    //sql = "INSERT INTO `webapp`.`person` (`person_name`, `person_age`) VALUES ('" + "admin" + "', '" + 100 + "');";
                    prstatment.setString(1, i.getName());
                    prstatment.setInt(2, i.getAge());

                    try {
                        prstatment.execute();
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    } finally {
                        JDBCUtil.closeStatementAndConnection();
                    }
                }

                connection.commit();

            } else {
                System.out.println("Mysql connector isn't work!");
            }

        } catch (SQLException throwables) {

            try {
                connection.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            throwables.printStackTrace();
        }

    }

    @Override
    public PersonEntity readPersonById(int id) throws SQLException {
        String sql;

        try (Connection connection = new JdbcMysqlUtil().getConnection();
             Statement statement = connection.createStatement()) {

            sql = "SELECT * FROM webapp.person AS chelick WHERE chelick.id = " + id + ";";

            try {
                ResultSet rs = statement.executeQuery(sql);
                if (rs.next()) {
                    int r_id = rs.getInt(1);
                    String r_name = rs.getString(2);
                    int r_age = rs.getInt(3);

                    return new PersonEntity(r_id, r_name, r_age);
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }


        return null;
    }

    @Override
    public Iterable<PersonEntity> readAllPersons() throws SQLException {
        String sql;
        ArrayList<PersonEntity> result = new ArrayList<PersonEntity>();

        try (Connection connection = new JdbcMysqlUtil().getConnection();
             Statement statement = connection.createStatement()) {

            sql = "SELECT * FROM webapp.person AS chelicki;";

            try {
                ResultSet rs = statement.executeQuery(sql);
                while (rs.next()) {
                    int r_id = rs.getInt(1);
                    String r_name = rs.getString(2);
                    int r_age = rs.getInt(3);

                    result.add(new PersonEntity(r_id, r_name, r_age));

                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }


        return result;
    }

    @Override
    public void updatePersonById(int id, String new_name, int new_age) {

        String sql;

        try (Connection connection = new JdbcMysqlUtil().getConnection();
             Statement statement = connection.createStatement()) {

            sql = "UPDATE `webapp`.`person` SET `person_name` = '" + new_name + "', `person_age` = '" + new_age + "' WHERE (`id` = '" + id + "');";
            statement.execute(sql);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {

        }


    }

    @Override
    public void updatePerson(PersonEntity updated_person) {
        updatePersonById(updated_person.getId(), updated_person.getName(), updated_person.getAge());
    }

    @Override
    public void deletePersonById(int id) {

        String sql;

        try (Connection connection = new JdbcMysqlUtil().getConnection();
             Statement statement = connection.createStatement()) {

            sql = "DELETE FROM `webapp`.`person` WHERE (`id` = '" + id + "');";
            statement.execute(sql);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {

        }


    }
}
