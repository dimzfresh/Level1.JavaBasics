public class LoopsAndLanguageConstructs {
    public static void main(String[] args) {
        logNumbers(15);
    }

    public static void logNumbers(int number) {
        var minNumber = 0;
        if (number <= minNumber) {
            System.out.println("Input number can't be lower than min: " + minNumber);
            return;
        }

        var current = minNumber;
        while (current <= number) {
            if (current == minNumber) {
                System.out.print("0 ");
            } else if (current % 3 == 0 && current % 5 == 0) {
                System.out.print("fizzbuzz ");
            } else if (current % 3 == 0) {
                System.out.print("fizz ");
            } else if (current % 5 == 0) {
                System.out.print("buzz ");
            } else {
                System.out.print(current + " ");
            }

            current += 1;
        }
    }
}
