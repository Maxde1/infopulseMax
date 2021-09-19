package fourth_homework;

public class NewIdeaParser {

public void findObject(String json){
    char[] charJson = json.toCharArray();
    int index = 0;
    int temp = 0;
    String key = "";
    for (int i= 0; i< charJson.length; i++){
        if(charJson[i]=='"'){
            temp = index++;
            while(charJson[temp] != '"'){
                temp++;
            }
            temp++;
            key = json.substring(index, temp);
            index = temp;

        }
        if (charJson[index]==':'){
            temp = index++;
            index = determaineObject(temp, charJson);
        }
    }
}
public int determaineObject(int index, char[] json){
    if(json[index]=='"'){
        int temp = index++;
        while (json[index]!='"'){
            index
        }
    }
}
}
