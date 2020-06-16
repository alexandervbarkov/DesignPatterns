package strategy.weapon;

public class Sword extends Weapon {
    @Override
    public String attack() {
        return getClass().getSimpleName();
    }
}
