package com.spf.mapper;

import com.spf.dto.EmployeeDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by shipengfei.
 * Date: 18/5/4
 * Time: 上午9:36
 * Motto: Saying and doing are two different things.
 */
@Mapper
public interface EmployeeMapper {

    List<EmployeeDto> getAllEmployees();

    EmployeeDto getSingleEmployee(int id);

}
