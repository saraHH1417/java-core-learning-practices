package Streams30.Collectors13To;

import java.util.TreeMap;

public class IncrementMap extends TreeMap<String, Integer> {

    public void putOrAdd(String key, Integer value) {
        Integer count = get(key);

        if (count == null) {
            put(key, value);
        } else {
            put(key, ++count);
        }
    }
}
