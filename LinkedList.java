package P54P55;

public class LinkedList<E> extends AbstractList<E>{

    private Node<E> head = new Node<>(null);
    private int size;
    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E e, int index) {
        if (index > size || index < 0) throw new IllegalArgumentException("非法的插入位置");    //判断插入位置是否合法
        Node<E> node = head,temp;        //辅助结点node,temp
        for (int i = 0; i < index; i++) node = node.next;   //找到插入位置
        temp = node.next;
        node.next = new Node<>(e);
        node.next.next = temp;
        size++;
    }

    @Override
    public E remove(int index) {
        if (index > size - 1 || index < 0) throw new IllegalArgumentException("非法的删除位置");
        if (size == 0) throw new IllegalArgumentException("无法删除空的顺序表");
        Node<E> node = head,temp;        //辅助结点node,temp
        for (int i = 0; i < index; i++) node = node.next;   //找到删除位置
        temp = node.next;
        node.next = node.next.next;
        size--;
        return temp.e;
    }

    @Override
    public E get(int index) {
        if (index > size - 1 || index < 0) throw new IndexOutOfBoundsException("无法访问到下标位置");
        Node<E> node = head.next;        //辅助结点node,temp
        for (int i = 0; i < index; i++) node = node.next;   //找到位置
        return node.e;
    }

    //结点类
    static class Node<E>{
        private E e;
        private Node<E> next;

        public Node(E e){
            this.e = e;
        }
    }
}
