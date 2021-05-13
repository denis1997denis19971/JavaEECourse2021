package by.qdpub.service;

import by.qdpub.dao.CarDao;
import by.qdpub.entities.CarEntity;
import by.qdpub.exception.CarDaoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;

@Service
public class CarService {

    public static final String MY_MASK = "[a-zA-Z0-9 ]*";

    @Autowired
    @Qualifier("carSpringDataJPADao")
    CarDao cars;


    public CarService() {
        /*        cars = new CarJdbcDao();*/
    }


    public void createCar(CarEntity car) throws ClassNotFoundException, SQLException {
        cars.createCar(car);
    }


    public void createCar(String name, String brand, int speed, int age, int price) throws CarDaoException {
        /*        if (name.matches(MY_MASK) && brand.matches(MY_MASK)) {*/
        cars.createCar(name, brand, speed, age, price);
/*        }else
            throw new CarDaoException("Name is not correct.\n" +
                    "Please check your name!");*/

    }

    public CarEntity readCarById(int id) throws SQLException {
        return cars.readCarById(id);
    }

    public Iterable<CarEntity> readAllCars() throws SQLException {
        return cars.readAllCars();
    }


    public void updateCarById(int id, String new_name, String new_brand, int new_speed, int new_age, int new_price) throws CarDaoException {

        ArrayList<String> errors = new ArrayList<>();

        if (!(new_name.matches(MY_MASK))) {

            errors.add("New name is not correct.\n" +
                    "Please check your name!");

        }
        if (!(new_brand.matches(MY_MASK))) {
            errors.add("New brand is not correct.\n" +
                    "Please check your name!");
        }

        if (new_speed < 100) {
            errors.add("Speed is not correct!");
        }

        if (new_age > 100) {
            errors.add("Age is not correct!");
        }

        if (new_price < 10000) {
            errors.add("Price is not correct!");
        }

        if ((errors == null) || (errors.size() == 0)) {
            cars.updateCarById(id, new_name, new_brand, new_speed, new_age, new_price);
        } else {
            throw new CarDaoException(errors);
        }

    }


    public void updateCar(CarEntity updated_car) {
        cars.updateCar(updated_car);
    }


    public void deleteCarById(int id) {
        cars.deleteCarById(id);
    }
}
