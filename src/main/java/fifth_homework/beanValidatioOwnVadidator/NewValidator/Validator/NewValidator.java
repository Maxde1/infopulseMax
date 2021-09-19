package fifth_homework.beanValidatioOwnVadidator.NewValidator.Validator;

import fifth_homework.beanValidatioOwnVadidator.NewValidator.Person;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NewValidator {
    public boolean validateObject(Object obj){
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            Annotation[] anno= field.getAnnotations();
            for (Annotation annotation : anno) {
                for (Annotation ann: annotation.annotationType().getAnnotations()){
                    if(ann instanceof Constraint){
                        Constraint constraint = (Constraint) ann;
                        try {
                            Class<? extends ConstraintValidator<?, ?>> validator =  constraint.validatedBy()[0];
                            Method method = validator.getDeclaredMethod("isValid", Object.class, ConstraintValidatorContext.class);
                            ConstraintValidator<?, ?> constraintValidator = validator.getDeclaredConstructor().newInstance();
                            field.setAccessible(true);
                            boolean result = (boolean)method.invoke(constraintValidator,field.get(obj), null);
                            if (result){
                                return true;
                            }
                        } catch (NoSuchMethodException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e) {
                            e.printStackTrace();
                        } catch (InstantiationException e) {
                            e.printStackTrace();
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Person person = new Person();
        // Valid format of number
        person.setPhone("3809999997");
        NewValidator newValidator= new NewValidator();
        // Should be return - true
        System.out.println(newValidator.validateObject(person));
        person.setPhone("433");
        //Should be return - false
        System.out.println(newValidator.validateObject(person));
    }
}
