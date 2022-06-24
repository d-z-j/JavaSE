import java.io.*;

public class P83 {
    //转换流
    public static void main(String[] args) {
        try(OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("test.txt"))){
            writer.write("lbwnb");
        }catch (IOException e){
            e.printStackTrace();
        }

        try(InputStreamReader writer = new InputStreamReader(new FileInputStream("test.txt"))){
            writer.read();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
