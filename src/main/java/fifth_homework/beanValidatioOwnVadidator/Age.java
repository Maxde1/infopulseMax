package fifth_homework.beanValidatioOwnVadidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@Target(TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AgeValidator.class)
public @interface Age {
    String message() default "Age and birthday doesn't match";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
