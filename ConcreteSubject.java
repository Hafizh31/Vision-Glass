import java.util.*;

public class ConcreteSubject implements Subject {
    private ArrayList<Observer> observers;
    private float LightIntensity;

    public ConcreteSubject() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(LightIntensity);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float LightIntensity) {
        this.LightIntensity=LightIntensity;
        measurementsChanged();
    }

    public float getLigthIntensity() {
        return LightIntensity;
    }



}
