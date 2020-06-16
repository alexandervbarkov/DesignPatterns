package iterator.menu;

import iterator.menuitem.MenuItem;

import java.util.Iterator;

public class DinerMenu implements Menu {
    private static MenuItem[] menuItemArray = new MenuItem[2];

    static {
        menuItemArray[0] = new MenuItem("Pizza", "Cheese pizza", 5, true);
        menuItemArray[1] = new MenuItem("Burger", "Beef burger", 8, false);
    }

    @Override
    public Iterator<MenuItem> iterator() {
        return new DinerMenuIterator(menuItemArray);
    }

    private class DinerMenuIterator implements Iterator<MenuItem> {
        private MenuItem[] menuItemArray;
        private int index;

        DinerMenuIterator(MenuItem[] menuItemArray) {
            this.menuItemArray = menuItemArray;
        }

        @Override
        public boolean hasNext() {
            return index < menuItemArray.length;
        }

        @Override
        public MenuItem next() {
            return menuItemArray[index++];
        }
    }
}
