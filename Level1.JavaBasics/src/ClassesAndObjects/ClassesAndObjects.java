package ClassesAndObjects;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Docent docent = new Docent();
        docent.profession = Profession.DOCENT;
        sayHello(docent);

        Student student = new Student();
        student.profession = Profession.STUDENT;
        sayHello(student);
    }

    public static void sayHello(Person person) {
        person.sayHello();
    }
}