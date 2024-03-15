package com.ohgiraffers.crud.menu.controller;

import com.ohgiraffers.crud.employee.controller.EmployeeController;
import com.ohgiraffers.project.SpringProjectApplication;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

@SpringBootTest
@ContextConfiguration(classes = { SpringProjectApplication.class })
public class EmployeeControllerTests {

    @Autowired
    private EmployeeController employeeController;
    private MockMvc mockMvc;

    @BeforeEach
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(employeeController).build();
    }

    @Test
    public void 전체_직원_조회용_컨트롤러_테스트() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.get("/employee/list"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.forwardedUrl("employee/list"))
                .andDo(MockMvcResultHandlers.print());

    }

    @Test
    @Transactional
    public void 신규_직원_등록용_컨트롤러_테스트() throws Exception {

        //given
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("employeeName", "동동길동");
        params.add("employeePhone", "01012345678");
        params.add("employeeSalary", "1000");
        params.add("employeeHireDate", "1990-02-06");

        // when & then
        mockMvc.perform(MockMvcRequestBuilders.post("/employee/regist").params(params))
                .andExpect(MockMvcResultMatchers.status().is3xxRedirection())
                .andExpect(MockMvcResultMatchers.redirectedUrl("/employee/list"))
                .andDo(MockMvcResultHandlers.print());
    }
}
