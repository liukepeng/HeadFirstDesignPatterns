package chapter3.starbuzz;

public abstract class CondimentDecorator extends Beverage{
    Beverage beverage;
    public abstract String getDescription();

    @Override
    public Size getSize() {
        return beverage.getSize();
    }
}
