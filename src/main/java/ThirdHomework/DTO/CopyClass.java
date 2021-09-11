package ThirdHomework.DTO;

import java.lang.reflect.Field;

public class CopyClass<T, E> {
    public void copyFromClassToDto(T originalObject, E dtoObject) throws IllegalAccessException {

        Field[] field = originalObject.getClass().getDeclaredFields();
        for (Field f: field){
            f.setAccessible(true);

            System.out.println(f.get(originalObject));
        }
    }
}
