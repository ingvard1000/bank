public class Main {
    public static void main(String[] args) {
        CreditPaymentService servise = new CreditPaymentService();

        double percentRate = 9.99;
        int credit = 1_000_000;
        int years = 1;  // срок кредита в годах

        System.out.println("При годовой ставке: " + percentRate + " %");
        System.out.println("Размере кредита в: " + credit + " руб.");

        double annuity = servise.calculate(percentRate, credit, years);
        // annuity - аннуитент
        System.out.println("Аннуитентный платеж при сроке в 1 год:  " + annuity + " руб.");


        years = 2;  // срок кредита в годах

        annuity = servise.calculate(percentRate, credit, years);
        System.out.println("Аннуитентный платеж при сроке в 2 года:  " + annuity + " руб.");


        years = 3;  // срок кредита в годах

        annuity = servise.calculate(percentRate, credit, years);
        System.out.println("Аннуитентный платеж при сроке в 3 года:  " + annuity + " руб.");
    }
}