package com.spf.cache;

import com.spf.dto.EmployeeDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by shipengfei.
 * Date: 18/5/4
 * Time: 上午10:36
 * Motto: Saying and doing are two different things.
 */
@Repository
public class EmployeeRedis {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeRedis.class);

    @Autowired
    private RedisTemplate redisTemplate;

    public EmployeeDto getSingleEmployee(String key){
        EmployeeDto employeeDto = null;
        EmployeeDto cache = (EmployeeDto)redisTemplate.opsForValue().get(key);
        if(!StringUtils.isEmpty(cache)){
            employeeDto = cache;
            logger.warn("data get from cache this time.");
        }
        return employeeDto;
    }

    public List<EmployeeDto> getAllEmployees(){
        List<EmployeeDto> employeeDtos = null;
        List<EmployeeDto> cache = (List<EmployeeDto>)redisTemplate.opsForList();
        if(!StringUtils.isEmpty(cache)){
            employeeDtos = cache;
        }
        return employeeDtos;
    }

    public void addSingleEmployee(String key, EmployeeDto employeeDto){
        redisTemplate.opsForValue().set(key, employeeDto,6, TimeUnit.HOURS);
        logger.warn("addSingleEmployee() 已加入缓存");
    }

    public void addEmployeeList(String key, List<EmployeeDto> list){
        redisTemplate.opsForList().getOperations().delete(key);
    }
}
