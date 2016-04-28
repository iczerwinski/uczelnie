package com.demo.controller;

import com.demo.service.CityService;
import com.demo.service.FacultyService;
import com.demo.service.SchoolService;
import com.demo.service.SchoolTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import static com.demo.entity.City.WARSAW_ID;

@Controller
public class MainPageController {


    @Autowired
    private FacultyService facultyService;

    @Autowired
    private SchoolTypeService schoolTypeService;
    @Autowired
    private CityService cityService;
    @Autowired
    private SchoolService schoolService;



    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String mainPage(@RequestParam(required = false, defaultValue = WARSAW_ID) Integer cityId, Model model) {
        model.addAttribute("schools", schoolService.getSchools());
        model.addAttribute("schoolTypes", schoolTypeService.getSchoolTypes());
        model.addAttribute("faculties", facultyService.findFaculties());
        model.addAttribute("facultiesByCity", facultyService.findFacultiesByCity(cityId));
        model.addAttribute("cities", cityService.getCities());
        model.addAttribute("promo", schoolService.getSchoolPromo());
        return "mainPage";
    }

}
