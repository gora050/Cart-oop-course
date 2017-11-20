package Cart.cartDecorators;

import Cart.Cart;
import Cart.deliveryStrategy.DeliveryStrategy;
import Cart.paymentStrategy.PaymentStrategy;

public class CartDecorator extends Cart {
    private final Cart cart;

    public CartDecorator(Cart cart) {
        super(cart.getGames(),cart.getPaymentStrategy(),cart.getDeliveryStrategy());
        this.cart = cart;
    }

    public double computeTotalPrice() {
        return cart.computeTotalPrice();
    }

    public boolean ship() {
        return cart.ship();
    }

    public PaymentStrategy getPaymentStrategy() {
        return cart.getPaymentStrategy();
    }

    public void setPaymentStrategy(PaymentStrategy newPaymentStrategy) {
        cart.setPaymentStrategy(newPaymentStrategy);
    }

    public DeliveryStrategy getDeliveryStrategy() {
        return cart.getDeliveryStrategy();
    }

    public void setDeliveryStrategy(DeliveryStrategy newDeliveryStrategy) {
        cart.setDeliveryStrategy(newDeliveryStrategy);
    }
}
