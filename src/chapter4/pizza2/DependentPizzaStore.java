package chapter4.pizza2;
import chapter4.pizza2.NYPizzas.NYStyleCheesePizza;
import chapter4.pizza2.NYPizzas.NYStyleClamPizza;
import chapter4.pizza2.NYPizzas.NYStylePepperoniPizza;
import chapter4.pizza2.NYPizzas.NYStyleVeggiePizza;
import chapter4.pizza2.chicagoPizzas.ChicagoStyleCheesePizza;
import chapter4.pizza2.chicagoPizzas.ChicagoStyleClamPizza;
import chapter4.pizza2.chicagoPizzas.ChicagoStylePepperoniPizza;
import chapter4.pizza2.chicagoPizzas.ChicagoStyleVeggiePizza;

public class DependentPizzaStore {
 
	public Pizza createPizza(String style, String type) {
		Pizza pizza = null;
		if (style.equals("NY")) {
			if (type.equals("cheese")) {
				pizza = new NYStyleCheesePizza();
			} else if (type.equals("veggie")) {
				pizza = new NYStyleVeggiePizza();
			} else if (type.equals("clam")) {
				pizza = new NYStyleClamPizza();
			} else if (type.equals("pepperoni")) {
				pizza = new NYStylePepperoniPizza();
			}
		} else if (style.equals("Chicago")) {
			if (type.equals("cheese")) {
				pizza = new ChicagoStyleCheesePizza();
			} else if (type.equals("veggie")) {
				pizza = new ChicagoStyleVeggiePizza();
			} else if (type.equals("clam")) {
				pizza = new ChicagoStyleClamPizza();
			} else if (type.equals("pepperoni")) {
				pizza = new ChicagoStylePepperoniPizza();
			}
		} else {
			System.out.println("Error: invalid type of pizza");
			return null;
		}
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
