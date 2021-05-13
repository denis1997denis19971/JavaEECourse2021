package by.qdpub.servlet;

import by.qdpub.dao.CarJdbcDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(value = "/deleteCar")
public class DeleteCarServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Integer carId = Integer.valueOf(req.getParameter("deleteCarId"));
        CarJdbcDao car = new CarJdbcDao();
        car.deleteCarById(carId);

        RequestDispatcher rd = req.getRequestDispatcher("/user");
        try {
            req.setAttribute("carList", car.readAllCars());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        super.service(req, resp);

    }
}