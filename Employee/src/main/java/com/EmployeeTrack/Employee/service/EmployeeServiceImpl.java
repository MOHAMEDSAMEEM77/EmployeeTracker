package com.EmployeeTrack.Employee.service;

import com.EmployeeTrack.Employee.model.Employee;
import com.EmployeeTrack.Employee.repo.EmployerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployerRepository employeerepository;

    @Override
    public Employee SaveEmployee(Employee emp) {
        return employeerepository.save(emp);
    }

    @Override
    public List<Employee> GetEmployeeList() {
        return employeerepository.findAll();
    }

    @Override
    public Employee GetEmployeebyId(int employeeId) {
        return employeerepository.findById(employeeId).get();
    }

    @Override
    public void DeleteemployeeId(int employeeId) {
        employeerepository.deleteById(employeeId);
        return;
    }

    @Override
    public Employee UpdateemployeeId(int employeeId, Employee empl) {
        Employee empdb = employeerepository.findById(employeeId).get();
        if (Objects.nonNull(empl.getemployeeId()) && empl.getemployeeId() > 0) {
            empdb.setemployeeId(empl.getemployeeId());
        }
        if (Objects.nonNull(empl.getemployeeName()) && !"".equalsIgnoreCase(empl.getemployeeName())) {
            empdb.setemployeeName(empl.getemployeeName());
        }
        if (Objects.nonNull(empl.getemployeeAddress()) && !"".equalsIgnoreCase(empl.getemployeeAddress())) {
            empdb.setemployeeAddress(empl.getemployeeAddress());
        }
        if (Objects.nonNull(empl.getemployeeAge()) && empl.getemployeeAge() > 0) {
            empdb.setemployeeAge(empl.getemployeeAge());
        }
        return employeerepository.save(empdb);
    }

    @Override
    public Employee GetEmployeesName(String employeeName) {
        return employeerepository.findByEmployeeName(employeeName);
    }


}
