package Taxes;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.regex.Pattern;

public final class TaxesCalculator {

    public enum TaxesType {
        TAX_10(0.1),
        TAX_20(0.2),
        TAX_30(0.3);

        public final Double value;

        private TaxesType(double value) {
            this.value = value;
        }
    }

    private static final String PATTERN = "^(0\\.\\d*[1-9]\\d*)|([1-9]\\d*(\\.\\d+)?)$";
    private static final Double MAX_NUMBER = 10_000.0;

    public static void main(String[] args) {
        System.out.println("\nCalculation started");
        System.out.println("-------------------");

        var prices = new String[]{"10.2", "0", "-33.9", "777.9", "36.2", "100000000.0", "372.9", "100"};
        process(prices);

        System.out.println("Calculation finished");
        System.out.println("-------------------");
    }

    private static void process(String[] prices) {
        if (prices.length == 0) {
            System.out.println("Nothing to calculate!");
            return;
        }
        var numbers = Arrays.stream(prices)
                .filter(p -> Pattern.matches(PATTERN, p))
                .map(Double::valueOf)
                .toArray(Double[]::new);

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        for (Double number : numbers) {
            try {
                var tax = calculateIfPossible(number);
                System.out.println("Tax for " + number + ": " + df.format(tax));
            } catch (TaxesException exception) {
                System.out.println("Calculation failed: " + exception.getMessage());
            }
        }
    }

    private static Double calculateIfPossible(Double number) throws TaxesException {
        if (number > 0 && number <= 100) {
            return calculate(number, TaxesType.TAX_10);
        }

        if (number > 100 && number <= 1000) {
            return calculate(number, TaxesType.TAX_20);
        }

        if (number > 1000 && number <= MAX_NUMBER) {
            return calculate(number, TaxesType.TAX_30);
        }

        if (number > MAX_NUMBER) {
            throw new TaxesException("Can't process numbers greater than 1000. Current: " + number);
        }

        return 0.0;
    }

    private static Double calculate(Double number, TaxesType type) {
        return number * type.value;
    }
}

final class TaxesException extends Exception {

    private TaxesException() {}

    TaxesException(String message) {
            super(message);
        }

}