package com.spf.controller;

import com.spf.dto.EmployeeDto;
import com.spf.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shipengfei.
 * Date: 18/12/22
 * Time: 下午1:12
 * Motto: Saying and doing are two different things.
 */
@RestController
public class EmployeeController {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService service;

    @RequestMapping(value = "/showSingleEmployee", method = RequestMethod.GET)
    public EmployeeDto showSingleEmployee(
            @RequestParam(value = "userId", defaultValue = "0")String userId){
        EmployeeDto dto = service.getSingleEmployee(userId);
        return dto;
    }

}
