package by.qdpub.dao;

import by.qdpub.entities.CarEntity;
import by.qdpub.exception.CarDaoException;

import java.sql.SQLException;

/*        private int id;
private String name;
private String brand;
private int speed;
private int age;
private int price;*/

public interface CarDao {

    void createCar(CarEntity car) throws ClassNotFoundException, SQLException;

    void createCar(String name, String brand, int speed, int age, int price) throws CarDaoException;

    CarEntity readCarById(int id) throws SQLException;

    Iterable<CarEntity> readAllCars() throws SQLException;

    void updateCarById(int id, String new_name, String new_brand, int new_speed, int new_age, int new_price) throws CarDaoException;

    void updateCar(CarEntity updated_car);

    void deleteCarById(int id);

}
