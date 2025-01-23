package com.betus.dbdemo.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.util.StringUtils;

public class TCIdentityNumberValidator implements ConstraintValidator<TCIdentityNumber, String> {

    @Override
    public void initialize(TCIdentityNumber constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String identityNumber, ConstraintValidatorContext constraintValidatorContext) {
        if (StringUtils.isEmpty(identityNumber) || identityNumber.length() != 11) {
            System.out.println(identityNumber + " is not a valid identity number length");
            return false;
        }

        char[] chars = identityNumber.toCharArray();
        int[] a = new int[11];

        for (int i = 0; i < 11; i++) {
            a[i] = chars[i] - '0';
        }
        System.out.println(a[10]);


        int oddSum = (a[0] + a[2] + a[4] + a[6] + a[8]);
        int evenSum = (a[1] + a[3] + a[5] + a[7]);
        if (a[10] % 2 != 0) {
            return false;
        } else if (a[0] == 0) {
            return false;
        } else if (((oddSum * 7) + (evenSum * 9)) % 10 != a[9]) {
            return false;
        } else if ((oddSum * 8) % 10 != a[10]) {
            return false;
        }

        return true;
    }
}
