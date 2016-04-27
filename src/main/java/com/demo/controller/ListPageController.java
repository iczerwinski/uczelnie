package com.demo.controller;

import com.demo.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ListPageController {

    @Autowired
    private SchoolService schoolService;


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String listPage(Model model) {
        model.addAttribute("schools", schoolService.getSchools());
        return "list";
    }


    @RequestMapping(method = RequestMethod.GET, value = "/list/city/{id}")
    public String citieslistpage(Model model, @PathVariable(value = "id") Integer cityId) {
        model.addAttribute("schools", schoolService.getSchoolsByCityId(cityId));
        return "list";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/list/faculty/{id}")
    public String facultieslistpage(Model model, @PathVariable(value = "id") Integer facultyId) {
        model.addAttribute("schools", schoolService.getSchoolsByFacultyId(facultyId));
        return "list";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/list/facultycity/{id}")
    public String facultiescitieslistpage(Model model, @PathVariable(value = "id") Integer facultyId) {
        model.addAttribute("schools", schoolService.getSchoolsByFacultyId(facultyId));
        return "list";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/list/voivodeship/{id}")
    public String voivodeshiplistpage(Model model, @PathVariable(value = "id") Integer voivodeshipId) {
        model.addAttribute("schools", schoolService.getSchoolsByVoivodeshipId(voivodeshipId));
        return "list";
    }
}
