package a07.adapter_pattern.enumeration_interator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class IterenumTestDrive {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList(Arrays.asList("hello", "java", "world", "hi", "i'm", "minji"));
        Vector<String> vector=new Vector<>(list);

        System.out.println("============= iterator enumeration ==========");
        Iterator<?> iterator = new EnumerationIterator(vector.elements());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\n============= enumeration iterator ==========");
        Enumeration<?> enumeration = new IteratorEnumeration(list.iterator());
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
