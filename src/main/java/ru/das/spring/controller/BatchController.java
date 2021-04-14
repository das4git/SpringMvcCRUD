package ru.das.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.das.spring.dao.PersonDAO;


@Controller
public class BatchController {
    private final PersonDAO personDAO;

    @Autowired
    public BatchController(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }


    @GetMapping("/startBatch")
    public String withBatch(Model model) {
        model.addAttribute("result", personDAO.testBatch());
        return "batchResult";
    }
}
