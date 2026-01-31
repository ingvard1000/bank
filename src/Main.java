public class Main {
    public static void main(String[] args) {
        CreditPaymentService servise = new CreditPaymentService();

        double percentageRate = 9.99;     // APR (Annual Percentage Rate) — годовая процентная ставка.
        int principal = 1_000_000;  //Principal в контексте банковского кредита — это основная сумма, первоначальная сумма денег, взятая в долг, без учёта процентов и дополнительных сборов.
        int term = 1;  // срок кредита в годах

        System.out.println("При годовой ставке: " + percentageRate + " %");
        System.out.println("Размере кредита в: " + principal + " руб.");

        double annuity = servise.calculate(percentageRate, principal, term);
        // annuity - аннуитент
        System.out.println("Аннуитентный платеж при сроке в 1 год:  " + annuity + " руб.");


        term = 2;  // срок кредита в годах

        annuity = servise.calculate(percentageRate, principal, term);
        System.out.println("Аннуитентный платеж при сроке в 2 года:  " + annuity + " руб.");


        term = 3;  // срок кредита в годах

        annuity = servise.calculate(percentageRate, principal, term);
        System.out.println("Аннуитентный платеж при сроке в 3 года:  " + annuity + " руб.");
    }
}