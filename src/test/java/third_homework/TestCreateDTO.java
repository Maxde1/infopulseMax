package third_homework;

import ThirdHomework.CreateDTO.Car;
import ThirdHomework.CreateDTO.CarFieldsToDto;
import ThirdHomework.CreateDTO.DtoClass;
import ThirdHomework.CreateDTO.DtoToJson;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Field;
import java.util.List;

public class TestCreateDTO {
    @Test
    public void validTestCreateDTO() throws NoSuchFieldException, IllegalAccessException {
        Car car = new Car("Volvo", "jeep", 1999);
        DtoClass dtoClass = new DtoClass();
        CarFieldsToDto<Car, DtoClass> carFieldsToDto = new CarFieldsToDto<>();
        carFieldsToDto.convertToDTO(car, dtoClass);
        Assert.assertEquals(car.toString(), dtoClass.toString());
    }
    @Test
    public void validTestDTOtoJson(){
        Car car = new Car("Volvo", "jeep", 1999);
        DtoClass dtoClass = new DtoClass();
        CarFieldsToDto<Car, DtoClass> carFieldsToDto = new CarFieldsToDto<>();
        try {
            carFieldsToDto.convertToDTO(car, dtoClass);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }
        DtoToJson<DtoClass> dtoToJson = new DtoToJson<>();
        String resultOfJson = dtoToJson.convertToJson(dtoClass);
        Assert.assertEquals("{\"name\":\"Volvo\",\"year\":1999,\"type\":\"jeep\"}", resultOfJson);

    }
}
