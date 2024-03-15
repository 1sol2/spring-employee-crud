package com.ohgiraffers.crud.employee.model.service;

import com.ohgiraffers.crud.employee.model.dao.EmployeeMapper;
import com.ohgiraffers.crud.employee.model.dto.EmployeeDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeMapper employeeMapper;
    public EmployeeService(EmployeeMapper employeeMapper) { this.employeeMapper = employeeMapper; }
    public List<EmployeeDTO> findAllMenu() {
        return employeeMapper.findAllMenu();
    }

    public List<EmployeeDTO> findCategoryList() {
        return employeeMapper.findCategoryList();
    }
}
