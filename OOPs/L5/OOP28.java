

class TaxCalculator {

    private static final double taxRate = 0.15;
    private static final double hourlyRate = 12.0;

    public double calculateTax(double totalPay) {
        return totalPay * taxRate;
    }

    public double calculateNetPay(double hours) {
        double totalPay = hours * hourlyRate;
        double taxAmount = calculateTax(totalPay);
        return totalPay - taxAmount;
    }
}

public class OOP28 {
    public static void main(String[] args) {
        TaxCalculator calculator = new TaxCalculator();

        double hoursWorked = 40.0;
        double netPay = calculator.calculateNetPay(hoursWorked);

        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Net Pay: $" + netPay);
    }
}