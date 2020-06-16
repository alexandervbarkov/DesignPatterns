package strategy.character;

import strategy.weapon.Weapon;

public abstract class Character {
    protected Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public abstract void fight();
}
