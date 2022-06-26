import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
@P104("1213")
public class P101 {
    public static void main(String[] args) throws ReflectiveOperationException {
        Class<?> clazz = Class.forName("student");
        Object instance = clazz.newInstance();
        Method method = clazz.getMethod("test",String.class);

        method.invoke(instance,"wc");
    }
}
