package chapter4.pizza2.NYPizzas;

import chapter4.pizza2.Pizza;
import chapter4.pizza2.PizzaFlavor;
import chapter4.pizza2.PizzaStore;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaFlavor flavor) {
        switch (flavor) {
            case CHEESE:
                return new NYStyleCheesePizza();
            case VEGGIE:
                return new NYStyleVeggiePizza();
            case CLAM:
                return new NYStyleClamPizza();
            case PEPPERONI:
                return new NYStylePepperoniPizza();
            default:
                return null;
        }
    }
}
