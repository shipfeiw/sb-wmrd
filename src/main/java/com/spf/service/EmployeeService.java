package com.spf.service;

import com.spf.cache.EmployeeRedis;
import com.spf.dto.EmployeeDto;
import com.spf.mapper.EmployeeMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Timer;

/**
 * Created by shipengfei.
 * Date: 18/5/4
 * Time: 上午10:19
 * Motto: Saying and doing are two different things.
 */
@Service
public class EmployeeService {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);

    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private EmployeeRedis employeeRedis;

    public EmployeeDto getSingleEmployee(String id){
        EmployeeDto employeeDto = employeeRedis.getSingleEmployee(id);
        if(null==employeeDto){
            employeeDto = employeeMapper.getSingleEmployee(id);
            employeeRedis.addSingleEmployee(id, employeeDto);
            logger.warn("data get from db this time.");
        }
        return employeeDto;
    }

}
