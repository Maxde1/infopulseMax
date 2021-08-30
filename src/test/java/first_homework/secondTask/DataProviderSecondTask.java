package first_homework.secondTask;

import org.testng.annotations.DataProvider;

public class DataProviderSecondTask {
    @DataProvider (name = "validDoubleLinkList")
    public static Object[][] validDataDoubleLinkList() {
        DoubleLinkList<Human> doubleLinkList = new DoubleLinkList<>();
        Human human = new Human(332, "Калинин Артём Валериевич", "+2234234423");
        doubleLinkList.addNodeToEnd(new Human(123, "Васильев Евстахий Борисович", "+129381832"));
                doubleLinkList.addNodeToEnd(new Human(151, "Коновалов Степан Петрович", "+234432334"));
                doubleLinkList.addNodeToEnd(human);
                doubleLinkList.addNodeToEnd(new Human(432, "Предыбайло Григорий Анатолиевич", "+2342344234"));
                doubleLinkList.addNodeToEnd(new Human(556, "Степанов Мирослав Андреевич", "+6678877777"));
        Object[][] param = new Object[][]{
                {doubleLinkList, human},
        };
        return param;
    }
}
