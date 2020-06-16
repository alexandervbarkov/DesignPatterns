package composite.menu;

import java.util.List;
import java.util.stream.Collector;

public class MenuItem implements Menu {
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
    public void printMenu() {
        System.out.println(name + " - " + description + (vegetarian ? ". Vegetarian" : ". Not vegetarian") + ". $" + price);
    }

    @Override
    public boolean isItem() {
        return true;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public List<Menu> getMenuList() {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> T performAction(MenuAction<T> menuListAction, MenuAction<T> menuItemAction, Collector<T, ?, T> collector) {
        return menuItemAction.perform(this);
    }
}
