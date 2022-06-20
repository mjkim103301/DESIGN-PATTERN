package a07.adapter_pattern.enumeration_interator;

import java.util.*;

public class IteratorEnumeration implements Enumeration<Object> {
    private Iterator<?> iterator;

    public IteratorEnumeration(Iterator<?> iterator) {
        this.iterator = iterator;
    }

    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    public Object nextElement() {
        return iterator.next();
    }
}
