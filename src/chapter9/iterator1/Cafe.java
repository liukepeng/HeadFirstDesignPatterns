package chapter9.iterator1;

import java.util.ArrayList;

public class Cafe {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        //with no iterators
        System.out.println("\nMENU\n----\nBREAKFAST");
        ArrayList<String> breakfastItems = pancakeHouseMenu.getMenuItems();
        for (String menuItem : breakfastItems) {
            System.out.println(menuItem);
        }

        System.out.println("\nLUNCH");
        String[] luncherItems = dinerMenu.getMenuItems();

        for (int i = 0; i < luncherItems.length; i++) {
            String menuItem = luncherItems[i];
            System.out.println(menuItem);
        }


        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();


        System.out.println("\nMENU (with iterators)\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }

    private static void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            String menuItem = (String)iterator.next();
            System.out.println(menuItem);
        }
    }
}
