public class P47 {
    //异常的处理。RuntimeException是运行时异常，Exception是编译时异常
    public static void main(String[] args) {
        int[] arr = new int[5];
        //try出现异常运行catch中的内容。若try中无异常发生则运行try中的语句。
        try {
            arr[5] = 1;
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("程序运行出现异常！数组越界");
        }
        //try catch后面的语句正常运行
        System.out.println("lbwnb");

        //捕获错误
        try {
            int[] arr1 = new int[Integer.MAX_VALUE];
        }catch (Throwable e){
            System.out.println("捕获到错误");
        }
        System.out.println("lbwnb");
    }


}
