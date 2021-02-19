package Java8NewFeaturesdurgasoft;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class EmployeePredicateSalaryFinder {
    double salary;
    String name;

    public EmployeePredicateSalaryFinder(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public static void main(String[] args) {

        List<EmployeePredicateSalaryFinder> employeeList = Arrays.asList(
                new EmployeePredicateSalaryFinder(1122, "Bltu"),
                new EmployeePredicateSalaryFinder(6122, "Pintu"),
                new EmployeePredicateSalaryFinder(3122, "Nantu"),
                new EmployeePredicateSalaryFinder(8122, "Mnik"),
                new EmployeePredicateSalaryFinder(4122, "Mnik")
        );
        Predicate<EmployeePredicateSalaryFinder> predicate = obj1 -> obj1.salary > 3000;
        for (EmployeePredicateSalaryFinder obj1 : employeeList) {
            if (predicate.test(obj1)) {
                System.out.println(obj1.name + "------" + obj1.salary);
            }
        }
    }
}
