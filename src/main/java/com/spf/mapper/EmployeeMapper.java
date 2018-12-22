package com.spf.mapper;

import com.spf.dto.EmployeeDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by shipengfei.
 * Date: 18/5/4
 * Time: 上午9:36
 * Motto: Saying and doing are two different things.
 */
@Repository
@Mapper
public interface EmployeeMapper {

    List<EmployeeDto> getAllEmployees();

    EmployeeDto getSingleEmployee(String id);

}
