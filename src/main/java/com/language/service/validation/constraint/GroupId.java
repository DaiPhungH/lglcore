package com.language.service.validation.constraint;

import com.language.service.validation.validator.GroupIdValidator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD, PARAMETER})
@Retention(RUNTIME)
@Constraint(validatedBy = GroupIdValidator.class)
@Documented
public @interface GroupId {
    String message() default "{groupIdDoesNotExist}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
