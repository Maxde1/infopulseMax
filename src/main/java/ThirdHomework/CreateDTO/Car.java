package ThirdHomework.CreateDTO;

import ThirdHomework.anotations.SelectField;

public class Car {
    @SelectField(select = true)
    private String name;
    @SelectField(select = true)
    private Integer year;
    @SelectField(select = true)
    private String type;
    public Car(String name, String type, int year){
        this.name = name;
        this.type = type;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public Integer getYear() {
        return year;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", type='" + type + '\'' +
                '}';
    }
}
