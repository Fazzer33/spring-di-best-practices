package at.fhv.spring.di.bestPractices.carExample;

public class DiscBrakes implements IBrakes{

    @Override
    public void brake() {
        System.out.println("Disc Brakes are braking.");
    }
}
