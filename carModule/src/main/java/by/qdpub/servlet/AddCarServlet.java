package by.qdpub.servlet;

import by.qdpub.exception.CarDaoException;
import by.qdpub.service.CarService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/*@WebServlet(value = "/addCar")*/
public class AddCarServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/appweb111/addCar.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String carName = req.getParameter("carName");
        String carBrand = req.getParameter("carBrand");

        int carSpeed = 0;

        try {
            carSpeed = Integer.parseInt(req.getParameter("carSpeed"));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        int carAge = 0;

        try {
            carAge = Integer.parseInt(req.getParameter("carAge"));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        int carPrice = 0;

        try {
            carPrice = Integer.parseInt(req.getParameter("carPrice"));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        CarService cars = new CarService();
        try {
            cars.createCar(carName, carBrand, carSpeed, carAge, carPrice);
        } catch (CarDaoException e) {

            RequestDispatcher rd = req.getRequestDispatcher("/addCar.jsp");
            req.setAttribute("errormessage", e.getMessage());
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