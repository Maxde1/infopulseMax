package second_homework.singletone;

public class SingleTone {
    private static SingleTone singleTone;
    private static StringBuilder info = new StringBuilder("");

    private SingleTone(){
    }

    public static SingleTone getSingleTone(){
        if (singleTone == null)
            singleTone = new SingleTone();
        return singleTone;
    }
    public void addInfo(String input){
        info.append(" "+input);
    }
    public void showInfo(){
        System.out.println(info.toString());
    }


}
