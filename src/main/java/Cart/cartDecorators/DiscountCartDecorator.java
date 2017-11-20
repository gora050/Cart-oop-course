package Cart.cartDecorators;

import Cart.Cart;
import Cart.cartDecorators.CartDecorator;

public class DiscountCartDecorator extends CartDecorator {
    private static final double DISCOUNT = 0.1;

    public DiscountCartDecorator(Cart cart) {
        super(cart);
    }

    @Override
    public double computeTotalPrice() {
        return super.computeTotalPrice() * DISCOUNT;
    }
}
