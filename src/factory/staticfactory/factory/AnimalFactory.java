package factory.staticfactory.factory;

import factory.staticfactory.animal.Animal;
import factory.staticfactory.animal.Cat;
import factory.staticfactory.animal.Dog;

public class AnimalFactory {
    public static Animal getAnimal(String type) {
        if(type == null)
            return null;
        switch (type.toLowerCase()) {
            case "dog":
                return new Dog();
            case "cat":
                return new Cat();
        }
        return null;
    }
}
