package com.talentos_banco.talentos_proz.validations;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ValidationTelefone.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface TelefoneValidation {

    String message() default "Telefone invalido";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
