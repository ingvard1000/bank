public class CreditPaymentService {
    public double calculate(double percentageRate, int principal, int term) {

        double monthlyRate = 0.01 * percentageRate / 12;     // месячная ставка
        double annuity = (principal * monthlyRate) / (1 - (Math.pow(1 + monthlyRate, -term * 12)));
        int numder = (int) annuity;

        return numder;
    }
}
