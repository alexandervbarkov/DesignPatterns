package strategy;

import strategy.character.Character;
import strategy.character.Knight;
import strategy.character.Witch;
import strategy.weapon.Axe;
import strategy.weapon.Sword;

public class Application {
    public static void main(String... args) {
        Character character = new Knight();
        character.fight();
        character.setWeapon(new Sword());
        character.fight();
        Witch witch = new Witch();
        witch.setWeapon(new Axe());
        witch.fight();
        witch.setWeapon(null);
        witch.fight();
    }
}
