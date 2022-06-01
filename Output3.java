class Input3 {
    public static void main(String[] args) {
        return 0;
    }
}

class Vehicle {
	public boolean isMoving(boolean movement) {
        int a;
        a = 4;
        System.out.println(a);
        return movement;
    }


}
class Motorcycle extends Vehicle {
    
}
class Car extends Vehicle {
    public boolean isMoving(boolean movement) {
        return movement;
    }
}