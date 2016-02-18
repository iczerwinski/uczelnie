package com.demo.controller;

import com.demo.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchPageController {

    @Autowired
    private SchoolService schoolService;


    @RequestMapping(method = RequestMethod.GET, value = "/search")
    public String search(Model model, @RequestParam("schoolTypeId") Integer schoolTypeId, @RequestParam(value = "facultyName", required = false) String facultyName) {
        model.addAttribute("schools", schoolService.getSchoolsBySchollTypeIdAndFacultyName(schoolTypeId, facultyName));
        return "search";
    }

}
