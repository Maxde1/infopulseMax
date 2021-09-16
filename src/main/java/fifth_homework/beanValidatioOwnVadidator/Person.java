package fifth_homework.beanValidatioOwnVadidator;

import lombok.Data;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.time.LocalDate;
import java.util.Set;

@Data
@Age
public class Person {
    private String name;
    private LocalDate birthday;
    private int age;
//Test case located in test/java/fifth_homework
}
