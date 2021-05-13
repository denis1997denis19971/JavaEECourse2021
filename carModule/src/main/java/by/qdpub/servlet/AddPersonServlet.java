package by.qdpub.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/addPerson")
public class AddPersonServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/appweb111/addPerson.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

/*        try {

            PersonService serv = new PersonService();
            serv.createPerson(req, resp);

            RequestDispatcher rd = req.getRequestDispatcher("/admin");

            req.setAttribute("personList", serv.readAllPersons());
            rd.forward(req, resp);
        } catch (PersonException e) {
            HttpSession session = req.getSession(true);
            session.setAttribute("message", e.getMessage());

            resp.sendRedirect("/appweb111/addPerson.jsp");
        }*/


    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        super.service(req, resp);

    }
}