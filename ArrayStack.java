package P56;

public class ArrayStack<E> extends AbstractStack<E>{

    //底层数组
    private Object[] arr = new Object[1];
    //长度
    private int size = 0;

    @Override
    public E pop() {
        return (E) arr[(size--) - 1];
        //size--;
    }

    @Override
    public void push(E e) {
        if (size >= arr.length){                //扩容
            Object[] temp = new Object[arr.length + 10];
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
        }
        arr[size++] = e;
        //size++;
    }
}
