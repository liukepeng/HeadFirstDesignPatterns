package chapter1.ducks;

public class DuckCaller implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack Quack Quack ,like a real duck");
    }
}
