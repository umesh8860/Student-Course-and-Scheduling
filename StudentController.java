package com.klef.jfsd.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    @GetMapping("/Student")
    public String showStudentPage() {
        return "student"; // This should map to `student.jsp` or an equivalent view
    }
}
