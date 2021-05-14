package by.qdpub.controller;

import by.qdpub.entities.PersonEntity;
import by.qdpub.repository.PersonRepository;
import by.qdpub.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class PersonController {

    @Autowired
    PersonService personService;

    @Autowired
    PersonRepository personRepository;

    /**
     * @param model
     * @return view
     */
    @RequestMapping(value = "/homePage")
    public String GetTestPage(ModelMap model) {
        return "/authorization.jsp";
    }

    @RequestMapping(value = "/person", method = RequestMethod.POST)
    public String PostAuthPage(ModelMap model, HttpSession session, @RequestParam String loginfromauth) {
        model.addAttribute("personList", personService.readAllPersons());
        session.setAttribute("login", loginfromauth);
        return "redirect:/springdata";
    }

    @RequestMapping(value = "/springdata")
    public String GetTestPageSpringData(ModelMap model) {
        Iterable<PersonEntity> users = personRepository.findAll();
        model.addAttribute("personList", users);
        return "test1";
    }

    @RequestMapping(value = "/updatePage", method = RequestMethod.GET)
    public String GetUpdatePage(ModelMap model, @RequestParam String updatePersonId,
                                @RequestParam String updatePersonName,
                                @RequestParam String updatePersonAge) {
        System.out.println();

        model.addAttribute("updatePersonId", Integer.valueOf(updatePersonId));
        model.addAttribute("updatePersonName", updatePersonName);
        model.addAttribute("updatePersonAge", Integer.valueOf(updatePersonAge));

        System.out.println();

        return "updatePersonPage";
    }

    @RequestMapping(value = "/updatePage", method = RequestMethod.POST)
    public String UpdatePage(ModelMap model, @RequestParam String personId,
                             @RequestParam String personName,
                             @RequestParam String personAge) {
        System.out.println();

        try {
            personService.updatePersonById(Integer.valueOf(personId), personName, Integer.valueOf(personAge));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        model.addAttribute("personList", personService.readAllPersons());
        System.out.println();

        return "test1";
    }

    @RequestMapping(value = "/addPersonSpring", method = RequestMethod.GET)
    public String AddPersonSpring(ModelMap model,
                                  @RequestParam String addPersonName,
                                  @RequestParam String addPersonAge) {


        model.addAttribute("addPersonName", addPersonName);
        model.addAttribute("addPersonAge", addPersonAge);


        return "addPerson";
    }

    @RequestMapping(value = "/addPersonSpring", method = RequestMethod.POST)
    public String AddPersonSpringPost(ModelMap model,
                                      @RequestParam String personName,
                                      @RequestParam String personAge) {


        try {
            personService.createPerson(personName, Integer.valueOf(personAge));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        model.addAttribute("personList", personService.readAllPersons());
        System.out.println();

        return "test1";
    }

    @RequestMapping(value = "/deletePageSpring", method = RequestMethod.GET)
    public String deletePage(ModelMap model, @RequestParam String deletePersonId) {

        try {
            personService.deletePersonById(Integer.valueOf(deletePersonId));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        model.addAttribute("personList", personService.readAllPersons());

        return "test1";
    }

    @RequestMapping(value = "/asc", method = RequestMethod.GET)
    public String testSpring(ModelMap model) {

        Iterable<PersonEntity> byAge = personRepository.findByAgeBetweenOrderByAgeAsc(10, 100);
        model.addAttribute("personList", byAge);
        return "test1";
    }

    @RequestMapping(value = "/desc", method = RequestMethod.GET)
    public String testSpring2(ModelMap model) {

        Iterable<PersonEntity> byAge = personRepository.findByAgeBetweenOrderByAgeDesc(10, 100);
        model.addAttribute("personList", byAge);
        return "test1";
    }

    @RequestMapping(value = "/like", method = RequestMethod.GET)
    public String testSpringLike(ModelMap model) {

        Iterable<PersonEntity> byAge = personRepository.findByNameLike("A%");
        model.addAttribute("personList", byAge);
        return "test1";
    }

    @RequestMapping(value = "/allasc", method = RequestMethod.GET)
    public String testSpringAllAsc(ModelMap model) {

        Iterable<PersonEntity> byAge = personRepository.findAllByOrderByIdAsc();
        model.addAttribute("personList", byAge);
        return "test1";
    }

    @RequestMapping(value = "/alldesc", method = RequestMethod.GET)
    public String testSpringAllDesc(ModelMap model) {

        Iterable<PersonEntity> byAge = personRepository.findAllByOrderByIdDesc();
        model.addAttribute("personList", byAge);
        return "test1";
    }

    @RequestMapping(value = "/native")
    public String GetFromNativeQuery(ModelMap model) {
        PersonEntity blaBla = personRepository.findBlaBla("VALENTIN", 35);
        return "test1";
    }

    @RequestMapping(value = "/nativelist")
    public String GetFromNativeQueryList(ModelMap model) {

        Iterable<PersonEntity> blaBlalist = personRepository.findBlaBla2("VALENTIN", 35);
        model.addAttribute("personList", blaBlalist);

        return "test1";
    }


    @RequestMapping(value = "/by40", method = RequestMethod.GET)
    public String testSpring40(ModelMap model) {

        Iterable<PersonEntity> byAge = personRepository.findByAge(40);
        model.addAttribute("personList", byAge);
        return "test1";
    }

    @RequestMapping(value = "/by50", method = RequestMethod.GET)
    public String testSpring50(ModelMap model) {

        Iterable<PersonEntity> byAge = personRepository.findByAge(50);
        model.addAttribute("personList", byAge);
        return "test1";
    }

    @RequestMapping(value = "/by18", method = RequestMethod.GET)
    public String testSpring18(ModelMap model) {

        Iterable<PersonEntity> byAge = personRepository.findByAge(18);
        model.addAttribute("personList", byAge);
        return "test1";
    }

    @RequestMapping(value = "/by21", method = RequestMethod.GET)
    public String testSpring21(ModelMap model) {

        Iterable<PersonEntity> byAge = personRepository.findByAge(21);
        model.addAttribute("personList", byAge);
        return "test1";
    }

}
