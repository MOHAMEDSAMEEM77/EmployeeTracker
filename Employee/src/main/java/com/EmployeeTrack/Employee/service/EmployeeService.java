package com.EmployeeTrack.Employee.service;

import com.EmployeeTrack.Employee.model.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee SaveEmployee(Employee Employee);

    public List<Employee> GetEmployeeList();

    public Employee GetEmployeebyId(int employeeId);

    public void DeleteemployeeId(int employeeId);

    public Employee UpdateemployeeId(int employeeId, Employee empl);

    Employee GetEmployeesName(String employeeName);
}
