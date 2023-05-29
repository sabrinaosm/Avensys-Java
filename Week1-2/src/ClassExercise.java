class Student {
    String name;
    int age;
    float marks;

    void play() {
        System.out.println("Student is playing!");
    }

    void read() {
        System.out.println("Student is reading!");
    }

    void eat() {
        System.out.println("Student is eating!");
    }
}

class Bird {
    String name;
    String colour;
    float wingLength;

    void eat() {
        System.out.println("The bird is eating!");
    }
    void fly() {
        System.out.println("The bird is flying!");
    }
    void chirp() {
        System.out.println("The bird is chirping!");
    }
}

public class ClassExercise {
    public static void main(String[] args) {
        Bird ostrich = new Bird();
        Bird parrot = new Bird();
        Bird pigeon = new Bird();

        Student jane = new Student();
        Student joe = new Student();
        Student jenna = new Student();
    }
}
