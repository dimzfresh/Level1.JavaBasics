package Strings;

import java.util.stream.IntStream;
import java.util.regex.Pattern;

public final class TextHelper {

    public String process(String inputText, int year, String name, String[] oldCities, String newCity) {
        StringBuilder result = new StringBuilder(inputText);

        var ellipsisIndex1 = result.indexOf("…");
        result = result.replace(ellipsisIndex1, ellipsisIndex1 + 1, String.valueOf(year));

        var ellipsisIndex2 = result.lastIndexOf("…");
        result = result.replace(ellipsisIndex2, ellipsisIndex2 + 2, name);

        var colonIndex = result.indexOf(":");
        var cities = String.join(", ", oldCities);
        result.replace(colonIndex + 2, colonIndex + 2, cities);

        var quotesIndex = result.indexOf("“”");
        result.insert(quotesIndex + 1, " " + newCity + " ");

       return  result.toString();
    }

    public boolean[] duplicates(String[] samples) {
        var regex = "(.).*\\1";
        var pattern = Pattern.compile(regex);

        var result = new boolean[samples.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = (boolean) pattern.matcher(samples[i]).matches();
        }
        //IntStream.range(0, samples.length)
                //.forEach(i -> result[i] = (boolean) pattern.matcher(samples[i]).matches());

        return result;
    }
}
