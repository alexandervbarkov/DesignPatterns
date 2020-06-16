package composite;

import composite.menu.MenuItem;
import composite.menu.MenuList;
import composite.waitress.Waitress;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;

public class Application {
    public static void main(String... args) {
        Waitress waitress = new Waitress(new MenuList("Highway Shack Menu",
                asList(
                        new MenuItem("Three course meal", "Bread, cabbage, and hot water with sugar", 20.20f, true),
                        new MenuList("Lunch menu", asList(
                                new MenuItem("Sandwich", "Sandwich with unknown meat", 10.99f, false),
                                new MenuItem("Hot dog", "Hot dog with unknown meat", 9.99f, false))),
                        new MenuList("Dinner menu", singletonList(
                                new MenuItem("Mystery meal", "Whatever I have in the fridge", 15, false)))))
        );
        waitress.showMenu();
        waitress.showVegetarianMenuItems();
        waitress.showVegetarianMenuItemCount();
        waitress.showTotalPrice();
    }
}
