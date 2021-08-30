package first_homework.secondTask;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
//in progress

public class DoubleLinkListTest extends DataProviderSecondTask{
    @Test(dataProvider = "validDoubleLinkList")
    public void positiveDoubleLinkList(DoubleLinkList<Human> doubleLinkList, Human expected){
        doubleLinkList.iterator().next();
        doubleLinkList.iterator().next();
        doubleLinkList.iterator().next();

        Assert.assertEquals(doubleLinkList.iterator().prev(), expected);
    }


}