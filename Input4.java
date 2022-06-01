class Input4 {
    public static void main(String[] args) {
        return 0;
    }
}

class Vehicle {
    String brand;
    String color;
    public String getBrand() {
        return brand;
    }
    public String getColor() {
        return color;
    }
}
class Motorcycle extends Vehicle {
    public int calculateSpeed(int displacement, int time, boolean noMovement) {
        int speed;
        if (noMovement) {
            speed = 0;
        } else {
            speed = displacement / time;
        }
        return speed;
    }
}
class Car extends Vehicle {
    public int calculateSpeed(int displacement, int time, boolean noMovement) {
        int speed;
        if (noMovement) {
            speed = 0;
        } else {
            speed = displacement / time;
        }
        return speed;
    }
}
class Bus extends Vehicle {
    public int calculateSpeed(int displacement, int time, boolean noMovement, int acceleration) {
        int speed;
        int acceleration;
        acceleration = 0;
        if (noMovement) {
            System.out.println("Vehicle did not move");
            speed = 0;
        } else {
            speed = displacement / time;
        }
        return speed;
    }
}