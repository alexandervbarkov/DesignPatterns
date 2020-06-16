package iterator.menuitem;

public class MenuItem {
    private final String name;
    private final String description;
    private final float price;
    private final boolean vegetarian;

    public MenuItem(String name, String description, float price, boolean vegetarian) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.vegetarian = vegetarian;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", vegetarian=" + vegetarian +
                '}';
    }
}
