package first_homework.firstTask;

import org.testng.annotations.DataProvider;

import java.util.Arrays;
import java.util.function.Predicate;

public class DataProviderFirstTask {
    @DataProvider(name = "validFactorialValue")
    public static Object[][] validFactorial() {
        Object[][] param = new Object[][]{
                {9, 362880},
                {5, 120},
                {4, 24}

        };
        return param;
    }
    @DataProvider(name = "invalidFactorialValue")
    public static Object[][] invalidFactorial(){
        Object[][] param = new Object[][]{
                {-199, -1},
                {-1, -1},
                {-1244232, -1},
        };
        return param;
    }

}
