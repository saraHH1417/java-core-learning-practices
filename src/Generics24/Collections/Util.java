package Generics24.Collections;

import Generics24.Hierarchy.Mammal;

public class Util {
    public static void copy(Array<? extends Mammal> source, Array<? super Mammal> dest) {
        for (int i= 0; i < source.size(); i++) {
            Mammal m = source.get(i);
            dest.add(m);
        }
    }

}
