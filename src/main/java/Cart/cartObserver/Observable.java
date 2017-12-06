package Cart.cartObserver;

import java.util.List;

public class Observable {
    private List<Observer> observers;
    public boolean addObserver(Observer obs){
        observers.add(obs);
        return true;
    }
    public boolean removeObserver(Observer obs){
        observers.remove(obs);
        return true;
    }
    public boolean notifyObservers(){
        for (Observer observer : observers ){
            observer.update();
        }
        return true;
    }
}
