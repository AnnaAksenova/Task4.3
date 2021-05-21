public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        long creditPaymentOne = service.calculate(1_000_000, 12, 9.99);
        System.out.println(creditPaymentOne);
        long creditPaymentTwo = service.calculate(1_000_000, 24, 9.99);
        System.out.println(creditPaymentTwo);
        long creditPaymentThree = service.calculate(1_000_000, 36, 9.99);
        System.out.println(creditPaymentThree);
    }
}
