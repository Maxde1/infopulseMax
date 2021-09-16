package fourth_homework;

import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JsonParser {
    /*
    This
     */
    public int countAllArrayInJson(String json) {
        int countArray = 0;
        String regularExpressionForArray = "\\[";
        Pattern patternForArray = Pattern.compile(regularExpressionForArray);
        Matcher matcherForArray = patternForArray.matcher(json);
        while (matcherForArray.find()) {
            countArray++;
        }
        return countArray;

    }

    // This method count all object
    public int countAllObjectInJson(String json) {
        int countObject = 0;
        String regularExpression = "\\{";
        // Pattern and matcher for Objects
        Pattern patternFroObject = Pattern.compile(regularExpression);
        Matcher matcher = patternFroObject.matcher(json);
        // Patteren
        while (matcher.find()) {
            countObject++;
        }
        return countObject;
    }

    public String parseJsonObjectToString(String jsonFile, String searchWord) {
        jsonFile = jsonFile.substring(1, jsonFile.length() - 1);
        String regularExpression = String.format("\"%s\":\\s+\".+?\"", searchWord);
        Pattern pattern = Pattern.compile(regularExpression);
        Matcher matcher = pattern.matcher(jsonFile);
        if (matcher.find()) {
            return jsonFile.substring(matcher.start(), matcher.end()).split(":")[1].replaceAll("\"", "").trim();
        } else return "";
    }

    public Long parseJsonObjectToLong(String jsonFile, String searchWord) {
        jsonFile = jsonFile.substring(1, jsonFile.length() - 1);
        String regularExpression = String.format("\"%s\":\\s++[0-9]+", searchWord);
        Pattern pattern = Pattern.compile(regularExpression);
        Matcher matcher = pattern.matcher(jsonFile);
        if (matcher.find()) {
            return Long.parseLong(jsonFile.
                    substring(matcher.start(), matcher.end()).split(":")[1].
                    replaceAll("\"", "").
                    trim());
        } else {
            return null;
        }

    }

    public Double parseJasonObjectToDouble(String jsonFile, String searchWord) {
        jsonFile = jsonFile.substring(1, jsonFile.length() - 1);
        String regularExpression = String.format("\"%s\":\\s++[0-9]+\\.[0-9]+", searchWord);
        Pattern pattern = Pattern.compile(regularExpression);
        Matcher matcher = pattern.matcher(jsonFile);
        if (matcher.find()) {
            return Double.parseDouble(jsonFile.
                    substring(matcher.start(), matcher.end()).split(":")[1].
                    replaceAll("\"", "").
                    trim());
        } else {
            return null;
        }
    }

    //In progress
//    public List<String> parseObjectToArray(String jsonFile, String searchWord){
//        List<String> list = new ArrayList<>();
//        jsonFile = jsonFile.substring(1, jsonFile.length()-1);
//        String regularExpression = String.format("\"%s\":\\s++[0-9]+\\.[0-9]+", searchWord);
//
//    }
    public String readJsonFile(String path) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        File file = new File(path);
        BufferedReader read = null;
        try {
            read = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String st;
        while ((st = read.readLine()) != null) {
            stringBuilder.append(st);
        }
        return stringBuilder.toString();

    }


//    private Object read(String str) {
//        Object resp;
//        String type = getType(str);
//        if (type.equals("obj")) {
//            resp = new HashMap<>();
//        } else if (type.equals("arr")) {
//            resp = new ArrayList<>();
//        } else {
//            throw new RuntimeException("Undefined");
//        }
//        if (type.equals("obj")) {
//            for(str){
//                String field = str;
//                String key = str;
//                String value = str;
//                if (isSimpel(value)) {
//                    map.put(key, value);
//                } else {
//                    map.put(key, read(value));
//                }
//            }
//        } else if (type.equals("arr")) {
//            for(str){
//                String arrEle = str;
//                if (isSimpel(value)) {
//                    arr.add(arrEle);
//                } else {
//                    map.put(read(arrEle));
//                }
//            }
//        } else {
//            throw new RuntimeException("Undefined");
//        }
//        return resp;
//    }


}
