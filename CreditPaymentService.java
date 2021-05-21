public class CreditPaymentService {
    public long calculate(long credit, int month, double percent) {
        double mPercent = percent / 100 / 12;
        double amount = (1 + mPercent);
        double degree = month;
        var answer = (Math.pow(amount, degree));
        double creditPayment;
        creditPayment = credit * (mPercent + (mPercent / (answer - 1)));
        return (long) creditPayment;
    }

}
