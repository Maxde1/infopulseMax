package first_homework.firstTask;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FirstTaskTest extends DataProviderFirstTask{

    @Test(dataProvider = "validFactorialValue")
    public void validTestFactorialByLoop(int n, int expected) {
        Assert.assertEquals(FirstTask.factorialByLoop(n), expected);
    }

    @Test(dataProvider = "validFactorialValue")
    public void validTestFactorialByRecursion(int n, int expected) {
        Assert.assertEquals(FirstTask.factorialByRecursion(n), expected);
    }
    @Test(dataProvider = "invalidFactorialValue")
    public void invalidTestFactorialByLoop(int n, int expected){
        Assert.assertEquals(FirstTask.factorialByLoop(n), expected);
    }
    @Test(dataProvider = "invalidFactorialValue")
    public void invalidTestFactorialByRecursion(int n, int expected){
        Assert.assertEquals(FirstTask.factorialByRecursion(n), expected);
    }
}