import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class P82 {
    //缓冲流
    //实际上还是用的构造方法中的流，只不过在用之前调用了其他方法缓冲
    public static void main(String[] args) {
        /**try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("test.txt"))){
            System.out.println((char) bufferedInputStream.read());
        }catch (IOException e){
            e.printStackTrace();
        }**/
        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("test.txt"))){
            bufferedInputStream.mark(1);    //只保留之后一个字符
            System.out.println((char)bufferedInputStream.read());
            System.out.println((char)bufferedInputStream.read());
            bufferedInputStream.reset();    //回到mark时的位置,超过readlimit时mark失效
            System.out.println((char)bufferedInputStream.read());
            System.out.println((char)bufferedInputStream.read());
        }catch (IOException e){
            e.printStackTrace();
        }

        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("output.txt"))){
            bufferedOutputStream.write("lbwnb".getBytes());
            bufferedOutputStream.flush();
        }catch (IOException e){
            e.printStackTrace();
        }

        //缓冲流可以按行读取readLine()
        try(BufferedReader reader = new BufferedReader(new FileReader("text.txt"))){
            System.out.println(reader.readLine());
            reader
                    .lines()
                    .limit(1)
                    .sorted()
                    .forEach(System.out::println);      //流式操作
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
