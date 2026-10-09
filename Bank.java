import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customers;
    private static int totalBanksCreated = 0;

    public Bank() {
        this.customers = new ArrayList<>();
        totalBanksCreated++;
    }

    public void addCustomer(String f, String l) {
        customers.add(new Customer(f, l));
    }

    public int getNumOfCustomers() {
        return customers.size();
    }

    public Customer getCustomer(int index) {
        if (index >= 0 && index < customers.size()) {
            return customers.get(index);
        }
        return null;
    }

    public static int getTotalBanksCreated() {
        return totalBanksCreated;
    }
}