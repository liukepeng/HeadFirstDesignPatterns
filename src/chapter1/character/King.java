package chapter1.character;

public class King extends Character {

    public King() {
        weaponBehavior = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        System.out.println("I'm King ,fight");
    }
}
