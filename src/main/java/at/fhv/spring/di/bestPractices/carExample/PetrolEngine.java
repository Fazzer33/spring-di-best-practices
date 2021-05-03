package at.fhv.spring.di.bestPractices.carExample;

public class PetrolEngine implements IEngine {

    @Override
    public void startEngine() {
        System.out.println("Start Petrol Engine");
    }
}
