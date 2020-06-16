package strategy.character;

public class Witch extends Character {
    @Override
    public void fight() {
        System.out.println("Witch is fighting " + (weapon == null ? "without a weapon" : ("with " + weapon.attack())));
    }
}
