package Day2;


public class lab2 {
    static abstract class Account {
        int accNum;
        double balance;
        static int accCounter = 4001;

        Account(double balance) {
            this.accNum = accCounter++;
            this.balance = balance;
        }

        void deposit(double amount) {
            balance += amount;
        }

        abstract boolean withdraw(double amount);
    }

    static class SavingsAccount extends Account {
        SavingsAccount(double balance) {
            super(balance);
        }

        boolean withdraw(double amount) {
            if (balance - amount >= 500) {
                balance -= amount;
                return true;
            }
            return false;
        }
    }

    static class CurrentAccount extends Account {
        CurrentAccount(double balance) {
            super(balance);
        }

        boolean withdraw(double amount) {
            if (balance - amount >= -1000) {
                balance -= amount;
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(2000);
        CurrentAccount ca = new CurrentAccount(1000);

        sa.withdraw(1700);
        ca.withdraw(1800);

        System.out.println("Savings Account Balance: " + sa.balance);
        System.out.println("Current Account Balance: " + ca.balance);
    }
}
