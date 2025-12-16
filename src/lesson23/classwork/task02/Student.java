package lesson23.classwork.task02;

public class Student extends Human {

    private String schoolName;
    private int course;

    public void study() {
        System.out.println("Student is studying...");
    }

    @Override
    public void run() {
        System.out.println("Student is running...");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Didn't get enough sleep because  had to go to school early.");
    }
}
