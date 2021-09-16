package fifth_homework;

import fifth_homework.beanValidationUsingJSR380.UserAccount;
import org.testng.annotations.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class TestMyAgeAnnotation {
    @Test
    public void positiveTestValidationUserAccount(){
        UserAccount userAccount = new UserAccount();
        userAccount.setName("M");
        userAccount.setPhoneNumber("34324");
        userAccount.setSex("female");
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<UserAccount>> constraintViolations = validator.validate(userAccount);


        validatorFactory.close();
    }
}
