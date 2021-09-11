package ThirdHomework.DTO;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        TestReflaction test = new TestReflaction("Lop", 213, '4');
        Field[] method = test.getClass().getDeclaredFields();
        for (Field field: method){
            System.out.println(field);

        }
        java.lang.String str = "egw";
        System.out.println(str);
    }
}
