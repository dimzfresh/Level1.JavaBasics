import java.util.Scanner;

public final class JavaBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Расскажите о вашем друге.\nКак зовут вашего друга?");
        String name = scanner.nextLine();
        System.out.println("Сколько лет вашему другу?");
        int age = scanner.nextInt();
        System.out.println("Моему другу " + name + " сейчас " + age + " лет");
        scanner.close();
    }
}
