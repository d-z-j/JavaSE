import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P80 {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("test.txt");
            FileWriter writer = new FileWriter("output.txt")) {
            char[] chars = new char[10];
            int tmp;
            while((tmp = reader.read(chars)) != -1){
                writer.write(chars,0,tmp);
            }
            writer.flush();
        }catch (IOException e){
            e.printStackTrace();
        }









        /**try(FileReader fileReader = new FileReader("test.txt")) {
         //fileReader.skip(1);     //跳过一个字符
         //System.out.println((char) fileReader.read());

         char[] chars = new char[10];
         fileReader.read(chars);
         System.out.println(chars);
         }catch (IOException e){
         e.printStackTrace();
         }

         try(FileWriter writer = new FileWriter("output.txt")){
         System.out.println(writer.getEncoding());   //获取编码格式
         writer.write("卢");
         writer.append("本");         //支持链式调用
         writer.write("伟");
         writer.flush();
         }catch (IOException e){
         e.printStackTrace();
         }**/
    }
}
