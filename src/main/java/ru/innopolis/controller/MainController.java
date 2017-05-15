package ru.innopolis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by admin on 15.05.2017. 123
 */

@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping(method = RequestMethod.GET)
    public String start (Model model){
        return "index";
    }
}
