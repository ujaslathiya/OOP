class Shape {
    public void area() {
        System.out.println("Display Area");
    }
}

class Triangel extends Shape {
    public void area(int l, int h) {
        System.out.println("Area of Triangel is : " + (1 / 2 * l * h));
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println("Area of Circle is : " + ((3.14) * r * r));
    }
}

public class Inheritance {
    public static void main(String args[]) {

    }
}