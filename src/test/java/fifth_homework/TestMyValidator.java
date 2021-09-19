package fifth_homework;

import fifth_homework.beanValidatioOwnVadidator.NewValidator.Person;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.time.LocalDate;
import java.util.Set;

public class TestMyValidator {
    @Test
    public void positiveMyAgeAnnotation(){
        Person person = new Person();
        person.setAge(404);
        LocalDate date = LocalDate.of(2000, 12, 12);
        person.setBirthday(date);
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<Person>> constraintViolations = validator.validate(person);

        Assert.assertFalse(constraintViolations.isEmpty());
    }
}
