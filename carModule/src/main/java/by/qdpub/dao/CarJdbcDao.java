package by.qdpub.dao;

import by.qdpub.db.QueryUtil;
import by.qdpub.entities.CarEntity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CarJdbcDao implements CarDao {

    @Override
    public void createCar(CarEntity car) throws ClassNotFoundException, SQLException {
        createCar(car.getName(), car.getBrand(), car.getSpeed(), car.getAge(), car.getPrice());
    }

    @Override
    public void createCar(String name, String brand, int speed, int age, int price) {

        String sql;
        Statement statement;

        JdbcMysqlUtil JDBCUtil = new JdbcMysqlUtil();


        if (JDBCUtil.checkJdbcDriver()) {

            statement = JDBCUtil.getStatement();
            sql = "INSERT INTO `webapp`.`car` (`name`, `brand`, `speed`, `age`, `price`) VALUES ('" + name + "', '" + brand + "', '" + speed + "', '" + age + "', '" + price + "');";

            try {
                statement.execute(sql);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } finally {
                JDBCUtil.closeStatementAndConnection();
            }


        } else {
            System.out.println("Mysql connector isn't work!");
        }
    }

    @Override
    public CarEntity readCarById(int id) throws SQLException {
        String sql;

        try (Connection connection = new JdbcMysqlUtil().getConnection();
             Statement statement = connection.createStatement()) {

            sql = QueryUtil.getSearchQuery("webapp", "car", "id", id);

            try {
                ResultSet rs = statement.executeQuery(sql);
                if (rs.next()) {
                    int r_id = rs.getInt(1);
                    String r_name = rs.getString(2);
                    String r_brand = rs.getString(3);
                    int r_speed = rs.getInt(4);
                    int r_age = rs.getInt(5);
                    int r_price = rs.getInt(6);

                    return new CarEntity(r_id, r_name, r_brand, r_speed, r_age, r_price);
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }


        return null;
    }

    @Override
    public Iterable<CarEntity> readAllCars() throws SQLException {

        String sql;
        ArrayList<CarEntity> result = new ArrayList<>();

        try (Connection connection = new JdbcMysqlUtil().getConnection();
             Statement statement = connection.createStatement()) {

            sql = QueryUtil.getSearchQuery("webapp", "car");

            try {
                ResultSet rs = statement.executeQuery(sql);
                while (rs.next()) {

                    int r_id = rs.getInt(1);
                    String r_name = rs.getString(2);
                    String r_brand = rs.getString(3);
                    int r_speed = rs.getInt(4);
                    int r_age = rs.getInt(5);
                    int r_price = rs.getInt(6);

                    result.add(new CarEntity(r_id, r_name, r_brand, r_speed, r_age, r_price));

                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }


        return result;
    }

    @Override
    public void updateCarById(int id, String new_name, String new_brand, int new_speed, int new_age, int new_price) {
        String sql;

        try (Connection connection = new JdbcMysqlUtil().getConnection();
             Statement statement = connection.createStatement()) {

            sql = "UPDATE `webapp`.`car` SET `name` = '" + new_name + "',`brand` = '" + new_brand + "', `speed` = '" + new_speed + "', `age` = '" + new_age +
                    "', `price` = '" + new_price + "' WHERE (`id` = '" + id + "');";
            statement.execute(sql);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {

        }

    }

    @Override
    public void updateCar(CarEntity updated_car) {
        updateCarById(updated_car.getId(), updated_car.getName(), updated_car.getBrand(),
                updated_car.getSpeed(), updated_car.getAge(), updated_car.getPrice());
    }

    @Override
    public void deleteCarById(int id) {
        String sql;

        try (Connection connection = new JdbcMysqlUtil().getConnection();
             Statement statement = connection.createStatement()) {

            sql = "DELETE FROM `webapp`.`car` WHERE (`id` = '" + id + "');";
            statement.execute(sql);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {

        }
    }
}
