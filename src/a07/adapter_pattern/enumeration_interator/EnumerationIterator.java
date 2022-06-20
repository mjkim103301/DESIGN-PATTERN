package a07.adapter_pattern.enumeration_interator;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator<Object> {
    private Enumeration<?> enumeration;

    public EnumerationIterator(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    //java 8 부터 Iterator 에 default 로 구현되어 있다.
//    @Override
//    public void remove() {
//        throw new UnsupportedOperationException();
//    }
}
