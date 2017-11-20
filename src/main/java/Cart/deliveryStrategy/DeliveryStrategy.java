package Cart.deliveryStrategy;
import java.util.List;
import Game.ComputerGame;

public interface DeliveryStrategy {
    boolean ship(List<ComputerGame> games);
}
