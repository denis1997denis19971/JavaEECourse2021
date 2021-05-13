package by.qdpub.servlet;

import by.qdpub.exception.CarDaoException;
import by.qdpub.service.CarService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(value = "/updateCar")
public class updateCarServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/updateCarPage.jsp");

        req.setAttribute("updateCarId", req.getParameter("updateCarId"));
        req.setAttribute("updateCarName", req.getParameter("updateCarName"));
        req.setAttribute("updateCarBrand", req.getParameter("updateCarBrand"));
        req.setAttribute("updateCarSpeed", req.getParameter("updateCarSpeed"));
        req.setAttribute("updateCarAge", req.getParameter("updateCarAge"));
        req.setAttribute("updateCarPrice", req.getParameter("updateCarPrice"));

        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        CarService cars = new CarService();

        Integer carId = Integer.valueOf(req.getParameter("carId"));
        String carName = req.getParameter("carName");
        String carBrand = req.getParameter("carBrand");

        Integer carSpeed = Integer.valueOf(req.getParameter("carSpeed"));
        Integer carAge = Integer.valueOf(req.getParameter("carAge"));
        Integer carPrice = Integer.valueOf(req.getParameter("carPrice"));


        try {
            cars.updateCarById(carId, carName, carBrand, carSpeed, carAge, carPrice);
        } catch (CarDaoException throwables) {

            RequestDispatcher rd = req.getRequestDispatcher("/updateCarPage.jsp");
            req.setAttribute("errormessage", throwables.getStringArray());
            rd.forward(req, resp);
            return;

        }

        RequestDispatcher rd = req.getRequestDispatcher("/user");

        try {
            req.setAttribute("carList", cars.readAllCars());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        rd.forward(req, resp);

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        super.service(req, resp);

    }
}