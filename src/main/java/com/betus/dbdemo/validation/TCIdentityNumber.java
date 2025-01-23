package com.betus.dbdemo.validation;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Constraint(validatedBy = {TCIdentityNumberValidator.class} )
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)

public @interface TCIdentityNumber {
    String message() default "Invalid TC Identity Number";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};


}
