package chapter3.shape;

public class ShapeDecorator implements Shape {

    protected Shape shapeDecorator;

    public ShapeDecorator(Shape shapeDecorator) {
        this.shapeDecorator = shapeDecorator;
    }

    @Override
    public void draw() {
        shapeDecorator.draw();
    }
}
