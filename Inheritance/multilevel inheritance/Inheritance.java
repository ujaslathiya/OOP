class Shape {
    public void area() {
        System.out.println("Area of Shape");
    }
}

class Triangel extends Shape {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

class equiliteralTraingel extends Triangel {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

public class Inheritance {
    public static void main(String[] args) {

    }
}