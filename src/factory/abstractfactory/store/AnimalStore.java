package factory.abstractfactory.store;

import factory.abstractfactory.animal.Animal;
import factory.abstractfactory.factory.AnimalFactory;

public class AnimalStore {
    private AnimalFactory animalFactory;

    public AnimalStore(AnimalFactory animalFactory) {
        this.animalFactory = animalFactory;
    }

    public Animal buyAnimal(String type) {
        switch(type.toLowerCase()) {
            case "dog":
                return animalFactory.produceDog();
            case "cat":
                return animalFactory.produceCat();
        }
        return null;
    }
}
