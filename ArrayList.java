package P54P55;

public class ArrayList<E> extends AbstractList<E>{
    //底层数组
    private Object[] arr = new Object[1];
    //长度
    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E e, int index) {
        if (index > size || index < 0) throw new IllegalArgumentException("非法的插入位置");    //判断插入位置是否合法
        if (size >= arr.length){                //扩容
            Object[] temp = new Object[arr.length + 10];
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
        }
        for (int i = size - 1; i >= index; i--) {   //后移元素
            arr[i + 1] = arr[i];
        }
        arr[index] = e;     //插入元素
        size++;
    }

    @Override
    public E remove(int index) {
        if (index > size - 1 || index < 0) throw new IllegalArgumentException("非法的删除位置");
        if (size == 0) throw new IllegalArgumentException("无法删除空的顺序表");
        E temp = (E) arr[index];
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        return temp;
    }

    @Override
    public E get(int index) {
        if (index > size - 1 || index < 0) throw new IndexOutOfBoundsException("无法访问到下标位置");
        return (E) arr[index];
    }
}
