package at.fhv.spring.di.bestPractices.carExample;

public class Car {
    private IEngine _engine;
    private IBrakes _brakes;

    public Car (IEngine engine, IBrakes brakes) {
        _engine = engine;
        _brakes = brakes;
    }

    public void setEngine(IEngine engine) {
        _engine = engine;
    }

    public void setBrakes(IBrakes brakes) {
        _brakes = brakes;
    }

    public void startCar() {
        _engine.startEngine();
    }

    public void stopCar() {
        _brakes.brake();
    }
}
