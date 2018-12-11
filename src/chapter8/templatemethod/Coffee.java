package chapter8.templatemethod;

public class Coffee extends CoffeinBeverage{
    @Override
    protected void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    protected void brew() {
        System.out.println("Dripping Coffee through filter");
    }
}
