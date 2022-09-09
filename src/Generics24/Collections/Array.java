package Generics24.Collections;

public class Array<E> {
    private E[] array;
    private int position = 0;

    @SuppressWarnings("unchecked")
    public Array(int size) {
       array = (E[]) new Object[size]; // first create an object with size we have, then cast it to E type
    }

    public void add(E e) {
        if (position >= array.length) {
           throw  new ArrayIndexOutOfBoundsException();
        }

        array[position++] = e; // be careful that first time the array[0] will be set to e then the position will increase
    }

    public void addAll(Array<? extends E> source) {
        for (int i= 0; i < source.size(); i++) {
            E item = source.get(i);
            add(item);
        }
    }

    public E get(int index) {
        return array[index];
    }

    public int size() {
        return position; // we use position instead of array.length, so that if last elements are null,
        // it doesn't count null members
    }

    public  String toString() {
        StringBuilder sb= new StringBuilder();
        for (var obj: array) {
            sb.append(obj.toString());
            sb.append(" ");
        }

        return  sb.toString();
    }



}
