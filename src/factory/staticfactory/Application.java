package factory.staticfactory;

import factory.staticfactory.animal.Animal;
import factory.staticfactory.factory.AnimalFactory;

public class Application {
    public static void main(String ... args) {
        Animal cat = AnimalFactory.getAnimal("cat");
        System.out.println(cat.getName());
        Animal dog = AnimalFactory.getAnimal("dog");
        System.out.println(dog.getName());
    }
}
