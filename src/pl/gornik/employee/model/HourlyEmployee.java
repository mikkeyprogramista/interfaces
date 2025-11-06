package pl.gornik.employee.model;

public class HourlyEmployee implements Payment {
    private final double wageForHour;
    private final int hoursWorked;

    public HourlyEmployee(
            double wageForHour,
            int hoursWorked) {
        this.wageForHour = wageForHour;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateWage() {
        int overtime = Math.max(0, hoursWorked - 160);
        return wageForHour * (hoursWorked - overtime) + overtime * wageForHour * 1.50;
    }
}
