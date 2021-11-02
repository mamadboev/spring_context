package uz.lesson.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uz.lesson.services.impl.CourseServiceImpl;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RegisterController {
    private final CourseServiceImpl courseService;

    public RegisterController(CourseServiceImpl courseService) {
        this.courseService = courseService;
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String list() {
        return "list";
    }

    @RequestMapping(value = "/addCourse", method = RequestMethod.POST)
    public String addCourse(Model model, HttpServletRequest request) {
        model.addAttribute("message", "Malumot saqlandi!");
        courseService.add(request);
        return "list";
    }

    @RequestMapping(value = "/allList", method = RequestMethod.GET)
    public String allList(Model model) {
        model.addAttribute("lists", courseService.courses());
        return "allList";
    }
}
