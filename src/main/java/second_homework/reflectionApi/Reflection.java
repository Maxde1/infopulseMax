package second_homework.reflectionApi;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;

public class Reflection {
    public static void main(String[] args) {
        //Get access and change the value of a private field
        TestClass<String> testClass = new TestClass<>("test");
        String string = null;
        try {
            Field field = testClass.getClass().getDeclaredField("string");
            field.setAccessible(true);
            string =(String) field.get(testClass);
            System.out.println(string);
            field.set(testClass, (String) "changed value");
            string = (String) field.get(testClass);
            System.out.println(string);
        }catch (NoSuchFieldException | IllegalAccessException e){
            e.printStackTrace();
        }
        System.out.println(testClass.getGenericParame().getGenericSuperclass().getTypeName());;


    }
}
