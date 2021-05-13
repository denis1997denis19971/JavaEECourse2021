package by.qdpub.servlet;

import by.qdpub.service.PersonService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/deletePerson")
public class DeletePersonServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer personId = Integer.valueOf(req.getParameter("deletePersonId"));

        PersonService persserv = new PersonService();
        persserv.deletePersonById(personId);

        RequestDispatcher rd = req.getRequestDispatcher("/admin");

        req.setAttribute("personList", persserv.readAllPersons());

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