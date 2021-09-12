package fourth_homework;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestJsonParser {
    @Test
    public void positiveParseLong(){
        JsonParser jsonParser = new JsonParser();
        String jsonFile = null;
        try {
            jsonFile = jsonParser.readJsonFile("JsonF.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Long age = jsonParser.parseJsonObjectToLong(jsonFile, "age");
        Assert.assertEquals(age.doubleValue(), 20);
    }
    @Test
    public void positiveParseDouble(){
        JsonParser jsonParser = new JsonParser();
        String jsonFile = null;
        try {
            jsonFile = jsonParser.readJsonFile("JsonF.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Double age = jsonParser.parseJasonObjectToDouble(jsonFile, "Double");
        if (age != null){
            Assert.assertEquals(age.doubleValue(), 24.0);
        }
        else Assert.fail();

    }
}
