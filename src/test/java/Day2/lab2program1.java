package Day2;



class Account {
    long accNum;
    double balance;
    Person accHolder;

    Account(long accNum, double balance, Person accHolder) {
        this.accNum = accNum;
        this.balance = balance;
        this.accHolder = accHolder;
    }

    void deposit(double depositAmount) {
        balance = balance + depositAmount;
    }

    void withdraw(double withdrawAmount) {
        if (withdrawAmount < 0) {
            System.out.println("Please enter a correct amount");
        } else if (withdrawAmount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - withdrawAmount;
            System.out.println("Successfully withdrawn ₹" + withdrawAmount);
        }
    }

    double getBalance1() {
        System.out.println("Balance is: ₹" + balance);
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

    public Person getAccHolder() {
        return accHolder;
    }

    public void setAccHolder(Person accHolder) {
        this.accHolder = accHolder;
    }

    void display() {
        System.out.println("Account Number: " + accNum);
        System.out.println("Account Holder: " + accHolder.getName() + " Age: " + accHolder.getAge());
        System.out.println("Balance: ₹" + balance);
    }
}


class Person {
    String name;
    float age;

    Person(String name, float age) {
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
}

public class lab2program1 {
    public static void main(String[] args) {
        Person smith = new Person("Smith", 24);
        Account smithAccount = new Account(366220002221326L, 2000, smith);

        Person kathy = new Person("Kathy", 30);
        Account kathyAccount = new Account(100000002221327L, 3000, kathy);

        smithAccount.deposit(2000);
        kathyAccount.withdraw(2000);

        System.out.println("Updated Account Details");
        smithAccount.display();
        kathyAccount.display();
    }
}