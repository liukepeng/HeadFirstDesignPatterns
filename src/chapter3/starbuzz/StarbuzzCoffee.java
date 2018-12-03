package chapter3.starbuzz;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        System.out.println("one cup of Espresso");
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "$" + beverage.cost());

        System.out.println("DarkRoast with double Mocha and Whip");
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + "$" + beverage2.cost());

        System.out.println("HouseBlend with Soy, Mocha and Whip");
        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(Beverage.Size.VENTI);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + "$" + beverage3.cost());


    }
}
