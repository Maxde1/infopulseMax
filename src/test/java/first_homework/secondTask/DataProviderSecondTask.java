package first_homework.secondTask;

import org.testng.annotations.DataProvider;

public class DataProviderSecondTask {
    @DataProvider (name = "validData")
    public static Object[][] validDataDoubleLinkList() {
        Object[][] param = new Object[][]{
                {new Human(123, "Васильев Евстахий Борисович", "+129381832"),
                 new Human(151, "Коновалов Степан Петрович", "+234432334"),
                 new Human(332, "Калинин Артём Валериевич", "+2234234423"),
                 new Human(432, "Предыбайло Григорий Анатолиевич", "+2342344234"),
                 new Human(556, "Степанов Мирослав Андреевич", "+6678877777")
                },

        };
        return param;
    }
}
