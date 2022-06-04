public class Main {
    public static void main(String[] args) {

    }

    public static void test(Person person){
        if (person instanceof Exam){
            Exam e = (Exam) person;
            e.exam();
        }
    }
}
