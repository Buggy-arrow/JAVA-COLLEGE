abstract class Vehicle{
    abstract String fuelType();
    abstract int noOfWheels();
}
class Car extends Vehicle{
    String fuelType(){
        return "Petrol/Diesel";
    }

    int noOfWheels(){
        return 4;
    }
}
class Bike extends Vehicle{
    String fuelType(){
        return "Petrol";
    }

    int noOfWheels(){
        return 2;
    }
}
public class AbstractDemo{
    public static void main(String args[]){

        System.out.println("\n\nEnrollment No.: 240410107167\nName : Shah Purva Pankit");

        Car c=new Car();
        Bike b=new Bike();

        System.out.println("Car Fuel Type: "+c.fuelType());
        System.out.println("Car Wheels: "+c.noOfWheels());

        System.out.println();

        System.out.println("Bike Fuel Type: "+b.fuelType());
        System.out.println("Bike Wheels: "+b.noOfWheels());
    }
}
