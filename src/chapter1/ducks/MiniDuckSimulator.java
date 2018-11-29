package chapter1.ducks;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("----");

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.performFly();

        System.out.println("----");

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performQuack();
        modelDuck.performFly();
        System.out.println("now I take a rocket so ----");
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
        System.out.println("And I have noise ----");
        modelDuck.setQuackBehavior(new QuackWithXiu());
        modelDuck.performQuack();

        System.out.println("----");
        Duck d = new Duck() {
            @Override
            public void display() {
                System.out.println("duckCaller");
            }
        };
        d.display();
        d.setQuackBehavior(new DuckCaller());
        d.performQuack();
    }
}
