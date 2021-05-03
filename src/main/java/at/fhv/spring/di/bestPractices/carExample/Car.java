package at.fhv.spring.di.bestPractices.carExample;

public class Car {
    private Engine _engine;

    public Car () {

    }

    public void setEngine(Engine engine) {
        _engine = engine;
    }

    public void startCar() {
        _engine.startEngine();
    }
}
