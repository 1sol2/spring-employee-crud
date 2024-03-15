package com.ohgiraffers.crud.employee.controller;

import com.ohgiraffers.crud.employee.model.dto.EmployeeDTO;
import com.ohgiraffers.crud.employee.model.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    // private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/list")
    public String findMenuList(Model model) {

        List<EmployeeDTO> employeeList = employeeService.findAllMenu();
        System.out.println("employeeList = " + employeeList);
        model.addAttribute("employeeList", employeeList);

        return "employee/list";
    }

    @GetMapping("/regist")
    public void registPage(){}

    @PostMapping("/regist")
    public @ResponseBody List<EmployeeDTO> findCategoryList() {

        return employeeService.findCategoryList();
    }

}
