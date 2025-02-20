public class Item {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    // Get item name
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
