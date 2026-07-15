
import java.util.HashMap;
import java.util.Map;


class Product {
    String name;
    int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}


class VendingMachine {

    private Map<Integer, Product> products = new HashMap<>();
    private int balance = 0;

    public VendingMachine() {
        products.put(1, new Product("Coke", 40));
        products.put(2, new Product("Pepsi", 35));
        products.put(3, new Product("Chips", 20));
    }


    public void insertMoney(int amount) {
        balance += amount;
        System.out.println("Balance: " + balance);
    }


    public void displayProducts() {
        for (int key : products.keySet()) {
            Product p = products.get(key);
            System.out.println(key + ". " + p.name + " - Rs." + p.price);
        }
    }


    public void selectProduct(int choice) {
        if (!products.containsKey(choice)) {
            System.out.println("Invalid selection");
            return;
        }

        Product p = products.get(choice);

        if (balance >= p.price) {
            balance -= p.price;
            System.out.println("Dispensed: " + p.name);
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}


public class VendingMachineApp {
    public static void main(String[] args) {

        VendingMachine vm = new VendingMachine();

        vm.displayProducts();
        vm.insertMoney(50);
        vm.selectProduct(1);
    }
}
