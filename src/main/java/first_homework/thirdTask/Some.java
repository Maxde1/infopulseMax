package first_homework.thirdTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Some<T> {
    public Stream<T> firstNElement(Stream<T> a, int n, Predicate<T> predicate){
        return a.filter(predicate).limit(n);
    }

    public static void main(String[] args) {
        //test if that work
        Predicate<Integer> predicate = x -> x < 10;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(9);
        arr.add(2);
        arr.add(100);
        arr.add(13);
        arr.add(5);
        Stream<Integer> stream = arr.stream();
        Some a = new Some();
        for (Object integer: a.firstNElement(stream, 2, predicate).toArray()){
            System.out.println(integer);
        }

    }
}
