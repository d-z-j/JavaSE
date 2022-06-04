public class P41 {
    //基本类型包装类。引用类型，不能用 == 来判断是否相等，只能用equals方法比较。== 比较的话，就是比较两个对象的指针是否相同。
    //因为有cache机制，-128～127，实现已经生成好了。== 判断就会相等
    //一旦与基本数据类型进行运算，包装类就会自动拆箱，变为基本数据类型。
    Byte b = 10;
    Integer i = 9;
    Void v = null;
}
