package factory.abstractfactory;

import factory.abstractfactory.animal.Animal;
import factory.abstractfactory.factory.AmericanAnimalFactory;
import factory.abstractfactory.factory.EuropeanAnimalFactory;
import factory.abstractfactory.store.AnimalStore;

public class Application {
    public static void main(String ... args) {
        AnimalStore eurpeanAnimalStore = new AnimalStore(new EuropeanAnimalFactory());
        Animal europeanDog = eurpeanAnimalStore.buyAnimal("dog");
        System.out.println(europeanDog.getName());
        AnimalStore americanAnimalStore = new AnimalStore(new AmericanAnimalFactory());
        Animal americanCat = americanAnimalStore.buyAnimal("cat");
        System.out.println(americanCat.getName());
    }
}