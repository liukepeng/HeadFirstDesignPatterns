package chapter12.combining.decorator;

public class Goose {
    public void honk() {System.out.println("Honk");}

    @Override
    public String toString() {
        return "Goose";
    }
}
