package ClassesAndObjects;

public class Student extends Person {
    public int course;
    public boolean graduated;

    @Override
    public void sayHello() {
        System.out.println("Hi, teacher!");
    }

    public void goChilling() {
        System.out.println("I'm going to party!");
    }
}
