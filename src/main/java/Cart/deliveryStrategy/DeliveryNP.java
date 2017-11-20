package Cart.deliveryStrategy;
import java.util.List;
import Game.ComputerGame;

public class DeliveryNP implements DeliveryStrategy {
    public boolean ship(List<ComputerGame> games) {
        System.out.println("Deiver via Nova Poshta");
        return true;
    }
}
