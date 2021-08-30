package first_homework.thirdTask;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamMethods<T> {
        public Stream<T> firstNElement(Stream<T> a, int n, Predicate<T> predicate){
            return a.filter(predicate).limit(n);
        }
}
