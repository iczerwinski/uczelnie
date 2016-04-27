package com.demo.controller;

import com.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller


public class OfferPageController {
    @Autowired
    private CityService cityService;
    @Autowired
    private SchoolService schoolService;
    @Autowired
    private FacultyService facultyService;
    @Autowired
    private SchoolTypeService schoolTypeService;
    @Autowired
    private DepartmentService departmentService;


    @RequestMapping(method = RequestMethod.GET, value = "/offer/{id}")
    public String offerpage(Model model, @PathVariable(value = "id") Integer schoolId) {
        model.addAttribute("school", schoolService.get(schoolId));
        model.addAttribute("schoolFaculties", facultyService.getBySchoolId(schoolId));
        model.addAttribute("cities", cityService.getCities());
        model.addAttribute("schoolTypes", schoolTypeService.getSchoolTypes());
        model.addAttribute("faculties", facultyService.findFaculties());
        model.addAttribute("schoolDepartments", departmentService.getBySchoolId(schoolId));
        return "offer";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/offer/department/{id}")
    public String facultiesdepartmentpage(Model model, @PathVariable(value = "departmentId") Integer departmentId, Integer schoolId) {
        model.addAttribute("facultiesByDepartment", facultyService.getByDepartmentId(departmentId));
        model.addAttribute("school", schoolService.get(schoolId));
        model.addAttribute("schools", schoolService.getSchools());
        model.addAttribute("schoolFaculties", facultyService.getBySchoolId(schoolId));
        model.addAttribute("cities", cityService.getCities());
        model.addAttribute("schoolTypes", schoolTypeService.getSchoolTypes());
        model.addAttribute("faculties", facultyService.findFaculties());
        model.addAttribute("schoolDepartments", departmentService.getBySchoolId(schoolId));
        model.addAttribute("Departments", departmentService.getDepartments());
        return "faculty";
    }

}
