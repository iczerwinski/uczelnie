package com.demo.controller;

import com.demo.dto.SchoolRequestDto;
import com.demo.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/school")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView add(@ModelAttribute(value = "newSchool") SchoolRequestDto newSchool) {
        schoolService.add(newSchool);
        return new ModelAndView("redirect:/");
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}/edit")
    public String edit(Model model, @PathVariable(value = "id") Integer schoolId) {
        model.addAttribute("school", schoolService.get(schoolId));
        return "schoolEdit";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{schoolId}")
    public String edit(@PathVariable(value = "schoolId") Integer schoolId, @ModelAttribute(value = "school") SchoolRequestDto school) {
        schoolService.update(schoolId, school);
        return "redirect:/";
    }
}
