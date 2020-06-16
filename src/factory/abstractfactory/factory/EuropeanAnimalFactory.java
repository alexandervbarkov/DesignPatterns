package factory.abstractfactory.factory;


import factory.abstractfactory.animal.*;

public class EuropeanAnimalFactory implements AnimalFactory {
    @Override
    public Animal produceDog() {
        return new EurpeanDog();
    }

    @Override
    public Animal produceCat() {
        return new EuropeanCat();
    }
}
