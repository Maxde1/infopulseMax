package ThirdHomework.Queue.UsingArray;

public class TestQueue {
    public static void main(String[] args) {
        Queue<String> arr = new Queue<>(String.class, 10);
        arr.addElem("One");
        arr.addElem("Two");
        System.out.println(arr.get());
        System.out.println(arr.get());
        System.out.println(arr.get());
        System.out.println(arr.get());
        System.out.println(arr.get());
        System.out.println(arr.get());
        arr.addElem("Two");
        System.out.println(arr.get());

    }

}
