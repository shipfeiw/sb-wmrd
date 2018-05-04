package com.spf.controller;

import com.spf.dto.HiDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by shipengfei.
 * Date: 18/5/3
 * Time: 下午12:29
 * Motto: Saying and doing are two different things.
 */
@RestController
public class HiController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/sayHi")
    public HiDto sayHi(
            @RequestParam(value = "name", defaultValue = "spf", required = false) String name){
        HiDto hiDto = new HiDto();
        hiDto.setName(name);
        hiDto.setDate(new Date());
        hiDto.setId(counter.incrementAndGet());
        return hiDto;
    }

}
