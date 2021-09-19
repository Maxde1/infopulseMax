package fifth_homework.beanValidatioOwnVadidator.NewValidator.Annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@Retention(RetentionPolicy.RUNTIME)
@Target( FIELD)
@Constraint(validatedBy = PhoneAnnotationValidator.class)
public @interface PhoneAnnotation {
    String message() default "{phone.invalid}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
