package com.EmployeeTrack.Employee.repo;

import com.EmployeeTrack.Employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployerRepository extends JpaRepository<Employee, Integer> {
     public Employee findByEmployeeName(String employeeName);

}
