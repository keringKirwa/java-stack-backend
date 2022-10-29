package kirwa.stack.demo.Services;

public interface StackServiceInterface {
    public int[] push(int data) throws Exception;
    public int peek() throws Exception;
    public int[] pop() throws Exception;
    public int size();
    public boolean isEmpty() throws Exception;




}
