package composite.menu;

import java.util.List;
import java.util.stream.Collector;

public interface Menu {
    void printMenu();
    boolean isItem();
    String getName();
    String getDescription();
    boolean isVegetarian();
    float getPrice();
    List<Menu> getMenuList();
    <T> T performAction(MenuAction<T> menuListAction, MenuAction<T> menuItemAction, Collector<T, ?, T> collector);
}
