package Strings;

import Strings.*;

public class StringsAPI {
    public static void main(String[] args) {
        // Task 1
        var year = 1703;
        var name = "Петром Первым";
        var oldCities = new String[]{"Санкт-Петербург", "Петроград", "Ленинград"};
        var newCity = "Питер";
        var inputText = "Санкт-Петербург был основан в … году … . За свою историю он носил имена: . Сейчас многие зовут его просто “”.";
        var textConverter = new TextHelper();
        var result = textConverter.process(inputText, year, name, oldCities, newCity);
        System.out.println("Результат: " + result);

        // Task 2
        var ipValidator = new IPAddressValidator();
        System.out.println(ipValidator.validate("172.013.1.2"));
        System.out.println(ipValidator.validate("5555.7777"));

        // Task 3
        var samples = new String[]{"dgbvawq", "m,kl;po", "cbcbcbc", "z_qwertyuiop_z"};
        var array = textConverter.duplicates(samples);
        var builder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (array[i]) builder.append("true "); else builder.append("false ");
        }
        System.out.println(builder.toString());
    }
}
