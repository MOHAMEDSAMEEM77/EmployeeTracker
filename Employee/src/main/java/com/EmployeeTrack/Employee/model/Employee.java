package com.EmployeeTrack.Employee.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    private int employeeId;
    private String employeeName;
    private String employeeAddress;
    private int employeeAge;

    public Employee(int employeeId, String employeeName, String employeeAddress, int employeeAge) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeeAge = employeeAge;
    }

    public Employee() {
    }

    public int getemployeeId() {
        return employeeId;
    }

    public void setemployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getemployeeName() {
        return employeeName;
    }

    public void setemployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getemployeeAddress() {
        return employeeAddress;
    }

    public void setemployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public int getemployeeAge() {
        return employeeAge;
    }

    public void setemployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeAddress='" + employeeAddress + '\'' +
                ", employeeAge=" + employeeAge +
                '}';
    }
}
