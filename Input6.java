class Input6 {
    public static void main(String[] args) {
        return 0;
    }
}

class Vehicle {
}

class Motorcycle extends Vehicle {
    int [] getParts () {
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

class Car extends Vehicle {
    int [] getParts () {
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
