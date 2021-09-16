package second_homework.reflectionApi;

import java.lang.reflect.ParameterizedType;

public class TestClass<T> {
    private T generic;
    private String string = "test";

    public TestClass(T t){
        this.generic = t;
    }

    public T getGeneric(){
        return generic;
    }
    public Class<T> getGenericParame(){
        Class<T> persistentClass = (Class<T>)
                ((ParameterizedType)getClass().getGenericSuperclass())
                        .getActualTypeArguments()[0];
        return persistentClass;
    }
}
