package RegularExpressions;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegularExpressions {
    public static void main(String[] args) {
        // 1.
        findAllLetters("Letters 'e' count");

        // 2.
        validatePhone("+7 999 123 45 67");

        // 3.
        removeLettersAndWhiteSpaces("Yo! Hi there!");
    }

    public static void findAllLetters(String string) {
        String regex = "[^e]*e";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        int count = 0;
        while (matcher.find()) {
            count++;
        }

        System.out.println("Letters count: " + count);
    }

    public static void validatePhone(String number) {
        String regex = "^\\+(?:[0-9] ?){6,14}[0-9]$";
        Pattern pattern = Pattern.compile(regex);
        boolean isValid = pattern.matcher(number).matches();
        if (isValid) {
            System.out.println("Valid phone number");
        } else {
            System.out.println("Incorrect phone number");
        }
    }

    public static void removeLettersAndWhiteSpaces(String string) {
        String result = string
                .replaceAll("\\s", "")
                .replaceAll("[^a-zA-Z0-9]", "");

        System.out.println("Result: " + result);
    }
}
