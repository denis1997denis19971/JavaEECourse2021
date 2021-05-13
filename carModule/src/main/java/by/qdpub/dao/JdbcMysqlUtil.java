package by.qdpub.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcMysqlUtil {

    public static final String URL_CONNECTION = "jdbc:mysql://localhost:3306/webapp";
    public static final String USER_CONNECTION = "root";
    public static final String PASSWORD_CONNECTION = "root";

    private Statement statement = null;
    private Connection connection = null;

    public Connection getConnection() {

        if (!checkJdbcDriver()) {
            return null;
        }

        if (connection == null) {
            try {
                connection = DriverManager.getConnection(URL_CONNECTION, USER_CONNECTION, PASSWORD_CONNECTION);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        return connection;
    }

    public Statement getStatement() {

        if (statement == null) {
            try {
                statement = getConnection().createStatement();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        return statement;
    }

    public boolean checkJdbcDriver() {
        boolean result = true;

        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            result = false;
        }
        return result;
    }

    public void closeStatement() {

        try {
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public void closeConnection() {

        try {
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public void closeStatementAndConnection() {
        try {

            closeStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
        closeConnection();
    }

}
