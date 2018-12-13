package chapter9.iterator5;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    ArrayList<Menu> menus;

    public Waitress(ArrayList<Menu> menus) {this.menus = menus; }

    public void printMenu() {
        Iterator<?> iterator = menus.iterator();
        while (iterator.hasNext()) {
            Menu menu = (Menu) iterator.next();
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator<?> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
