interface Animal {
    void walk();
}

interface Herbivores {
    int eyes = 2;
}

class Horse implements Animal, Herbivores {
    public void walk() {
        System.out.println("Walking on 4 leg");
    }
}

public class Abstraction {
    public static void main(String args[]) {

    }
}