import java.util.ArrayList;
import java.util.List;

class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
interface Observer {
    void update(String message);
}
class PrintObserver implements Observer {
    private String name;

    public PrintObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}
class Main1 {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer observer1 = new PrintObserver("Observer 1");
        Observer observer2 = new PrintObserver("Observer 2");
        Observer observer3 = new PrintObserver("Observer 3");
        Observer observer4 = new PrintObserver("Observer 4");


        subject.add(observer1);
        subject.add(observer2);
        subject.add(observer3);
        subject.add(observer4);

        subject.notifyAllObservers("New post uploaded");

    }
}
