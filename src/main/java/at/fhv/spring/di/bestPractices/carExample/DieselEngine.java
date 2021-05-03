package at.fhv.spring.di.bestPractices.carExample;

public class DieselEngine implements IEngine {

    @Override
    public void startEngine() {
        System.out.println("Start Diesel Engine");
    }
}
