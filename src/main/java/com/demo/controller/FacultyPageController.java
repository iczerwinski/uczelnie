package com.demo.controller;


import com.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller

public class FacultyPageController {
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

//    @RequestMapping(method = RequestMethod.GET, value = "/faculty/{id}")
//    public String facultypage(Model model, @PathVariable(value = "id") Integer schoolId, Integer departmentId) {
//        model.addAttribute("school", schoolService.get(schoolId));
//        model.addAttribute("schoolFaculties", facultyService.getBySchoolId(schoolId));
//        model.addAttribute("cities", cityService.getCities());
//        model.addAttribute("schoolTypes", schoolTypeService.getSchoolTypes());
//        model.addAttribute("faculties", facultyService.findFaculties());
//        model.addAttribute("schoolDepartments", departmentService.getBySchoolId(schoolId));
//        model.addAttribute("facultiesByDepartment", facultyService.getByDepartmentId(departmentId));
//        return "faculty";
//    }
//@RequestMapping(method = RequestMethod.GET, value = "/offer/department/{id}")
//public String facultiesdepartmentpage (Model model, @PathVariable(value = "id") Integer departmentId, Integer schoolId) {
//    model.addAttribute("facultiesByDepartment", facultyService.getByDepartmentId(departmentId));
//    model.addAttribute("school", schoolService.get(schoolId));
//    model.addAttribute("schoolFaculties", facultyService.getBySchoolId(schoolId));
//    model.addAttribute("cities", cityService.getCities());
//    model.addAttribute("schoolTypes", schoolTypeService.getSchoolTypes());
//    model.addAttribute("faculties", facultyService.findFaculties());
//    return "faculty";
//}
}
