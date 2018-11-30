package chapter1.character;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    public abstract void fight();

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void useWeapon(){
        weaponBehavior.useWeapon();
    }
}
