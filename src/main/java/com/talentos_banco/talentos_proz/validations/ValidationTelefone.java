package com.talentos_banco.talentos_proz.validations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidationTelefone implements ConstraintValidator<TelefoneValidation, Integer> {
    @Override
    public boolean isValid(Integer telefone, ConstraintValidatorContext constraintValidatorContext) {
        if(telefone == null) return false;

        int length = String.valueOf(telefone).length();

        return length == 10 || length == 11;
    }
}
