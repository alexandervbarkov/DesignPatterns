package strategy.character;

public class Knight extends Character {
    @Override
    public void fight() {
        System.out.println("Knight is fighting " + (weapon == null ? "without a weapon" : ("with " + weapon.attack())));
    }
}
