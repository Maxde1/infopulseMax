package ThirdHomework.CreateDTO;

public class DtoClass {

    private String name;
    private int year;
    private String type;

    public String getName() {
        return name;
    }

    public int getYear() {
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
