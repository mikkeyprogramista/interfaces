package pl.gornik.employee.model;

public class Employee {
    private final String firstName;
    private final String lastName;
    private final Payment payment;

    public Employee(
            String name,
            String lastName,
            Payment payment) {
        this.firstName = name;
        this.lastName = lastName;
        this.payment = payment;
    }

    public double calculateWage() {
        return payment.calculateWage();
    }

    public String getFullName() {
        return new StringBuilder()
                .append(firstName)
                .append(" ")
                .append(lastName)
                .toString();
    }
}
