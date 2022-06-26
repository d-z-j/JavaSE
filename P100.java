import java.lang.reflect.InvocationTargetException;

public class P100 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Student> calzz = Student.class;
        //Student student = calzz.newInstance();      //通过反射创建新的对象,该方法只支持无参构造.局限性太大不推荐使用
        Student student = calzz.getConstructor(String.class).newInstance("what's up");
        student.test();
    }
    static class Student{
        public Student(String str) {
            System.out.println(str+"nb");
        }

        public void test(){
            System.out.println("lbwnb");
        }
    }
}
