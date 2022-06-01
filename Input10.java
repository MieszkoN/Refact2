class Input10 {
    public static void main(String[] args) {
        return 0;
    }
}
class Vehicle {
    public int calculatePrice(int discount, int standardPrice) {
        int finalPrice;
        finalPrice = standardPrice - discount;
        return standardPrice - discount;
    }
}
class Motorcycle extends Vehicle {
    public int calculatePrice(int discount, int standardPrice) {
        return standardPrice - discount;
    }
}
class Car extends Vehicle {
    public int calculatePrice(int discount, int standardPrice) {
        return standardPrice - discount;
    }
}