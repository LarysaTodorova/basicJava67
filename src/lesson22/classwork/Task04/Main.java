package lesson22.classwork.Task04;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Max", 3, 9.56);

        student.increaseCourse();
        System.out.println("Max now is on course - " + student.course);
        System.out.println("Average rate - " + student.averageRate);
    }
}
