package uz.lesson2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uz.lesson2.services.impl.CourseServiceImpl;

@Controller
public class AboutController {
    private final CourseServiceImpl courseService;

    public AboutController(CourseServiceImpl courseService) {
        this.courseService = courseService;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("lists", courseService.list());
        return "list";
    }
}
