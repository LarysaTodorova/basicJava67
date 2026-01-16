package lesson32LambdasFunctionalInterface.classwork.task1;

public class FilterByDegreeAndCourse implements Filter {

    @Override
    public boolean test(Student student) {
        return student.getCourse() < 4 && student.getDegree().equals(Degree.BACHELOR);
    }
}
