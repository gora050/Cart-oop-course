package Cart;

import Game.ComputerGame;
import Cart.deliveryStrategy.DeliveryNP;
import Cart.deliveryStrategy.DeliveryDHL;
import Cart.paymentStrategy.CashStrategy;
import Cart.paymentStrategy.PayPalStrategy;
import Game.ComputerGameTestObjects;

import java.util.ArrayList;
import java.util.List;

public class CartTestObjects {
    public static Cart cart1() {
        List<ComputerGame> games = new ArrayList<ComputerGame>()
        {{
            add(new ComputerGame(ComputerGameTestObjects.GameParams3()));
            add(new ComputerGame(ComputerGameTestObjects.GameParams1()));

            add(new ComputerGame(ComputerGameTestObjects.GameParams1()));
        }};
        return new Cart(games, new PayPalStrategy(), new DeliveryNP());
    }

    public static Cart cart2() {
        List<ComputerGame> games = new ArrayList<ComputerGame>()
        {{
            add(new ComputerGame(ComputerGameTestObjects.GameParams3()));

            add(new ComputerGame(ComputerGameTestObjects.GameParams1()));
            add(new ComputerGame(ComputerGameTestObjects.GameParams2()));
        }};
        return new Cart(games, new CashStrategy(), new DeliveryDHL());
    }

    public static Cart cart3() {
        List<ComputerGame> games = new ArrayList<ComputerGame>()
        {{
            add(new ComputerGame(ComputerGameTestObjects.GameParams3()));
            add(new ComputerGame(ComputerGameTestObjects.GameParams3()));
            add(new ComputerGame(ComputerGameTestObjects.GameParams3()));
            add(new ComputerGame(ComputerGameTestObjects.GameParams3()));
        }};
        return new Cart(games, new CashStrategy(), new DeliveryDHL());
    }
}
