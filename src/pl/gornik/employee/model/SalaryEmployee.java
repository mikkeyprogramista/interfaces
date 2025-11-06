package pl.gornik.employee.model;

public class SalaryEmployee implements Payment {
    private final double salary;

    public SalaryEmployee(double salary) {
        this.salary = salary;
    }

    @Override
    public double calculateWage() {
        return salary;
    }
}
