package kirwa.stack.demo.Services;

import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class StackService implements StackServiceInterface {

    public static final int CAPACITY = 20;

    protected int[] stackArray;
    private static int top = -1; /* TODO: the last element has an index of -1 in an array*/

    public StackService() {
        this(CAPACITY); /*Note that this in java arrays is like calling the constructor method.
        this refers to the class or the constructor method.*/
    }
    public StackService(int capacity) {

        stackArray = new int[capacity];
    }


    public int size() {
        return (top + 1);/*initially , the array is empty . ie the length is 0*/
    }
    public boolean isEmpty() {
        return (size()==0);
    }

    public int[] push(int data) throws Exception {
        if (size() == CAPACITY)
            throw new Exception("Stack is full.");
        stackArray[++top] = data;
        return stackArray;
    }

    public int peek() throws Exception {
        if (isEmpty())
            throw new Exception("Stack is empty.");
        return stackArray[top];
    }
    public int getLength() throws Exception {
        if (isEmpty())
            throw new Exception("Stack is empty.");
        return size();
    }
    public int[] getStackDetails() throws Exception {

        return stackArray;
    }
    public boolean getIsEmpty() throws Exception {
        if (isEmpty()){
            return true;
        }

        return false;
    }

    public int[] pop() throws Exception {
        int data;
        if (isEmpty())
            throw new Exception("Stack is empty.");
        stackArray[top]= 0;
        top--;
        return stackArray;
    }

    public static int[] removeTheElement(int[] arr)
    {

        return IntStream.range(0, arr.length)
                .filter(i -> i != top)
                .map(i -> arr[i])
                .toArray();
    }
}
