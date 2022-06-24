import java.io.*;
import java.util.Arrays;

public class P81 {
    public static void main(String[] args) {
        /**File file = new File("test.txt");
        System.out.println(file.exists());          //是否存在
        System.out.println(file.length());          //文件长度
        System.out.println(file.isDirectory());     //是否为一个文件夹
        System.out.println(file.canRead());         //是否可读
        System.out.println(file.canWrite());        //是否可写
        System.out.println(file.canExecute());      //是否可执行**/

        //通过File操作文件夹和文件
        File file1 = new File("/Users/dang/IdeaProjects");
        System.out.println(Arrays.toString(file1.list()));      //输出路径下的所有文件
        for (File f:file1.listFiles()) {
            System.out.println(f.getAbsolutePath());        //输出文件的绝对路径
            try(FileReader reader = new FileReader(f)) {

            }catch (IOException e){
                e.printStackTrace();
            }
        }

        //拷贝整个文件夹的内容到另一个文件夹
        File file = new File(".idea/");
        File target = new File("new/");
        target.mkdir();
        for (File f:file.listFiles()) {
            try(FileInputStream inputStream = new FileInputStream(f);
                FileOutputStream fileOutputStream = new FileOutputStream(target.getPath()+"/"+target.getName())){
                 byte[] bytes = new byte[20];
                 int tmp;
                 while ((tmp = inputStream.read(bytes)) != -1){
                     fileOutputStream.write(bytes,0,tmp);
                 }
        }catch (IOException e){
                e.printStackTrace();
            }

        }
    }
}
