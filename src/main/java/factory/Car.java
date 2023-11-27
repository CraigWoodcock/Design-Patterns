package factory;

public class Car implements Driveable{
    @Override
    public void drive() {
        System.out.println("Drivng a car");
    }

    public void stop(){
        System.out.println("Stopping the car");
    }
}
