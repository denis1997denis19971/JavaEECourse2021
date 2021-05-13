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

@WebServlet(value = "/user")
public class UserServlet extends HttpServlet {

    private CarJdbcDao Car;

    public CarJdbcDao getCar() {
        return Car;
    }


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher rd = req.getRequestDispatcher("/user.jsp");

        try {
            req.setAttribute("carList", Car.readAllCars());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        rd.forward(req, resp);

    }

    @Override
    public void init() throws ServletException {
        Car = new CarJdbcDao();
    }
}
