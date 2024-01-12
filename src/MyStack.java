import java.util.ArrayList;
import java.util.LinkedList;

public class MyStack<T> {

    private LinkedList<T> list;

    public MyStack() {
        list = new LinkedList<>();
    }

    public void add(T data) {
        list.add(data);
    }

    public T get() {
        return list.pop(); // peek : 가져만 오는 것, pop : 가져오면서 삭제
    }
}
