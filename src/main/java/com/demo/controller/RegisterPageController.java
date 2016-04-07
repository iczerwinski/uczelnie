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
@SessionAttributes({FIRST_NAME, LOGGED_IN})
@RequestMapping("/register")
public class RegisterPageController {

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.POST)
    public String register(@ModelAttribute(value = "userCredentials") UserCredentialDto userCredentialDto, Model model) {
        UserDto userDto = userService.register(userCredentialDto.getFirstName(), userCredentialDto.getLogin(), userCredentialDto.getPassword());
        if (userDto == null) {
            model.addAttribute("msg", "asdas ");
            return "register";
        } else {
            model.addAttribute(FIRST_NAME, userDto.getFirstName());
            model.addAttribute(LOGGED_IN, Boolean.TRUE);
            model.addAttribute("msg", "You've beend registered");
            return "message";
        }
    }

    @RequestMapping(method = RequestMethod.GET)
    public String showRegister(@ModelAttribute(value = "userCredentials") UserCredentialDto userCredentialDto) {
        return "register";
    }
}
