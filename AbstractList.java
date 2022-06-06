package P54P55;

public abstract class AbstractList<E>{
    public abstract int size();     //获取表的长度
    public abstract void add(E e,int index);    //添加元素
    public abstract E remove(int index);        //移除某一位置的元素
    public abstract E get(int index);           //获取某一位置的元素
}
