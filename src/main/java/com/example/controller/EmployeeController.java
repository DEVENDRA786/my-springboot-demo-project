package com.example.controller;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("/students/")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("signup")
    public String showSignUpForm(Employee employee) {
        return "add-student";
    }
    @GetMapping("list")
    public String showUpdateForm(Model model) {
        model.addAttribute("students", employeeRepository.findAll());
        return "index";
    }

}