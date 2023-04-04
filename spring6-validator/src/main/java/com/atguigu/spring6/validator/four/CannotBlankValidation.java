package com.atguigu.spring6.validator.four;

import jakarta.validation.Constraint;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CannotBlankValidation implements ConstraintValidator<CannotBlank,String> {
    @Override
    public boolean isValid(String value,ConstraintValidatorContext context){
        if(value!=null && value.contains("")){
            //获取默认提示信息
            String defaultConstrainMessageTemplate=context.getDefaultConstraintMessageTemplate();
            System.out.println("default message :"+defaultConstrainMessageTemplate);
            //禁用默认提示信息
            context.disableDefaultConstraintViolation();
            //设置提示语
            context.buildConstraintViolationWithTemplate("can not contains blank").addConstraintViolation();
            return false;
        }
        return false;
    }
}
