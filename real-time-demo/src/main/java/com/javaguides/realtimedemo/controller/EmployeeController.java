package com.javaguides.realtimedemo.controller;

import com.javaguides.realtimedemo.model.Employee;
import com.javaguides.realtimedemo.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@Controller
public class EmployeeController {

    private EmployeeService employeeService;

    @GetMapping("/")
    public String viewHomePage(Model model){
        return findPaginated(1, model);
    }

    @GetMapping("/showNewEmployeeForm")
    public String showNewEmployeeForm(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "new_employee";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        employeeService.saveEmployee(employee);
        return "redirect:/";
    }

//    @PostMapping("/saveEmployee")
//    public String saveEmployee(@RequestBody Employee employee){
//        employeeService.saveEmployee(employee);
//        return "redirect:/";
//    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model){

        Employee employee = employeeService.getEmployeeById(id);

        model.addAttribute("employee", employee);
        return "update_employee";
    }

    @GetMapping("/deleteEmployee")
    public String deleteEmployee(@PathVariable (value = "id") long id){
        employeeService.deleteEmployeeById(id);
        return "redirect:/";
    }

    @GetMapping("/page/{pageNo}")
    public String findPaginated(@PathVariable(value = "pageNo") int pageNo, Model model){

        int pageSize = 5;
        Page<Employee> page = employeeService.findPaginated(pageNo, pageSize);
        List<Employee> listEmployees = page.getContent();

        model.addAttribute("currentPage", pageNo);
        model.addAttribute("totalPages", page.getTotalPages());
        model.addAttribute("totalItems", page.getTotalElements());
        model.addAttribute("listEmployees", listEmployees);

        return "index";

    }




}
