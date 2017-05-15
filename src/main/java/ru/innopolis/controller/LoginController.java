package ru.innopolis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by admin on 15.05.2017. 123
 */

@Controller
@RequestMapping("/login")
public class LoginController {

    public String loginPage(Model model){
        return "login";
    }
}
