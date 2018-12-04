package chapter4.pizza2;

public abstract class PizzaStore {


    protected abstract Pizza createPizza(PizzaFlavor flavor);

    public Pizza orderPizza(PizzaFlavor flavor) {
        Pizza pizza = createPizza(flavor);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
 }
