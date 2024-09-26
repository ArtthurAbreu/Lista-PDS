
import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    public void addObserver (Observer observer) { 
        observers.add(observer); 
    }

    public void notifyObservers() {

        for (Observer observer : observers) {
            observer.update(this);
        }

    }

}

/* Feito um loop for para peccorer todos os observadores que foram adicionados à lista observers, chamando  metodo Update e fazendo a atualizacao instantanea em cada posicao que passa na lista dentro do for. */