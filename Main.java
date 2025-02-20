public class Main {
    public static void main(String[] args) {
        // Create a new item
        Item item = new Item("Laptop");
        Item item2 = new Item("Mouse");
        Item item3 = new Item("Book");
        // Print item name
        System.out.println(item.getName());
        System.out.println(item2.toString());

        // Create a new inventory
        Inventory inventory = new Inventory();
        inventory.addItem(item);
        inventory.addItem(item2);
        inventory.addItem(item3);
        
        // Display all items in the inventory
        inventory.displayItems();

       // remove item
       inventory.removeItem(item2);
       inventory.removeItem(item2);

       // check if item exists
         System.out.println(inventory.hasItem(item2));

        // Display all items in the inventory after removing an item
        inventory.displayItems();

        // Get the total number of items
        System.out.println("Total number of items: " + inventory.getItemCount());

    }
}
