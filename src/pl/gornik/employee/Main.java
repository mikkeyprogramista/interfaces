package pl.gornik.employee;

import pl.gornik.employee.model.CommissionEmployee;
import pl.gornik.employee.model.Employee;
import pl.gornik.employee.model.HourlyEmployee;
import pl.gornik.employee.model.SalaryEmployee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(
                "Mikołaj",
                "Sałek",
                new SalaryEmployee(22000.00)));
        employees.add(new Employee(
                "Wojciech",
                "Nowocień",
                new CommissionEmployee(4200.00, 50000.00, 5.00)));
        employees.add(new Employee(
                "Piotr",
                "Wajs",
                new HourlyEmployee(32.00, 180)));

        for (Employee employee : employees) {
            System.out.printf("%s otrzymuje miesięcznie: %.2f\n",
                    employee.getFullName(),
                    employee.calculateWage());
            System.out.println();
        }
    }
}
