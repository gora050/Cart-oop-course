package Cart;

import Cart.cartObserver.Observable;
import Cart.deliveryStrategy.DeliveryStrategy;
import Cart.paymentStrategy.PaymentStrategy;
import Game.ComputerGame;

import java.util.List;

public class Cart extends Observable{

    private List<ComputerGame> games;
    private DeliveryStrategy deliveryStrategy;
    private PaymentStrategy paymentStrategy;


    public Cart(List<ComputerGame> games, PaymentStrategy paymentStrategy, DeliveryStrategy deliveryStrategy) {
        this.games = games;
        this.deliveryStrategy = deliveryStrategy;
        this.paymentStrategy = paymentStrategy;
    }

    public List<ComputerGame> getGames() {
        return games;
    }

    public double computeTotalPrice() {
        double price = 0d;
        for (ComputerGame game : games) {
            price += game.getGameParams().getPrice();
        }
        return price;
    }

    public boolean ship() {
        return deliveryStrategy.ship(games);
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy newPaymentStrategy) {
        this.paymentStrategy = newPaymentStrategy;
    }

    public DeliveryStrategy getDeliveryStrategy() {
        return deliveryStrategy;
    }

    public void setDeliveryStrategy(DeliveryStrategy newDeliveryStrategy) {
        this.deliveryStrategy = newDeliveryStrategy;
    }
    }
