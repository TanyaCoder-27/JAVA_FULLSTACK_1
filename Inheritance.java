class Vehicle {
    String name;
    int number;

    Vehicle(String name, int number) {
        this.name = name;
        this.number = number;
    }

    // Changed to non-static
    public void showDetails() {
        System.out.println("Name: " + name + " Number: " + number);
    }
}

class Bus extends Vehicle {
    String type;

    Bus(String name, int number, String type) {
        super(name, number);
        this.type = type;
    }

    @Override
    public void showDetails() {
        System.out.println("Name: " + name + " Number: " + number + " Type: " + type);
    }
}

class Car extends Vehicle {
    String color;

    // Corrected constructor name
    Car(String name, int number, String color) {
        super(name, number);
        this.color = color;
    }

    @Override
    public void showDetails() {
        System.out.println("Name: " + name + " Number: " + number + " Color: " + color);
    }
}

public class Inheritance {
    public static void main(String args[]) {
        Vehicle v = new Vehicle("Meow", 3478);
        Bus b = new Bus("Bow", 97650, "Red Bus");
        Car c = new Car("Cow", 5790, "Red");

        v.showDetails();
        b.showDetails();
        c.showDetails();
    }
}




/*

class Vehicle {
    String name;
    int number;

    Vehicle(String name, int number) {
        this.name = name;
        this.number = number;
    }

    void displayInfo() {
        System.out.println("Vehicle Name: " + name + ", Number: " + number);
    }
}

// Child Classes inheriting from Vehicle
class Bus extends Vehicle {
    int capacity;

    Bus(String name, int number, int capacity) {
        super(name, number);
        this.capacity = capacity;
    }

    void showBusDetails() {
        displayInfo();
        System.out.println("Bus Capacity: " + capacity);
    }
}

class Car extends Vehicle {
    String fuelType;

    Car(String name, int number, String fuelType) {
        super(name, number);
        this.fuelType = fuelType;
    }

    void showCarDetails() {
        displayInfo();
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Bike extends Vehicle {
    boolean hasGear;

    Bike(String name, int number, boolean hasGear) {
        super(name, number);
        this.hasGear = hasGear;
    }

    void showBikeDetails() {
        displayInfo();
        System.out.println("Has Gear: " + hasGear);
    }
}

// Main Method to Test Inheritance
public class InheritanceDemo {
    public static void main(String[] args) {
        Bus myBus = new Bus("Volvo", 101, 50);
        Car myCar = new Car("Honda Civic", 102, "Petrol");
        Bike myBike = new Bike("Yamaha", 103, true);

        myBus.showBusDetails();
        myCar.showCarDetails();
        myBike.showBikeDetails();
    }
}


*/

