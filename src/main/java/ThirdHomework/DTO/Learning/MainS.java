package ThirdHomework.DTO.Learning;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class MainS {
    public static void main(String args[]) throws IllegalAccessException,
            IllegalArgumentException, InvocationTargetException,
            IntrospectionException {
        TetsClass1 inst1 = new TetsClass1();
        inst1.setName("inst");
        inst1.setCode(1);

        TestClass2 inst2 = new TestClass2();

        Class<?> objClass = inst2.getClass();
        for (Field field : objClass.getDeclaredFields()) {
            // Invoke the getter method on the Institution1 object.
            Object objField = new PropertyDescriptor(field.getName(),
                    TetsClass1.class).getReadMethod().invoke(inst1);

            // Invoke the setter method on the Institution2 object.
            new PropertyDescriptor(field.getName(), TestClass2.class)
                    .getWriteMethod().invoke(inst2, objField);
        }

        System.out.println("Name Value fetched using reflections"
                + inst2.getName());
        System.out.println("Code Value fetched using reflections"
                + inst2.getCode());

    }
}
