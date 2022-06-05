public class P49 {
    //自定义异常
    public static void main(String[] args) {
        try{
            test(1,0);
        }catch (Exception e){
            e.printStackTrace();
        }finally {      //无论是否发生异常finally中的语句都会执行
            System.out.println("lbwnb");
        }
    }

    private static int test(int a,int b)throws MyException{
        if (b == 0) throw new MyException();
        return a/b;
    }
}
