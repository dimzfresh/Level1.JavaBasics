package ClassesAndObjects;

public class Docent extends Person {
    int workExperienceInYears;

    @Override
    public void sayHello() {
        System.out.println("Hi, students!");
    }

    public void examine() {
        System.out.println("Your mark is maximum!");
    }
}
