package com.EmployeeTrack.Employee.controller;

import com.EmployeeTrack.Employee.model.Employee;
import com.EmployeeTrack.Employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/Employee")
    public Employee SaveEmployee(@RequestBody Employee employee) {
        return employeeService.SaveEmployee(employee);
    }

    @GetMapping("/Employee")
    public List<Employee> GetEmployeeList() {
        return employeeService.GetEmployeeList();

    }

    @GetMapping("/Employee/{id}")
    public Employee GetEmployeebyId(@PathVariable("id") int employeeId) {
        return employeeService.GetEmployeebyId(employeeId);
    }

    @GetMapping("/Employee/name/{id}")
    public Employee getEmployeebyName(@PathVariable("id") String employeeName) {
        return employeeService.GetEmployeesName(employeeName);
    }

    @DeleteMapping("/Employee/{id}")
    public void DeleteemployeeId(@PathVariable("id") int employeeId) {
        employeeService.DeleteemployeeId(employeeId);
    }

    @PutMapping("/Employee/{id}")
    public Employee UpdateemployeeId(@PathVariable("id") int employeeId, @RequestBody Employee empl) {
        return employeeService.UpdateemployeeId(employeeId, empl);

    }
}

