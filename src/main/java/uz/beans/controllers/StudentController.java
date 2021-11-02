package uz.beans.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping
    public String list(Model model) {
        model.addAttribute("students", "Assalomu alaykum!");
        return "student";
    }
}
