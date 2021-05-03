package at.fhv.spring.di.bestPractices.carExample;

public class DrumBrakes implements IBrakes{
    @Override
    public void brake() {
        System.out.println("Drum Brakes are braking.");
    }
}
