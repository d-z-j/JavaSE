import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class P79 {
    public static void main(String[] args) {
        //精简语法
        //输入流
        try(FileInputStream inputStream = new FileInputStream("test.txt")){

            /**System.out.println((char)inputStream.read());   //读取一个字节
            System.out.println((char)inputStream.read());   //读取一个字节
            System.out.println((inputStream.read()));       //读取完之后返回-1，表示没有内容了**/

            /**int tmp;
            while ((tmp =inputStream.read()) != -1){
                System.out.println((char)tmp);
                System.out.println(inputStream.available());    //查看剩余数量
            }**/

            /**System.out.println(inputStream.skip(1));     //跳过第一个bytes
            System.out.println((char)inputStream.read());**/
            byte[] bytes = new byte[inputStream.available()];   //准备大小合适的byte数组来存放
            System.out.println(inputStream.read(bytes));        //一次性读取全部内容（返回值是读取的字节数）
            System.out.println(new String(bytes));              //通过string(byte[])构造方法得到字符串
        }catch (IOException e){
            e.printStackTrace();
        }

        //输出流
        try(FileOutputStream outputStream = new FileOutputStream("output.txt",true)){
            //outputStream.write('a');      //写入一个字符
            outputStream.write("lbwnb".getBytes());     //默认覆盖插入，追加的话将构造方法true
            outputStream.flush();   //最后一次写入，刷新一次保证正确写入
        }catch (IOException e){
            e.printStackTrace();
        }








        //精简写法本质上和下面这个一样
        /**FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("test.txt");


        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }**/
    }
}
