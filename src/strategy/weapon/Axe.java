package strategy.weapon;

public class Axe extends Weapon {
    @Override
    public String attack() {
        return getClass().getSimpleName();
    }
}
