public class CreditPaymentService {
    public float calculate(long sum, long term) {
        float percent;
        percent = 9.99F / 100F / 12F;
        float rate = 1f + percent;
        float monthlyPercent = (float) Math.pow(rate, term);
        float argument1 = percent * monthlyPercent;
        float argument2 = monthlyPercent - 1F;
        float payment;
        payment = sum * argument1 / argument2;
        return payment;
    }
}
