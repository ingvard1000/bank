public class CreditPaymentService {
    public double calculate(double apr, int principal, int term) {

        double monthlyRate = 0.01 * apr / 12;     // месячная ставка
        double annuity = (principal * monthlyRate) / (1 - (Math.pow(1 + monthlyRate, -term * 12)));
        int numder = (int) annuity;

        return numder;
    }
}
