package pl.gornik.employee.model;

public class CommissionEmployee implements Payment {
    private final double baseSalary;
    private final double companyProfit;
    private final double rate;

    public CommissionEmployee(
            double baseSalary,
            double companyProfit,
            double rate) {
        this.baseSalary = baseSalary;
        this.companyProfit = companyProfit;
        this.rate = rate;
    }

    @Override
    public double calculateWage() {
        return baseSalary + companyProfit * rate / 100.00;
    }
}
