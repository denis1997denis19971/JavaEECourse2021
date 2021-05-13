package by.qdpub.servlet;

import by.qdpub.entities.PersonEntity;
import by.qdpub.service.PersonService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/updatePerson")
public class updatePersonServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/updatePersonPage.jsp");
        req.setAttribute("updatePersonId", req.getParameter("updatePersonId"));
        req.setAttribute("updatePersonName", req.getParameter("updatePersonName"));
        req.setAttribute("updatePersonAge", req.getParameter("updatePersonAge"));
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String personName = req.getParameter("personName");
        Integer personId = Integer.valueOf(req.getParameter("personId"));
        Integer personAge = Integer.valueOf(req.getParameter("personAge"));
        PersonService persserv = new PersonService();

        persserv.updatePerson(new PersonEntity(personId, personName, personAge));

        RequestDispatcher rd = req.getRequestDispatcher("/admin");

        req.setAttribute("personList", persserv.readAllPersons());

        rd.forward(req, resp);

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        super.service(req, resp);

    }
}