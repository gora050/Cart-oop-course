package Cart;
import Cart.cartDecorators.CartDecorator;
import Cart.deliveryStrategy.DeliveryDHL;
import Cart.paymentStrategy.CashStrategy;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import Cart.paymentStrategy.PayPalStrategy;
import Cart.paymentStrategy.PaymentStrategy;
import Cart.deliveryStrategy.DeliveryNP;
import Cart.deliveryStrategy.DeliveryStrategy;

public class CartDecoratorTest {
    private Cart cart;

    @Before
    public void setUp() throws Exception {
        cart = new CartDecorator(CartTestObjects.cart1());
    }

    @Test
    public void computeTotalPrice() throws Exception {
        assertEquals(19000d, cart.computeTotalPrice(), 0.000001);
    }

    @Test
    public void ship() throws Exception {
        assertTrue(cart.ship());
    }
    @Test
    public void setPaymentStrategy() throws Exception {
        PaymentStrategy paymentStrategy = new PayPalStrategy();
        cart.setPaymentStrategy(paymentStrategy);
        assertEquals(paymentStrategy, cart.getPaymentStrategy());
    }

    @Test
    public void setPaymentStrateg2() throws Exception {
        PaymentStrategy paymentStrategy = new CashStrategy();
        cart.setPaymentStrategy(paymentStrategy);
        assertEquals(paymentStrategy, cart.getPaymentStrategy());
    }

    @Test
    public void setDeliveryStrategy() throws Exception {
        DeliveryStrategy deliveryStrategy = new DeliveryNP();
        cart.setDeliveryStrategy(deliveryStrategy);
        assertEquals(deliveryStrategy, cart.getDeliveryStrategy());
    }

    @Test
    public void setDeliveryStrategy2() throws Exception {
        DeliveryStrategy deliveryStrategy = new DeliveryDHL();
        cart.setDeliveryStrategy(deliveryStrategy);
        assertEquals(deliveryStrategy, cart.getDeliveryStrategy());
    }
}
