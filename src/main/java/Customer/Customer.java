package Customer;

public class Customer {
    private int moneyAvailable;

    public Customer(int moneyAvailable) {
        this.moneyAvailable = moneyAvailable;
    }


    public int getBalance() {
        return moneyAvailable;
    }
}
