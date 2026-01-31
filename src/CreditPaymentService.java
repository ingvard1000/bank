public class CreditPaymentService {
    public double calculate(double percentRate, int credit, int years) {

        double monthlyRate = 0.01 * percentRate / 12;     // месячная ставка
        double annuity = (credit * monthlyRate) / (1 - (Math.pow(1 + monthlyRate, -years * 12)));
        int numder = (int) annuity;

        return numder;
    }
}
