package lesson22.classwork.Task04;

public class Student {

     String name;
     int course;
     double averageRate;

    public Student(String name, int course, double averageRate) {
        this.name = name;
        this.course = course;
        this.averageRate = averageRate;
    }

    public void increaseCourse() {
        course++;
        resetAverageRate();
    }

    private void resetAverageRate() {
        averageRate = 0.0;
    }
}
