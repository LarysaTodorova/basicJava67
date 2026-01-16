package lesson32LambdasFunctionalInterface.classwork.task1;

public class FilterByRate implements Filter {

    @Override
    public boolean test(Student student) {
//        if (student.getAverageRate() > 4.6) {
//            return true;
//        } else {
//            return false;
//        }
        return student.getAverageRate() > 4.6;
    }
}
