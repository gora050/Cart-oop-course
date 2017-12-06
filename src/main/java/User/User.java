package User;

import Cart.cartObserver.Observer;

public class User implements Observer{
    public void update() {
        System.out.println("Updated!!!");
    }
}
