package fifth_homework.beanValidatioOwnVadidator.NewValidator;

import fifth_homework.beanValidatioOwnVadidator.NewValidator.Annotation.PhoneAnnotation;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Person {
    private String name;
    @PhoneAnnotation
    private String phone;
    private LocalDate birthday;
    private int age;
//Test case located in test/java/fifth_homework
}
