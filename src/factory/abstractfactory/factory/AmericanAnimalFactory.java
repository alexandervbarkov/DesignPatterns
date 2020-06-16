package factory.abstractfactory.factory;

import factory.abstractfactory.animal.AmericanCat;
import factory.abstractfactory.animal.AmericanDog;
import factory.abstractfactory.animal.Animal;

public class AmericanAnimalFactory implements AnimalFactory {
    @Override
    public Animal produceDog() {
        return new AmericanDog();
    }

    @Override
    public Animal produceCat() {
        return new AmericanCat();
    }
}
