package composite.waitress;

import composite.menu.Menu;

import java.math.BigDecimal;
import java.util.stream.Collector;

public class Waitress {
    private Menu menu;

    public Waitress(Menu menu) {
        this.menu = menu;
    }

    public void showMenu() {
        menu.printMenu();
    }

    public void showVegetarianMenuItems() {
        System.out.println("Vegetarian menu items: ");
        menu.performAction(
                menuList -> null,
                menuItem -> {
                    if (menuItem.isVegetarian()) {
                        System.out.println(menuItem.getName());
                    }
                    return null;
                },
                null);
    }

    public void showVegetarianMenuItemCount() {
        System.out.println("Vegetarian item count: " +
                menu.performAction(
                        menuList -> null,
                        menuItem -> menuItem.isVegetarian() ? 1 : 0,
                        numberCollector));
    }

    public void showTotalPrice() {
        System.out.println("Total price: " +
                menu.performAction(
                        menuList -> null,
                        Menu::getPrice,
                        numberCollector));
    }

    private static Collector<Number, Number[], Number> numberCollector = Collector.of(
            () -> {
                Number[] array = new Number[1];
                array[0] = new BigDecimal("0");
                return array;
            },
            (result, number) -> result[0] = new BigDecimal(result[0].toString()).add(new BigDecimal(number.toString())),
            (result1, result2) -> {
                result1[0] = new BigDecimal(result1[0].toString()).add(new BigDecimal(result2[0].toString()));
                return result1;
            },
            result -> result[0]
    );
}