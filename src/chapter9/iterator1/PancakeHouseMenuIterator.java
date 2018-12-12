package chapter9.iterator1;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
    ArrayList<String> items;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<String> items) {this.items = items;}

    @Override
    public boolean hasNext() {
       if (position >= items.size()) {
           return false;
       } else {
           return true;
       }
    }

    @Override
    public Object next() {
        String menuItem = items.get(position);
        position = position + 1;
        return menuItem;
    }
}
