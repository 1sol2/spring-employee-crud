package com.ohgiraffers.crud.employee.model.dto;

public class EmployeeDTO {
    private int empId;
    private String empName;
    private int phone;
    private int salary;
    private String hireDate;

    public EmployeeDTO() {
    }

    public EmployeeDTO(int empId, String empName, int phone, int salary, String hireDate) {
        this.empId = empId;
        this.empName = empName;
        this.phone = phone;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", phone=" + phone +
                ", salary=" + salary +
                ", hireDate='" + hireDate + '\'' +
                '}';
    }

}
