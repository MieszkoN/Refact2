class Input5 {
    public static void main(String[] args) {
        return 0;
    }
}
class Vehicle {

}
class Motorcycle extends Vehicle {
    public int calculatePrice(int standardPrice, int discount) {
        return standardPrice - discount;
    }
}
class Car extends Vehicle {
    public int calculatePrice(int discount, int standardPrice) {
        return standardPrice - discount;
    }
}