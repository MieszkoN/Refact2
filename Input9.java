class Input9 {
    public static void main(String []args) {
        System.out.println("Hello world!");
    }
}

class Vehicle {
    public String runMethods() {
        Truck truck;
        Car car;
        SUV suv;
        truck = new Truck();
        car = new Car();
        suv = new SUV();
        System.out.println(truck.getSpeed());
        System.out.println(car.getSpeed());
        System.out.println(suv.getSpeed());
        return "Run methods!";
    }
}

class Car extends Vehicle {
    public int getSpeed() {
        int speed;
        speed = 50;
        return speed;
    }
}

class Truck extends Vehicle {
    public int getSpeed() {
        int speed;
        speed = 50;
        return speed;
    }
}

class SUV extends Car {
    public int getSpeed() {
        Car car;
        car = new Car();
        return car.getSpeed();
    }
}