class Shape {
    String color;
}

class Triangle extends Shape {
    public void printColor() {
        System.out.println(this.color);
    }
}

public class Inheritance {
    public static void main(String args[]) {

        Triangle t1 = new Triangle();
        t1.color = "red";

        t1.printColor();
    }

}