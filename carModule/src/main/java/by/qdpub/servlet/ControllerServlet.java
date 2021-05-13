package by.qdpub.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/by/qdpub/controller")
public class ControllerServlet extends HttpServlet {

    private static final String ADMIN_LOGIN = "admin";
    private static final String ADMIN_PASSWORD = "admin";
    private static final String USER_LOGIN = "user";
    private static final String USER_PASSWORD = "user";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String login = req.getParameter("login");
        String password = req.getParameter("password");

        if (USER_LOGIN.equals(login) && USER_PASSWORD.equals(password)) {
            RequestDispatcher rd = req.getRequestDispatcher("/user");
            rd.forward(req, resp);
        } else if (ADMIN_LOGIN.equals(login) && ADMIN_PASSWORD.equals(password)) {
            RequestDispatcher rd = req.getRequestDispatcher("/admin");
            req.setAttribute("personList", AdminServlet.getPersons());
            rd.forward(req, resp);
        } else {
            RequestDispatcher rd = req.getRequestDispatcher("/message");
            rd.forward(req, resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }
}
