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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

@WebServlet(value = "/admin")
public class AdminServlet extends HttpServlet {

    static int maxId;
    private static ArrayList<PersonEntity> persons;

    public static void setPersons(String name, Integer id, Integer age) {
        /*        persons.add(new PersonEntity(id, name, age));*/
    }

    public static ArrayList<PersonEntity> getPersons() {
        return persons;
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PersonService PersonService = new PersonService();

        RequestDispatcher rd = req.getRequestDispatcher("/admin.jsp");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();

        req.setAttribute("personList", PersonService.readAllPersons());

        rd.forward(req, resp);

    }

    @Override
    public void init() throws ServletException {

    }
}
