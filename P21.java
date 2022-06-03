public class P21 {
    String name;
    int age;

    void speak(String word){
        System.out.println(name + "在说话:" + word);
    }

    void study(){
        System.out.println("我在学习！");
    }

    void sport(){
        System.out.println("我在运动！");
    }

    public static void main(String[] args) {
        P21 p21 = new P21();
        p21.name = "lbw";
        p21.age = 10;
        p21.study();
        p21.sport();
        p21.speak("lbwnb");
    }
}
