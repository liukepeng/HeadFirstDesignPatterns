package chapter1.character;


public class CharacterDemo {
    public static void main(String[] args) {
        Character king = new King();
        king.fight();
        king.useWeapon();

        System.out.println("----");

        Context context = new Context(new SwordBehavior());
        context.useWeapon();
    }
}
