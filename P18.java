import java.util.Scanner;

public class P18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();        //调用next方法获取用户输入的内容
        System.out.println("你输入了：" + str);
        scanner.close();    //关闭输入流
    }
}
