package third_homework;

import ThirdHomework.Stack.UsingArray.StackArray;
import ThirdHomework.Stack.UsingLinkedList.StackLinkedList;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestStack {
    @Test
    public void positiveTestStackOnLinkedList(){
        StackLinkedList<String> stack = new StackLinkedList<>();
        stack.addElement("One");
        stack.addElement("Two");
        stack.addElement("Three");
        stack.addElement("Four");
        List<String> listOfResult = new ArrayList<>();
        listOfResult.add(stack.getElement());
        listOfResult.add(stack.getElement());
        Assert.assertEquals(listOfResult.toString(), "[Four, Three]");
    }
    @Test
    public void negativeTestStackOnLinkedList(){
        StackLinkedList<String> stack = new StackLinkedList<>();
        stack.addElement("One");
        stack.addElement("Two");
        stack.addElement("Three");
        stack.addElement("Four");
        stack.getElement();
        stack.getElement();
        stack.getElement();
        stack.getElement();
        Assert.assertNull(stack.getElement());
    }
    @Test
    public void positiveTestStackOnArray(){
        StackArray<String> stackArray = new StackArray<>(String.class, 10);
        stackArray.setElem("One");
        stackArray.setElem("Two");
        stackArray.setElem("Three");
        ArrayList<String> result = new ArrayList<>();
        result.add(stackArray.get());
        result.add(stackArray.get());
        Assert.assertEquals(result.toString(), "[Three, Two]");
    }
    @Test
    public void negativeTestStackOnArray(){
        StackArray<String> stackArray = new StackArray<>(String.class, 10);
        stackArray.setElem("One");
        stackArray.setElem("Two");
        stackArray.setElem("Three");
        stackArray.get();
        stackArray.get();
        stackArray.get();
        Assert.assertNull(stackArray.get());
    }
}
