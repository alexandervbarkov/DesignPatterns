package decorator;

import decorator.salable.Caramel;
import decorator.salable.Coffee;
import decorator.salable.Milk;
import decorator.salable.Salable;

import static decorator.salable.Size.*;

public class Application {
    public static void main(String... args) {
        Salable drink1 = new Coffee().addAddOn(new Milk()).addAddOn(new Caramel()).addAddOn(new Caramel()).addAddOn(Small);
        System.out.println("name: " + drink1.getDescription());
        System.out.println("cost: " + drink1.getCost());
    }
}
