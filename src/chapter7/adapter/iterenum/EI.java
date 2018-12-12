package chapter7.adapter.iterenum;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EI {
    public static void main(String args[]) {
        Vector<String> vector = new Vector<>(Arrays.asList(args));
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Iterator<?> iterator1 = new EnumerationIterator(enumeration);
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        Enumeration<?> enumeration1 = new IteratorEnumeration(vector.iterator());
        while (enumeration1.hasMoreElements()) {
            System.out.println(enumeration1.nextElement());
        }

    }
}