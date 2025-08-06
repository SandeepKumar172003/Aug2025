package Day2;
public class lab1 {
    public static void main(String[] args) {
        Person smith = new Person("Smith", 30);
        Person kathy = new Person("Kathy", 25);
        Account smithAccount = new Account(smith, 2000);
        Account kathyAccount = new Account(kathy, 3000);
        smithAccount.deposit(2000);
        kathyAccount.withdraw(2000);
        System.out.println("Smith Account: " + smithAccount);
        System.out.println("Kathy Account: " + kathyAccount);
    }
}

class Person {
    private String name;
    private float age;
    public Person(String name, float age) {
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
    @Override
    public String toString() {
        return "Person[name=" + name + ", age=" + age + "]";
    }
}

class Account {
    private static long nextAccNum = 1000001; // start from any number
    private long accNum;
    private double balance;
    private Person accHolder;
    private static final double MIN_BALANCE = 500.0;

    public Account(Person accHolder, double initialBalance) {
        this.accNum = nextAccNum++;
        this.accHolder = accHolder;
        this.balance = initialBalance;
    }
    public long getAccNum() {
        return accNum;
    }
    public double getBalance() {
        return balance;
    }
    public Person getAccHolder() {
        return accHolder;
    }
    public void setAccHolder(Person accHolder) {
        this.accHolder = accHolder;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= MIN_BALANCE) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal failed for account " + accNum + ": Insufficient balance or minimum balance violation.");
        }
    }
    @Override
    public String toString() {
        return "Account[accNum=" + accNum +
               ", balance=" + balance +
               ", accHolder=" + accHolder + "]";
    }
}
