public class MyArray<T> {

    private Object arr[];
    private int size;
    private final int default_size = 10;

    public MyArray() {
        arr = new Object[default_size];
    }

    public MyArray(int size) {
        arr = new Object[size];
        this.size = size;
    }

    public void add(T data, int index) {
        arr[index] = data;
    }

    public T get(int index) {
        return (T)arr[index];
    }




}
