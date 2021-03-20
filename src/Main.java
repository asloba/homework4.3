public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int paymentFor1Year = (int) service.calculate(1_000_000, 12);
        System.out.println(paymentFor1Year);
        int paymentFor2Years = (int) service.calculate(1_000_000, 24);
        System.out.println(paymentFor2Years);
        int paymentFor3Years = (int) service.calculate(1_000_000, 36);
        System.out.println(paymentFor3Years);
    }
}
