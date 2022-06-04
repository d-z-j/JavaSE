public class P40 {
    private final String name;
    private final int age;
    private Status status;

    public P40(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public static void main(String[] args) {
        P40 student = new P40("lbw",10);
        student.setStatus(Status.SLEEP);
        System.out.println(student.getStatus().getName());

        //System.out.println(Status.valueOf("STUDY"));
        for (Status status : Status.values()
             ) {
            System.out.println(status);

        }
    }
}
