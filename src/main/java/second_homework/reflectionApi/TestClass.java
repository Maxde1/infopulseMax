package second_homework.reflectionApi;

public class TestClass<T> {
    private T generic;
    private String string = "test";

    public TestClass(T t){
        this.generic = t;
    }

    public T getGeneric(){
        return generic;
    }

}
