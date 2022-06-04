public enum Status {
    //枚举类实质也是一个类，每一个状态都是一个public static final累的成员变量。
    RUNNING("跑步"),STUDY("学习"),SLEEP("睡觉");

    private final String name;

    Status(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
