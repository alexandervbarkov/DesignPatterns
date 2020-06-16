package iterator.menu;

import iterator.menuitem.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SeafoodRestaurantMenu implements Menu {
    private static List<MenuItem> menuItemList = new ArrayList<>();

    static {
        menuItemList.add(new MenuItem("Salmon", "Grilled salmon", 15, false));
        menuItemList.add(new MenuItem("Crab", "Boiled crab", 10, false));
    }

    @Override
    public Iterator<MenuItem> iterator() {
        return menuItemList.iterator();
    }
}
