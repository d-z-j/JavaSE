public class P48 {
    //异常地抛出
    public static void main(String[] args) {
        try{
            test(1,0);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static int test(int a,int b)throws Exception{           //不用throws的话，就用try catch
        if (b == 0) throw new Exception("0不能做为除数！");        //抛出异常之后程序停止运行
        return a/b;
    }
}
