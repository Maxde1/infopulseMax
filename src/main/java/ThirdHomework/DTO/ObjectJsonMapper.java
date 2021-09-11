package ThirdHomework.DTO;
import ThirdHomework.CreateDTO.Car;
import ThirdHomework.CreateDTO.CarFieldsToDto;

import java.lang.reflect.Field;

public class ObjectJsonMapper<T> {


    public String parse(T object) throws IllegalAccessException {
        String str ="";
        Field[] fields = object.getClass().getDeclaredFields();
        for(Field field: fields){
            if(field.isAnnotationPresent(FirstAno.class)){
                field.setAccessible(true);
                if (field.getType().getSimpleName().equals("String") || field.getType().getSimpleName().equals("char")){
                    str += String.format("\"%s\":\"%s\", ", field.getName(), field.get(object));
                }
                else if(field.getType().isPrimitive()){
                    str += String.format("\"%s\":%s, ", field.getName(), field.get(object));
                }
            }



        }
        return "{"+str+"}";

    }

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
//        TestReflaction testReflaction = new TestReflaction("gwe", 21, '3');
//        ObjectJsonMapper<TestReflaction> mapper = new ObjectJsonMapper<>();
//        System.out.println(mapper.parse(testReflaction));
        Car car = new Car("UAZ", "Automate");
        DtoClass dtoClass = new DtoClass();
        CarFieldsToDto<Car, DtoClass> dto = new CarFieldsToDto<>();
        dto.convertToDTO(car, dtoClass);
        Field[] fields = dtoClass.getClass().getDeclaredFields();
        for(Field f: fields){
            f.setAccessible(true);
            System.out.println(f.get(dtoClass));
        }




    }

}
