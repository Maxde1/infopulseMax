package ThirdHomework.CreateDTO;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class DtoToJson<T> {
    public String convertToJson(T dto)  {
        ObjectMapper objectMapper = new ObjectMapper();
        String carAsString = null;
        try {
            carAsString = objectMapper.writeValueAsString(dto);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return carAsString;

    }

}
