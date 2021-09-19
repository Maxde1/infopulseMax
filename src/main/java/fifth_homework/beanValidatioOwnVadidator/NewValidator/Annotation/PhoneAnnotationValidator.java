package fifth_homework.beanValidatioOwnVadidator.NewValidator.Annotation;

import fifth_homework.beanValidatioOwnVadidator.NewValidator.Annotation.PhoneAnnotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

public class PhoneAnnotationValidator implements ConstraintValidator<PhoneAnnotation, String> {
    String pattern = "380\\d{7}$";
    @Override
    public void initialize(PhoneAnnotation constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String phone, ConstraintValidatorContext constraintValidatorContext) {
        Pattern pat = Pattern.compile(pattern);
        return pat.matcher(phone).matches();
    }
}
