package Exceptions;

public class AtmMachine {

    private static String accountID = "myAccount";
    private static int maxWithdrawAmount = 10_000;
    private static int balanceAmount = 17_000;

    public static int withdraw(AtmTransaction transaction) throws AmountException {

        if (!transaction.account.equals(accountID)) {
            throw new AccessDeniedException("Provided account doesn't match the target one");
        }

        if (transaction.withdraw > balanceAmount) {
            throw new AmountException("Not enough balance to withdraw " + transaction.withdraw);
        }

        if (transaction.withdraw > maxWithdrawAmount) {
            throw new AmountException("Your withdraw amount " + transaction.withdraw + " exceeds max withdraw amount for one time " + maxWithdrawAmount);
        }

        balanceAmount = balanceAmount - transaction.withdraw;

        return balanceAmount;

    }
}
