package lesson30ComparingObjects.gptPractice.task2;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    /*
    Написать EmployeeComparator, который сортирует:
1️⃣ по департаменту
2️⃣ если департамент одинаковый — по зарплате (по убыванию)
3️⃣ если и зарплата одинаковая — по опыту (по возрастанию)
     */

    @Override
    public int compare(Employee employee1, Employee employee2) {

        if (employee1.getDepartment().compareTo(employee2.getDepartment()) != 0) {
            return employee1.getDepartment().compareTo(employee2.getDepartment());
        }

        if (Double.compare(employee1.getSalary(), employee2.getSalary()) != 0) {
            return Double.compare(employee2.getSalary(), employee1.getSalary());
        }

        return employee1.getExperienceYears() - employee2.getExperienceYears();
    }
}
