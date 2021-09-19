package fourth_homework;

import java.util.HashMap;

public class NewJsonParser {
    private String jsonString;
    private char[] charArray;
    private StringBuilder stringBuilder;
    private int tempIndexOfStart;
    private int tempIndexOfEnd;
    NewJsonParser(String json){
        jsonString = json.substring(1, json.length()-1);
        charArray = json.substring(1, json.length()-10).toCharArray();
    }
    public boolean startOfString(int index){
        return charArray[index] == '"';
    }

    public boolean startOfArray(int index) {return charArray[index] == '[';}

    public int getIndexOfEndOfKey(int index){
        while (charArray[index]!='"'){
            index++;
        }
        index++;
        return index;
    }

    public boolean startOfElement(int index){
        return charArray[index] == ':';
    }
    public void findTypeOfObject(){
        HashMap<String, Object> result = new HashMap<>();
        String key = null;
        Object value;
        String obj = null;
        int index =0;
        for (int i=0; i<charArray.length; i++){
            if(startOfString(index)){
                System.out.println("+");
                index++;
                tempIndexOfStart = getIndexOfEndOfKey(index);
                key = jsonString.substring(index, tempIndexOfStart);
            }
            if(startOfElement(index)){
                index++;
                tempIndexOfEnd = findValue(index);
                obj = jsonString.substring(index, tempIndexOfEnd);
            }

        }
        getElemet(key+obj);

    }
    public int findValue(int index){
        if (charArray[index]== '"'){
            index++;
            while (charArray[index]=='"'){
                index++;
            }
        }
        return index;
    }
public String getElemet(String jsonString){
    System.out.println(jsonString);
        return jsonString;
}

    public static void main(String[] args) {
        String json = "\"wegwegew\":\"some\"";
        NewJsonParser newJsonParser = new NewJsonParser(json);
        newJsonParser.findTypeOfObject();
    }
}
