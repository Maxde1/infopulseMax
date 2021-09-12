package ThirdHomework.CreateDTO;

import ThirdHomework.anotations.SelectField;

import java.lang.reflect.Field;

public class CreateDto<T,E> {
    public void convertToDTO(T carObject, E dtoObject) throws IllegalAccessException, NoSuchFieldException {
        Field[] fields = carObject.getClass().getDeclaredFields();
        Field dtoField;
        for (Field field: fields){
            field.setAccessible(true);
            //Verify that field has annotation
            if(field.isAnnotationPresent(SelectField.class)){
                dtoField = dtoObject.getClass().getDeclaredField(field.getName());
                dtoField.setAccessible(true);
                dtoField.set(dtoObject, field.get(carObject));
            }
        }
    }
}
