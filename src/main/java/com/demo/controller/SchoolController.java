package com.demo.controller;

import com.demo.dto.SchoolRequestDto;
import com.demo.entity.SchoolType;
import com.demo.service.FacultyService;
import com.demo.service.SchoolService;
import com.demo.service.SchoolTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/school")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;
    @Autowired
    private FacultyService facultyService;
    @Autowired
    private SchoolTypeService schoolTypeService;

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView addNewSchool(@RequestBody SchoolRequestDto newSchool) {
        schoolService.add(newSchool);
        return new ModelAndView("redirect:/");
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}/edit")
    public String editPage(Model model, @PathVariable(value = "id") Integer schoolId) {
        model.addAttribute("school", schoolService.get(schoolId));
        return "schoolEdit";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{schoolId}")
    public String edit(@PathVariable(value = "schoolId") Integer schoolId, @ModelAttribute(value = "school") SchoolRequestDto school) {
        schoolService.update(schoolId, school);
        return "redirect:/";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public String schoolInfoPage(Model model, @PathVariable(value = "id") Integer schoolId) {
        model.addAttribute("school", schoolService.get(schoolId));
        model.addAttribute("schoolFaculties", facultyService.getBySchoolId(schoolId));
        return "school";
    }



}
