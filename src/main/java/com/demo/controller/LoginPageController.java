package com.demo.controller;

import com.demo.dto.UserCredentialDto;
import com.demo.dto.UserDto;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionAttributeStore;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;

import static com.demo.model.Session.FIRST_NAME;
import static com.demo.model.Session.LOGGED_IN;

@Controller
@SessionAttributes({FIRST_NAME, LOGGED_IN})
public class LoginPageController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute(value = "userCredentials") UserCredentialDto userCredentialDto, Model model) {
        UserDto userDto = userService.login(userCredentialDto.getLogin(), userCredentialDto.getPassword());
        if (userDto != null) {
            model.addAttribute(FIRST_NAME, userDto.getFirstName());
            model.addAttribute(LOGGED_IN, Boolean.TRUE);
            return "mainPage";
        } else {
            model.addAttribute("msg", "login failed");
            return "login";
        }
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginPage(@ModelAttribute(value = "userCredentials") UserCredentialDto userCredentialDto, Model model) {
        return "login";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(@ModelAttribute(value = "userCredentials") UserCredentialDto userCredentialDto, Model model, SessionAttributeStore sessionAttributeStore, SessionStatus sessionStatus, WebRequest webRequest) {
        sessionStatus.setComplete();
        sessionAttributeStore.cleanupAttribute(webRequest, FIRST_NAME);
        sessionAttributeStore.cleanupAttribute(webRequest, LOGGED_IN);
        return "login";
    }
}
