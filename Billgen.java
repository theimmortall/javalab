import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Abstract class representing a generic item
abstract class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Abstract method to calculate the cost of an item
    public abstract double calculateCost(int quantity);
}

// Concrete class representing a physical item
class PhysicalItem extends Item {
    public PhysicalItem(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateCost(int quantity) {
        return getPrice() * quantity;
    }
}

// Concrete class representing a digital item
class DigitalItem extends Item {
    private int downloadLimit;

    public DigitalItem(String name, double price, int downloadLimit) {
        super(name, price);
        this.downloadLimit = downloadLimit;
    }

    public int getDownloadLimit() {
        return downloadLimit;
    }

    @Override
    public double calculateCost(int quantity) {
        return getPrice() * quantity;
    }
}

// Class representing a bill
class Bill {
    private List<Item> items;

    public Bill() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (Item item : items) {
            totalCost += item.calculateCost(1); // Assuming quantity is 1 for simplicity
        }
        return totalCost;
    }

    public void generateBill() {
        System.out.println("Bill Details:");
        for (Item item : items) {
            System.out.println(item.getName() + ": $" + item.calculateCost(1));
        }
        System.out.println("Total Cost: $" + calculateTotalCost());
    }
}

// Main class to take user input and generate the bill
public class Billgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the physical item: ");
        String physicalItemName = scanner.nextLine();
        System.out.print("Enter the price of the physical item: ");
        double physicalItemPrice = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the name of the digital item: ");
        String digitalItemName = scanner.nextLine();
        System.out.print("Enter the price of the digital item: ");
        double digitalItemPrice = scanner.nextDouble();
        System.out.print("Enter the download limit for the digital item: ");
        int downloadLimit = scanner.nextInt();

        // Create items
        PhysicalItem physicalItem = new PhysicalItem(physicalItemName, physicalItemPrice);
        DigitalItem digitalItem = new DigitalItem(digitalItemName, digitalItemPrice, downloadLimit);

        // Create a bill and add items
        Bill bill = new Bill();
        bill.addItem(physicalItem);
        bill.addItem(digitalItem);

        // Display bill details
        bill.generateBill();

        scanner.close();
    }
}
