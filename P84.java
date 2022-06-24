import java.io.*;

public class P84 {
    //数据流 可以直接读取基本数据类型
    public static void main(String[] args) {

        //写入的是二进制数据
        try(DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("output.txt"))){
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeFloat(1.5f);
        }catch (IOException e){
            e.printStackTrace();
        }
        //读出
        try(DataInputStream dataInputStream = new DataInputStream(new FileInputStream("output.txt"))){
            System.out.println(dataInputStream.readBoolean());
            System.out.println(dataInputStream.readFloat());
        }catch (IOException e){
            e.printStackTrace();
        }

        //对象流
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("output.txt"));
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("output.txt"))){
            People people = new People("lbw");
            outputStream.writeObject(people.name);
            outputStream.flush();
            people = (People) inputStream.readObject();
            System.out.println(people.name);
        }catch(IOException | ClassNotFoundException e ){
            e.printStackTrace();
        }


        }
        static class People implements Serializable{        //必须实现serializable接口才能被序列化
            String name;
            //transient String name;
            public People(String name){
                this.name = name;
            }
    }
}
