package lesson30ComparingObjects.gptPractice.task2;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeDemo {
    public static void main(String[] args) {

        Set<Employee> employees = new TreeSet<>(new EmployeeComparator());

        employees.add(new Employee("Jack", "Development", 3500, 7));
        employees.add(new Employee("Bob", "Management", 2900, 3));
        employees.add(new Employee("Olivia", "Development", 3500, 5));
        employees.add(new Employee("Alexa", "Development", 5700, 15));
        employees.add(new Employee("John", "Management", 2900, 4));
        employees.add(new Employee("Max", "Development", 4300, 10));

        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }
}
