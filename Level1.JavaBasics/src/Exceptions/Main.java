package Exceptions;

public class Main {

    public static void main(String[] args) {

        process(new AtmTransaction("myAccount", 500));
        process(new AtmTransaction("yourAccount", 500));
        process(new AtmTransaction("myAccount", 55_000));
        process(new AtmTransaction("myAccount", 11_000));

    }

    public static void process(AtmTransaction transaction) {
        System.out.println("\nTransaction started");
        System.out.println("-------------------");

        try {
            var amount = AtmMachine.withdraw(transaction);
            System.out.println("Transaction completed. Now your balance is: " + amount);
        } catch (AccessDeniedException exception) {
            System.out.println("Transaction failed: " + exception.getMessage());
        } catch (AmountException exception) {
            System.out.println("Transaction failed: " + exception.getMessage());
        }

        System.out.println("Transaction finished");
        System.out.println("-------------------");
    }
}
