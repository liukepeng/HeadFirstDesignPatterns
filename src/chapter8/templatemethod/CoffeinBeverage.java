package chapter8.templatemethod;

public abstract class CoffeinBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void addCondiments();

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    protected abstract void brew();

    void boilWater() {
        System.out.println("Boiling water");
    }


}
