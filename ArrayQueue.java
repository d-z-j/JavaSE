package P57;

public class ArrayQueue<E> extends AbstractQueue<E>{
    //底层数组
    private Object[] arr = new Object[20];
    //队尾队首下标
    private int head = 0,tail = 0;

    @Override
    public void offer(E e) {
        int next = (tail + 1) % arr.length;
        if (next == head) return;
        arr[tail] = e;
        tail = (tail + 1) % arr.length;
    }

    @Override
    public E poll() {
        E e = (E) arr[head];
        head = (head + 1) % arr.length;
        return e;
    }
}
