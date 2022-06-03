public class P22 {
    //方法重载，方法名可以相同，但是参数类型和个数不同
    int sum(int a,int b){
        return a + b;
    }

    double sum(double a,double b){
        return a + b;
    }

    int sum(int i){
        return i;
    }

    public static void main(String[] args) {
        P22 p22 = new P22();
        double a = p22.sum(3.2,2.5);
        System.out.println(a);
    }
}
