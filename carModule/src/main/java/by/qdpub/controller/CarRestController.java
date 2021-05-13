package by.qdpub.controller;

import by.qdpub.entities.CarEntity;
import by.qdpub.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
public class CarRestController {

    @Autowired
    CarService carService;

    @GetMapping("/rest/car/list")
    public List<CarEntity> mk() {
        List<CarEntity> carEntities = null;
        try {
            carEntities = (List<CarEntity>) carService.readAllCars();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return carEntities;
    }

}
