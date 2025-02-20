import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items;

    // Constructor
    public Inventory() {
        items = new ArrayList<>();
    }

    // Method to add an item to the inventory
    public void addItem(Item item) {
        items.add(item);
    }

    // Method to remove an item from the inventory
    public void removeItem(Item item) {
        if (items.contains(item)){
            items.remove(item);
        }
        else{
            System.out.println("Item not found in inventory");
        }

    }

    // Method to check if an item exists in the inventory
    public boolean hasItem(Item item) {
        if (items.contains(item)){
            return true;
        }
        else{
            return false;
        }
        
    }

    // Method to display all items in the inventory
    public void displayItems() {
        System.out.println("Items in inventory: ");
        System.out.println(items.toString());
    }

    // Method to get the total number of items
    public int getItemCount() {
        return items.size();
    }
}
