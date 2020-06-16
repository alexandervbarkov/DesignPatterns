package iterator;

import iterator.waitress.Waitress;
import iterator.menu.DinerMenu;
import iterator.menu.SeafoodRestaurantMenu;

public class Application {
    public static void main(String ... args) {
        new Waitress(new DinerMenu(), new SeafoodRestaurantMenu()).showMenus();
    }
}
