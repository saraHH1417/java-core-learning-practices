package Collections25.IteratingList;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class Ring <E> implements Iterable<E> {
    private E[] items;
    private int writePosition =0;
    private int numberOfElements =0;

    private class RingIterator implements Iterator<E> {

        private int readPosition= 0;
        @Override
        public boolean hasNext() {
            return readPosition < numberOfElements;
        }

        @Override
        public E next() {
            return get(readPosition++);
        }
    }
    @SuppressWarnings("unchecked")
    public Ring(int size) {
        items = (E[]) new Object[size];
    }

    public void add(E element) {
        items[writePosition++] = element;

        if (writePosition >= items.length) {
            writePosition = 0;
        }

        if(++numberOfElements > items.length) {
            numberOfElements = items.length;
        }
    }

    public E get(int index) {
        return items[index];
    }

    public int size() {
        return numberOfElements;
    }

    @NotNull
    @Override
    public Iterator<E> iterator() {
        return new RingIterator();
    }
}
