class InsufficientFundsException extends Exception {

    InsufficientFundsException(String message) {
        super(message);
    }
}

class ATM {

    double balance = 5000;

    void withdraw(double amount)
            throws InsufficientFundsException {

        if (amount > balance) {
            throw new InsufficientFundsException(
                "Insufficient Balance!"
            );
        }

        balance -= amount;

        System.out.println("Withdrawal Successful: Rs." + amount);
        System.out.println("Remaining Balance: Rs." + balance);
    }
}

public class ATMSimulator {

    public static void main(String[] args) {

        ATM atm = new ATM();

        try {
            atm.withdraw(2000);
            atm.withdraw(5000);

        } catch (InsufficientFundsException e) {
            System.out.println("ATM Error: " + e.getMessage());

        } finally {
            System.out.println("ATM Transaction Completed");
        }

        try {
            int result = 100 / 0;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error: " + e.getMessage());
        }
    }
}