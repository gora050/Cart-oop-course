package Cart;
import Cart.cartDecorators.BonusCartDecorator;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
public class BonusCartDecoratorTest {
    @Test
    public void ship() throws Exception {
        assertTrue( new BonusCartDecorator(CartTestObjects.cart3()).ship());
    }
    @Test
    public void ship2() throws Exception {
        assertTrue( new BonusCartDecorator(CartTestObjects.cart2()).ship());
    }
    @Test
    public void ship3() throws Exception {
        assertTrue( new BonusCartDecorator(CartTestObjects.cart1()).ship());
    }
}
