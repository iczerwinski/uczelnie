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


@Controller
public class SearcherController {


    @Autowired
    private SchoolTypeService schoolTypeService;
    @Autowired
    private CityService cityService;
    @Autowired
    private SchoolService schoolService;
    @Autowired
    private FacultyService facultyService;


    @RequestMapping(value = "/searcher", method = RequestMethod.GET)
    public String searcher(Model model) {
        model.addAttribute("schools", schoolService.getSchools());
        model.addAttribute("schoolTypes", schoolTypeService.getSchoolTypes());
        model.addAttribute("faculties", facultyService.findFaculties());
        model.addAttribute("cities", cityService.getCities());
        return "searcher";
    }


}
