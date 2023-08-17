class Student {

    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student() {
        System.out.println("Non-Parameterised Constructor");
    }

    Student(String name, int age) {
        System.out.println("Parameterised Constructor");
        this.name = name;
        this.age = age;
    }

    Student(Student s) {
        System.out.println("Copy Constructor");
        this.name = s.name;
        this.age = s.age;
    }
}

public class tut1 {
    public static void main(String[] args) {

        Student s1 = new Student("ujas", 18);

        Student s2 = new Student(s1);

        s2.printInfo();

    }
}