package by.qdpub.dao;

import by.qdpub.entities.CarEntity;
import by.qdpub.exception.CarDaoException;
import by.qdpub.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.Optional;

@Component
public class CarSpringDataJPADao implements CarDao {

    @Autowired
    CarRepository carRepository;

    @Override
    public void createCar(CarEntity car) throws ClassNotFoundException, SQLException {
        carRepository.save(car);
    }

    @Override
    public void createCar(String name, String brand, int speed, int age, int price) throws CarDaoException {
        CarEntity pe = new CarEntity(name, brand, speed, age, price);
        carRepository.save(pe);
    }

    @Override
    public CarEntity readCarById(int id) throws SQLException {
        Optional<CarEntity> car = carRepository.findById(id);
        CarEntity carObj = car.orElse(new CarEntity());
        return carObj;
    }

    @Override
    public Iterable<CarEntity> readAllCars() throws SQLException {
        Iterable<CarEntity> allCars = carRepository.findAll();
        return allCars;
    }

    @Override
    public void updateCarById(int id, String new_name, String new_brand, int new_speed, int new_age, int new_price) throws CarDaoException {
        CarEntity carEntity = new CarEntity(id, new_name, new_brand, new_speed, new_age, new_price);
        carRepository.save(carEntity);
    }

    @Override
    public void updateCar(CarEntity updated_car) {
        carRepository.save(updated_car);
    }

    @Override
    public void deleteCarById(int id) {
        carRepository.deleteById(id);
    }
}
