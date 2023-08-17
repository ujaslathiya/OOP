abstract class Animal {

    Animal() {
        System.out.println("Creating an Animal");
    }

    abstract void walk();

    public void eat() {
        System.out.println("Animal Eats");
    }
}

class Horse extends Animal {

    Horse() {
        System.out.println("Creating a Horse");
    }

    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {

    Chicken() {
        System.out.println("Creating a Chicken");
    }

    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class Abstraction_n {
    public static void main(String[] args) {

        // Horse h1 = new Horse();

        // h1.walk();
        // h1.eat();

        // Can't create an object of Abstract Class

        // Animal a1 = new Animal();
        // Animal.walk();

        // whenever we create sub-class constructor first of all it called base class
        // constructor

        Chicken c1 = new Chicken();

    }
}