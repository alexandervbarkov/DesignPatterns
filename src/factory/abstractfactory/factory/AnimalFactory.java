package factory.abstractfactory.factory;

import factory.abstractfactory.animal.Animal;

public interface AnimalFactory {
    Animal produceDog();
    Animal produceCat();
}
