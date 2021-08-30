package first_homework.thirdTask;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static org.testng.Assert.*;

public class StreamMethodsTest {

    @Test
    public void testFirstNElement() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(30);
        list.add(50);
        list.add(60);
        list.add(70);
        Stream<Integer> stream = list.stream(); // Test stream
        StreamMethods<Integer> streamMethods = new StreamMethods<>(); // instance of  StreamMethods
        Predicate<Integer> predicate = x -> x >= 30; // Test Predicate
        Stream<Integer> expected = Stream.of(30, 50, 60, 70);// Expected result
        Assert.assertEquals(streamMethods.firstNElement(stream, 4, predicate).toArray(Integer[]::new), expected.toArray(Integer[]::new));

    }
}