package com.atguigu.spring6.validator.three;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class MyService {
    public String testMethod(@NotNull @Valid User user){
        return user.toString();
    }
}
