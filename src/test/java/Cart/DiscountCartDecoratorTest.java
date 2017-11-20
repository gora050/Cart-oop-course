package Cart;
import Cart.cartDecorators.DiscountCartDecorator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class DiscountCartDecoratorTest {
    @Test
    public void computeTotalPrice() throws Exception {
        assertEquals(0d, new DiscountCartDecorator(CartTestObjects.cart3()).computeTotalPrice(), 0.000001);
    }
    @Test
    public void computeTotalPrice2() throws Exception {
        assertEquals(1129.5d, new DiscountCartDecorator(CartTestObjects.cart2()).computeTotalPrice(), 0.000001);
    }
    @Test
    public void computeTotalPrice3() throws Exception {
        assertEquals(1900d, new DiscountCartDecorator(CartTestObjects.cart1()).computeTotalPrice(), 0.000001);
    }
}
