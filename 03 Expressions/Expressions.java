public class Expressions {
    public static void main(String[] args) {
        double subtotal = 100.00;

        double taxPercent = .08;
        double subTotalWithTax = subtotal * taxPercent + subtotal;

        double tipPercent = .15;
        double subTotalWithTip = subTotalWithTax * tipPercent + subTotalWithTax;



        System.out.println("Your total was: " + subTotalWithTip);
    }
}
