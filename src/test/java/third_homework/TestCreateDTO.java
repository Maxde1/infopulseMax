package third_homework;

import ThirdHomework.CreateDTO.Car;
import ThirdHomework.CreateDTO.CreateDto;
import ThirdHomework.CreateDTO.DtoClass;
import ThirdHomework.CreateDTO.ConvertDtoToToJson;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCreateDTO {
    @Test
    public void validTestCreateDTO() throws NoSuchFieldException, IllegalAccessException {
        Car car = new Car("Volvo", "jeep", 1999);
        DtoClass dtoClass = new DtoClass();
        CreateDto<Car, DtoClass> carFieldsToDto = new CreateDto<>();
        carFieldsToDto.convertToDTO(car, dtoClass);
        Assert.assertEquals(car.toString(), dtoClass.toString());
    }
    @Test
    public void validTestDTOtoJson(){
        Car car = new Car("Volvo", "jeep", 1999);
        DtoClass dtoClass = new DtoClass();
        CreateDto<Car, DtoClass> carFieldsToDto = new CreateDto<>();
        try {
            carFieldsToDto.convertToDTO(car, dtoClass);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }
        ConvertDtoToToJson<DtoClass> dtoToJson = new ConvertDtoToToJson<>();
        String resultOfJson = dtoToJson.convertToJson(dtoClass);
        Assert.assertEquals("{\"name\":\"Volvo\",\"year\":1999,\"type\":\"jeep\"}", resultOfJson);

    }
}
