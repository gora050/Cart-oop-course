package Cart;

import Game.ComputerGame;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import Cart.paymentStrategy.CashStrategy;
import Cart.paymentStrategy.PaymentStrategy;
import Cart.deliveryStrategy.DeliveryDHL;
import Cart.deliveryStrategy.DeliveryStrategy;

public class ComputerGameCartTest {
    private Cart cart;
    private PaymentStrategy paymentStrategy = new CashStrategy();
    private DeliveryStrategy deliveryStrategy = new DeliveryDHL();
    private List<ComputerGame> games = new ArrayList<ComputerGame>()
    {{
        add(new ComputerGame(Game.ComputerGameTestObjects.GameParams2()));
        add(new ComputerGame(Game.ComputerGameTestObjects.GameParams1()));
    }};

    @Before
    public void setUp() throws Exception {
        cart = new Cart(games, paymentStrategy, deliveryStrategy);
    }

    @Test
    public void computeTotalPrice() throws Exception {
        assertEquals(11295d, cart.computeTotalPrice(), 0.000001);
    }

    @Test
    public void getPaymentStrategy() throws Exception {
        assertEquals(paymentStrategy, cart.getPaymentStrategy());
    }

    @Test
    public void setPaymentStrategy() throws Exception {
        PaymentStrategy paymentStrategy = new CashStrategy();
        cart.setPaymentStrategy(paymentStrategy);
        assertEquals(paymentStrategy, cart.getPaymentStrategy());
    }

    @Test
    public void ship() throws Exception {
        assertTrue(cart.ship());
    }

    @Test
    public void getDeliveryStrategy() throws Exception {
        assertEquals(deliveryStrategy, cart.getDeliveryStrategy());
    }

    @Test
    public void setDeliveryStrategy() throws Exception {
        DeliveryStrategy deliveryStrategy = new DeliveryDHL();
        cart.setDeliveryStrategy(deliveryStrategy);
        assertEquals(deliveryStrategy, cart.getDeliveryStrategy());
    }
}
