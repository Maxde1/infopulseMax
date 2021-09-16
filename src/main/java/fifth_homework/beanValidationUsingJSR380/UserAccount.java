package fifth_homework.beanValidationUsingJSR380;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;
import javax.xml.crypto.Data;
@lombok.Data
public class UserAccount {
    @NotNull(message = "This field can't be null")
    @Size(min = 2, max = 26, message = "Name can't be less that 2 symbol or bigger than 26 symbol")
    private String name;
    //Phone number format that valid for Ukraine
    @Pattern(regexp = "380\\d{7}\\b", message = "Number format should be 380*******, where * is digit")
    private String phoneNumber;
    @Pattern(regexp = "male|female", message = "Invalid value, value can be \"male\" or \"female\"")
    private String sex;
    @Past(message = "Invalid value, birthday can't be future date")
    private Data birthday;
    @Email
    private String email;
}
