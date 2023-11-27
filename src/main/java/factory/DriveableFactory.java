package factory;

public class DriveableFactory {

    // take in String from App.main as parameter for getVehicle name
    public static Driveable getVehicle(String name){
        //create new vehicle based on parameter and return vehicle
        switch (name) {
            case "car":
                return new Car();
            case "van":
                return new Van();

            case "truck":
                return new Truck();
        }
    return null;
    }
}
