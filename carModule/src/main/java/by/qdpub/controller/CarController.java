package by.qdpub.controller;

import by.qdpub.entities.CarEntity;
import by.qdpub.entities.Curses;
import by.qdpub.exception.CarDaoException;
import by.qdpub.service.CarService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class CarController {

    @Autowired
    CarService carService;

    /**
     * @param model
     * @return view
     */
    @RequestMapping(value = "/homePage")
    public String GetTestPage(ModelMap model) {

        try {
            model.addAttribute("carList", carService.readAllCars());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        Map<String, String> urlVaribles = new HashMap<String, String>();
        String url = "https://www.nbrb.by/api/exrates/rates/840?parammode=1";

        RestTemplate restTemplate = new RestTemplate();


        String result = restTemplate.getForObject(url, String.class);

        System.out.println(result);

        ObjectMapper objectMapper = new ObjectMapper();
        Curses curses = null;
        try {
            curses = objectMapper.readValue(result, Curses.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        model.addAttribute("curname", curses.Cur_Name);
        model.addAttribute("officialrate", String.valueOf(curses.Cur_OfficialRate));
        model.addAttribute("scale", String.valueOf(curses.Cur_Scale));
        model.addAttribute("curid", String.valueOf(curses.Cur_ID));

        return "test1";
    }

    @RequestMapping(value = "/curs")
    public String GetGoogle(ModelMap model) {

        Map<String, String> urlVaribles = new HashMap<String, String>();
        String url = "https://www.nbrb.by/api/exrates/rates/840?parammode=1";

        RestTemplate restTemplate = new RestTemplate();


        String result = restTemplate.getForObject(url, String.class);

        System.out.println(result);

        ObjectMapper objectMapper = new ObjectMapper();
        Curses curses = null;
        try {
            curses = objectMapper.readValue(result, Curses.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        model.addAttribute("curname", curses.Cur_Name);
        model.addAttribute("officialrate", String.valueOf(curses.Cur_OfficialRate));
        model.addAttribute("scale", String.valueOf(curses.Cur_Scale));
        model.addAttribute("curid", String.valueOf(curses.Cur_ID));

        return "test1";
    }


    @RequestMapping(value = "/springdata")
    public String GetTestPageSpringData(ModelMap model) {

        Iterable<CarEntity> cars = null;

        try {
            cars = carService.readAllCars();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        Map<String, String> urlVaribles = new HashMap<String, String>();
        String url = "https://www.nbrb.by/api/exrates/rates/840?parammode=1";

        RestTemplate restTemplate = new RestTemplate();


        String result = restTemplate.getForObject(url, String.class);

        System.out.println(result);

        ObjectMapper objectMapper = new ObjectMapper();
        Curses curses = null;
        try {
            curses = objectMapper.readValue(result, Curses.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        model.addAttribute("curname", curses.Cur_Name);
        model.addAttribute("officialrate", String.valueOf(curses.Cur_OfficialRate));
        model.addAttribute("scale", String.valueOf(curses.Cur_Scale));
        model.addAttribute("curid", String.valueOf(curses.Cur_ID));

        model.addAttribute("carList", cars);
        return "test1";

    }

    @RequestMapping(value = "/updateCarSpring", method = RequestMethod.GET)
    public String GetUpdatePage(ModelMap model,
                                @RequestParam String updateCarId,
                                @RequestParam String updateCarName,
                                @RequestParam String updateCarBrand,
                                @RequestParam String updateCarSpeed,
                                @RequestParam String updateCarAge,
                                @RequestParam String updateCarPrice
    ) {

        model.addAttribute("updateCarId", Integer.valueOf(updateCarId));
        model.addAttribute("updateCarName", updateCarName);
        model.addAttribute("updateCarBrand", updateCarBrand);
        model.addAttribute("updateCarSpeed", Integer.valueOf(updateCarSpeed));
        model.addAttribute("updateCarAge", Integer.valueOf(updateCarAge));
        model.addAttribute("updateCarPrice", Integer.valueOf(updateCarPrice));


        return "updateCarPage";
    }

    @RequestMapping(value = "/updateCarSpring", method = RequestMethod.POST)
    public String UpdatePage(ModelMap model,
                             @RequestParam String carName,
                             @RequestParam String carBrand,
                             @RequestParam String carSpeed,
                             @RequestParam String carAge,
                             @RequestParam String carPrice) {

        try {
            carService.updateCarById(Integer.valueOf(0), carName, carBrand, Integer.valueOf(carSpeed), Integer.valueOf(carAge),
                    Integer.valueOf(carPrice));
        } catch (NumberFormatException | CarDaoException e) {
            e.printStackTrace();
        }

        try {
            model.addAttribute("carList", carService.readAllCars());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        Map<String, String> urlVaribles = new HashMap<String, String>();
        String url = "https://www.nbrb.by/api/exrates/rates/840?parammode=1";

        RestTemplate restTemplate = new RestTemplate();


        String result = restTemplate.getForObject(url, String.class);

        System.out.println(result);

        ObjectMapper objectMapper = new ObjectMapper();
        Curses curses = null;
        try {
            curses = objectMapper.readValue(result, Curses.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        model.addAttribute("curname", curses.Cur_Name);
        model.addAttribute("officialrate", String.valueOf(curses.Cur_OfficialRate));
        model.addAttribute("scale", String.valueOf(curses.Cur_Scale));
        model.addAttribute("curid", String.valueOf(curses.Cur_ID));

        return "test1";
    }


    @RequestMapping(value = "/addCarSpring", method = RequestMethod.GET)
    public String AddCarSpring(ModelMap model,
                               @RequestParam String addCarName,
                               @RequestParam String addCarBrand,
                               @RequestParam String addCarSpeed,
                               @RequestParam String addCarAge,
                               @RequestParam String addCarPrice) {


        model.addAttribute("carName", addCarName);
        model.addAttribute("carBrand", addCarBrand);
        model.addAttribute("carSpeed", addCarSpeed);
        model.addAttribute("carAge", addCarAge);
        model.addAttribute("carPrice", addCarPrice);

        return "addCar";
    }

    @RequestMapping(value = "/addCar", method = RequestMethod.POST)
    public String AddCarSpringPost(ModelMap model,
                                   @RequestParam String carName,
                                   @RequestParam String carBrand,
                                   @RequestParam String carSpeed,
                                   @RequestParam String carAge,
                                   @RequestParam String carPrice) {


        try {
            try {
                carService.createCar(carName, carBrand, Integer.valueOf(carSpeed), Integer.valueOf(carAge), Integer.valueOf(carPrice));
            } catch (CarDaoException throwables) {
                throwables.printStackTrace();
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        try {
            model.addAttribute("carList", carService.readAllCars());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        Map<String, String> urlVaribles = new HashMap<String, String>();
        String url = "https://www.nbrb.by/api/exrates/rates/840?parammode=1";

        RestTemplate restTemplate = new RestTemplate();


        String result = restTemplate.getForObject(url, String.class);

        System.out.println(result);

        ObjectMapper objectMapper = new ObjectMapper();
        Curses curses = null;
        try {
            curses = objectMapper.readValue(result, Curses.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        model.addAttribute("curname", curses.Cur_Name);
        model.addAttribute("officialrate", String.valueOf(curses.Cur_OfficialRate));
        model.addAttribute("scale", String.valueOf(curses.Cur_Scale));
        model.addAttribute("curid", String.valueOf(curses.Cur_ID));

        return "test1";

    }

    @RequestMapping(value = "/deleteCarSpring", method = RequestMethod.GET)
    public String deletePage(ModelMap model, @RequestParam String deleteCarId) {

        try {
            carService.deleteCarById(Integer.valueOf(deleteCarId));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        try {
            model.addAttribute("carList", carService.readAllCars());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        Map<String, String> urlVaribles = new HashMap<String, String>();
        String url = "https://www.nbrb.by/api/exrates/rates/840?parammode=1";

        RestTemplate restTemplate = new RestTemplate();


        String result = restTemplate.getForObject(url, String.class);

        System.out.println(result);

        ObjectMapper objectMapper = new ObjectMapper();
        Curses curses = null;
        try {
            curses = objectMapper.readValue(result, Curses.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        model.addAttribute("curname", curses.Cur_Name);
        model.addAttribute("officialrate", String.valueOf(curses.Cur_OfficialRate));
        model.addAttribute("scale", String.valueOf(curses.Cur_Scale));
        model.addAttribute("curid", String.valueOf(curses.Cur_ID));

        return "test1";
    }
}
