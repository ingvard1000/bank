public class CreditPaymentService {
    public double calculate(double APR, int principal, int term) {

        double monthlyRate = 0.01 * APR / 12;     // месячная ставка
        double annuity = (principal * monthlyRate) / (1 - (Math.pow(1 + monthlyRate, -term * 12)));
        int numder = (int) annuity;

        return numder;
    }
}
