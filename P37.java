public interface P37 {      //借口 interface，只能有public abstract的方法

    int a = 20;     //接口中定义的变量默认是final，不可修改

    void eat();     //默认方法是public abstract

    //默认实现用default
    //default void eat(){}
}
