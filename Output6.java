class Input6 {
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

This is not valid line

class Car extends Vehicle {
    
}
