class Input7 {
    public static void main(String[] args) {
        return 0;
    }
}

class Vehicle {
    public int [] getParts () {
        int i;
        int [] parts;
        parts = new int[5];
        i = 0;
        while(i < 5) {
            parts[i] = i;
            i = i + 1;
        }
        return parts;
    }
}

class Motorcycle extends Vehicle {
    
}

class Car extends Vehicle {
    
}

class SUV extends Car {
    public int [] getParts () {
        int i;
        int [] parts;
        parts = new int [5];
        i = 0;
        while(i < 5) {
            parts[i] = i;
            i = i + 1;
        }
        return parts;
    }
}

