package composite.menu;

import java.util.List;
import java.util.stream.Collector;

public class MenuList implements Menu {
    private final String name;
    private final List<Menu> menuList;

    public MenuList(String name, List<Menu> menuList) {
        this.name = name;
        this.menuList = menuList;
    }

    @Override
    public void printMenu() {
        System.out.println(name);
        menuList.forEach((Menu::printMenu));
    }

    @Override
    public boolean isItem() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    @Override
    public float getPrice() {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Menu> getMenuList() {
        return menuList;
    }

    @Override
    public <T> T performAction(MenuAction<T> menuListAction, MenuAction<T> menuItemAction, Collector<T, ?, T> collector) {
        menuListAction.perform(this);
        if (collector != null) {
            return menuList.stream().map(menu -> menu.performAction(menuListAction, menuItemAction, collector)).collect(collector);
        }
        menuList.forEach(menu -> menu.performAction(menuListAction, menuItemAction, null));
        return null;
    }
}
