package com.ohgiraffers.crud.menu.model.service;

import com.ohgiraffers.crud.employee.model.dto.EmployeeDTO;
import com.ohgiraffers.crud.employee.model.service.EmployeeService;
import com.ohgiraffers.project.SpringProjectApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
@ContextConfiguration(classes = { SpringProjectApplication.class })
public class EmployeeServiceTests {

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void 매퍼_인터페이스_의존성_주입_테스트() {
        assertNotNull(employeeService);
    }

    @Test
    public void 전체_직원_조회_매퍼_테스트() {
        // given
        // when
        List<EmployeeDTO> employeeList = employeeService.findAllMenu();
        // then
        assertNotNull(employeeList);
    }
}