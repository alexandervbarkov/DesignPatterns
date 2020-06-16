package iterator.waitress;

import iterator.menu.Menu;
import iterator.menuitem.MenuItem;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Waitress {
    private Collection<Menu> menuList;

    public Waitress(Menu... menuArray) {
        menuList = Arrays.asList(menuArray);
    }

    public void showMenus() {
//        menuList.forEach(menu -> menu.forEach(System.out::println));
        menuList.forEach(menu -> {
            Iterator<MenuItem> iterator = menu.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        });
    }
}
