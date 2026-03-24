/*Practical 4.2 :  Create a base class named Vehicle that contains common attributes such as
vehicleNumber, brand, and fuelType. Include a constructor to initialize these fields and a
method displayDetails() to print them. Derive a subclass Car from Vehicle which adds
attributes such as numberOfSeats and ACavailable (boolean). Override the
displayDetails() method to include the car-specific details, and use the super keyword to
invoke the parent class constructor and methods. Further, derive another subclass
ElectricCar from Car that includes attributes such as batteryCapacity and chargingTime,
and again override the displayDetails() method to include electric car-specific details.
Demonstrate constructor chaining, method overriding, use of protected access specifier
for inherited members, and instanceof operator to check object type at runtime. In the
main() method, create objects of all three classes and display their details using
overridden methods. Also, use upcasting (Vehicle v = new Car(...)) and downcasting with
instanceof check to access subclass-specific features.*/
import java.util.*;
class Vehicle
{
    protected int vehicleNumber;
    String Brand;
    String fuelType;
    Vehicle(int vn, String br, String ft)
    {
        vehicleNumber = vn;
        Brand = br;
        fuelType = ft;
    }
    void displayDetails()
    {
        System.out.print("\n\nVehicle Number = " + vehicleNumber);
        System.out.print("\nVehicle Brand = " + Brand);
        System.out.print("\nVehicle Fuel = " + fuelType);
        return;
    }
}
class Car extends Vehicle
{
    int numberOfSeats;
    boolean ACavailable;
    Car(int vn, String br, String ft, int ns, boolean ac)
    {
        super(vn,br,ft);
        numberOfSeats = ns;
        ACavailable = ac;
    }
    void displayDetails()
    {
        super.displayDetails();
        System.out.print("\nNumber of seats = " + numberOfSeats);
        System.out.print("\nIs AC available = " + ACavailable);
        return;
    }
}
class ElectricCar extends Car
{
    int batteryCapacity;
    float chargingTime;
    ElectricCar(int vn, String br, String ft, int ns, boolean ac,int bc, float ct)
    {
        super(vn,br,ft,ns,ac);
        batteryCapacity = bc;
        chargingTime = ct;
    }
    void displayDetails()
    {
        super.displayDetails();
        System.out.print("\nBattery capacity = " + batteryCapacity);
        System.out.print("\nCharging time = " + chargingTime);
        return;
    }
}
class Transport
{
    public static void main(String[] args)
    {       
        Vehicle v1 = new Vehicle(1234,"Ford","Petrol");
        Car c1 = new Car(2345,"Tata","diesel",5,true);
        ElectricCar e1 = new ElectricCar(3456,"MG","Electric",5,true,60000,5);

        v1.displayDetails();
        c1.displayDetails();
        e1.displayDetails();

        Vehicle v2 = new Car(4444, "Toyota", "Petrol", 5, false);
        v2.displayDetails();
        if(v2 instanceof Car)
        {
            Car c2 = (Car) v2; 
            System.out.println("\n\nDowncasting successful!");
            c2.displayDetails();
        }
    }
}