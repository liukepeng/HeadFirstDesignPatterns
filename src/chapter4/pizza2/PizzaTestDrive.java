package chapter4.pizza2;

import chapter4.pizza2.NYPizzas.NYPizzaStore;
import chapter4.pizza2.chicagoPizzas.ChicagoPizzaStore;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		Pizza pizza = nyStore.orderPizza(PizzaFlavor.CHEESE);
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");

		pizza = chicagoStore.orderPizza(PizzaFlavor.CHEESE);
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = nyStore.orderPizza(PizzaFlavor.CLAM);
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");

		pizza = chicagoStore.orderPizza(PizzaFlavor.CLAM);
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = nyStore.orderPizza(PizzaFlavor.PEPPERONI);
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");

		pizza = chicagoStore.orderPizza(PizzaFlavor.PEPPERONI);
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = nyStore.orderPizza(PizzaFlavor.VEGGIE);
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");

		pizza = chicagoStore.orderPizza(PizzaFlavor.VEGGIE);
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
	}
}
