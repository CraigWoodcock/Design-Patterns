package factory;

import java.util.logging.Logger;

public class App {

    //factory method to create a new logger.
//    Logger logger = Logger.getLogger("my-logger");


    public static void main(String[] args) {

        Driveable vehicle = DriveableFactory.getVehicle("truck");
        //creates a vehicle of type Driveable. using DriveableFactory - getVehicle() method
        //passing in String "truck" to create a truck object
        Car car1 = new  Car();
        //creates a new car1 of type Car
        vehicle.drive();
        //calls the drive method from the truck class(implemented from interface)

//        vehicle.stop(); //breaks liskov because truck doesn't have a stop() method.
//      call car1.stop(), this works because Car has a stop() method
        car1.stop();




    }
}
