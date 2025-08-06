package Day2;


abstract class Account1 {
    long accNum;
    double balance;
    Person1 accHolder;

    Account1(long accNum, double balance, Person1 accHolder) {
        this.accNum = accNum;
        this.balance = balance;
        this.accHolder = accHolder;
    }

    void deposit(double depositAmount) {
        balance += depositAmount;
    }

    boolean withdraw(double withdrawAmount) {
        if (withdrawAmount < 0) {
            System.out.println("Please enter correct amount");
            return false;
        } else if (withdrawAmount > balance) {
            System.out.println("Insufficient balance");
            return false;
        } else {
            balance -= withdrawAmount;
            System.out.println("Successfully withdrawn");
            return true;
        }
    }

    double getBalance1() {
        System.out.println("Balance is: " + balance);
        return balance;
    }

    public long getAccNum() {
        return accNum;
    }

    public void setAccNum(long accNum) {
        this.accNum = accNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Person1 getAccHolder() {
        return accHolder;
    }

    public void setAccHolder(Person1 accHolder) {
        this.accHolder = accHolder;
    }

    void display1() {
        System.out.println("Account Number: " + getAccNum());
        System.out.println("Account Holder: " + getAccHolder().getName());
        System.out.println("Balance: " + getBalance());
    }
}

class Person1 {
    String name;
    float age;

    Person1(String name, float age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    void display2() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }
}

class SavingsAccount1 extends Account1 {
    final double minimumBalance = 500;

    SavingsAccount1(long accNum, double balance, Person1 accHolder) {
        super(accNum, balance, accHolder);
    }

    @Override
    boolean withdraw(double withdrawAmount) {
        if (balance - withdrawAmount < minimumBalance) {
            System.out.println("Withdrawal denied: Minimum balance required is " + minimumBalance);
            return false;
        } else {
            balance -= withdrawAmount;
            System.out.println("Withdrawal successful from Savings Account");
            return true;
        }
    }
}

class CurrentAccount1 extends Account1 {
    double overdraftLimit;

    CurrentAccount1(long accNum, double balance, Person1 accHolder, double overdraftLimit) {
        super(accNum, balance, accHolder);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    boolean withdraw(double withdrawAmount) {
        if (balance - withdrawAmount < -overdraftLimit) {
            System.out.println("Withdrawal denied: Overdraft limit exceeded");
            return false;
        } else {
            balance -= withdrawAmount;
            System.out.println("Withdrawal successful from Current Account");
            return true;
        }
    }
}

public class lab2Program2 {
    public static void main(String[] args) {
        Person1 smith = new Person1("Smith", 24);
        SavingsAccount1 smithAccount = new SavingsAccount1(366220002221326L, 2000, smith);

        Person1 kathy = new Person1("Kathy", 30);
        CurrentAccount1 kathyAccount = new CurrentAccount1(100000002221327L, 3000, kathy, 1000);

        smithAccount.deposit(2000);
        kathyAccount.withdraw(3800);

        System.out.println("Updated Account Details");
        smithAccount.display1();
        System.out.println();
        kathyAccount.display1();
    }
}
