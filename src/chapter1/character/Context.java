package chapter1.character;

public class Context {
    WeaponBehavior weaponBehavior;
    public Context(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void useWeapon() {
        weaponBehavior.useWeapon();
    }
}
