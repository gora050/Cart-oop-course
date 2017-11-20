package Cart.deliveryStrategy;
import java.util.List;
import Game.ComputerGame;

public class DeliveryDHL implements DeliveryStrategy {
    public boolean ship(List<ComputerGame> games) {
        System.out.println("Standart delivery method via DHL");
        return true;
    }
}
