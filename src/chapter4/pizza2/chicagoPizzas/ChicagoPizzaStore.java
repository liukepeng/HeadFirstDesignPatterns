package chapter4.pizza2.chicagoPizzas;

import chapter4.pizza2.Pizza;
import chapter4.pizza2.PizzaFlavor;
import chapter4.pizza2.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaFlavor flavor) {
        switch (flavor) {
            case CHEESE:
                return new ChicagoStyleCheesePizza();
            case VEGGIE:
                return new ChicagoStyleVeggiePizza();
            case CLAM:
                return new ChicagoStyleClamPizza();
            case PEPPERONI:
                return new ChicagoStylePepperoniPizza();
            default:
                return null;
        }
    }
}
