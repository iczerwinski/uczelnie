package com.demo.controller;

import com.demo.dto.UserCredentialDto;
import com.demo.dto.UserDto;
import com.demo.model.Session;
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
@SessionAttributes({LOGGED_IN, FIRST_NAME})
@RequestMapping("/admin")
public class AdminPageController {

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String showAdmin(@ModelAttribute(value = "userCredentials") UserCredentialDto userCredentialDto, Model model) {
        if (userService.isLoggedIn(model)) {
            return "admin";
        } else {
            return "login";
        }
    }
}
