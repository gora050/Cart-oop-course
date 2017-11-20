package Cart.paymentStrategy;

public class PayPalStrategy implements PaymentStrategy {
    public boolean pay(double money) {
        System.out.format("PayPal bill %f$", money);
        return true;
    }
}
