package Cart.paymentStrategy;

public class CashStrategy implements PaymentStrategy {
    public boolean pay(double money) {
        System.out.format("Bill: %f$", money);
        return true;
    }
}
