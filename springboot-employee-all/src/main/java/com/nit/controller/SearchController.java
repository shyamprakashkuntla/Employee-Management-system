package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nit.entity.Employee;
import com.nit.service.EmployeeService;

@Controller
public class SearchController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/searchByName")
	public String searchByName(@RequestParam("emp_name") String name, Model model) {
		model.addAttribute("employees", employeeService.searchEmployeeByName(name));
		return "home";
	}
	
	@PostMapping("/searchBySalary")
	public String searchBySalary(@RequestParam("emp_salary") Double salary, Model model) {
		if (salary.intValue() == 0) return "redirect:/home";
		List<Employee> salariedEmployees = employeeService.searchEmployeeBySalary(salary);
		model.addAttribute("employees", salariedEmployees);
		return "home";
	}
	
	@PostMapping("/searchByAddress")
	public String searchByAddress(@RequestParam("emp_address") String address, Model model) {
		model.addAttribute("employees", employeeService.searchEmployeeByAddress(address));
		return "home";
	}
}
