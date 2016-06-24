package com.demo.controller;

import com.demo.dto.UserCredentialDto;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import static com.demo.model.Session.FIRST_NAME;
import static com.demo.model.Session.LOGGED_IN;

@Controller
@SessionAttributes({FIRST_NAME, LOGGED_IN})
public class LoginPageController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute(value = "userCredentials") UserCredentialDto userCredentialDto, Model model) {
        userService.login(model, userCredentialDto.getLogin(), userCredentialDto.getPassword());
        if (userService.isLoggedIn(model))
            return "mainPage";
        else
            return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginPage(@ModelAttribute(value = "userCredentials") UserCredentialDto userCredentialDto, Model model) {
        return "login";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(Model model, @ModelAttribute(value = "userCredentials") UserCredentialDto userCredentialDto) {
        userService.logout(model);
        return "login";
    }
}
