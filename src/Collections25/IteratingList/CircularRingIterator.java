package Collections25.IteratingList;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class CircularRingIterator <E> implements Iterable<E> {
    private E[] items;
    private int writePosition =0;
    private int numberOfElements =0;

    private class RingCircularIterator implements Iterator<E> {

        private int readPosition= 0;
        private int itemsRead = 0;

        public RingCircularIterator() {
            if (numberOfElements == items.length) {
                readPosition = writePosition;
            }
        }

        @Override
        public boolean hasNext() {
            return  itemsRead < numberOfElements;
        }

        @Override
        public E next() {
            ++itemsRead;
            if (readPosition == items.length) {
                readPosition = 0;
            }
            return get(readPosition++);
        }
    }
    @SuppressWarnings("unchecked")
    public CircularRingIterator(int size) {
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
        return new RingCircularIterator();
    }
}
