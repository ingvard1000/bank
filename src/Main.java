import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService servise = new CreditPaymentService();

        double APR = 9.99;     // годовая процентная ставка
        int principal = 1_000_000;      //тело кредита
        int term = 1;  // срок кредита в годах

        System.out.println("При годовой ставке: " + APR + " %");
        System.out.println("Размере кредита в: " + principal + " руб.");

        double annuity = servise.calculate(APR, principal, term);
        System.out.println("Аннуитентный платеж при сроке в 1 год:  " + annuity + " руб.");


        term = 2;  // срок кредита в годах

        annuity = servise.calculate(APR, principal, term);
        System.out.println("Аннуитентный платеж при сроке в 2 года:  " + annuity + " руб.");


        term = 3;  // срок кредита в годах

        annuity = servise.calculate(APR, principal, term);
        System.out.println("Аннуитентный платеж при сроке в 3 года:  " + annuity + " руб.");
    }
}