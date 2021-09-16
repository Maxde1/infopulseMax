package fifth_homework.chat.ClientToClientConnection;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtraFeature {
    public static String getTime(){
        Date currentDate = new Date(); // current data
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss"); // make format of time;
        String currentTimeFomat = dateFormat.format(currentDate); // get time
        return currentTimeFomat;
    }
}
