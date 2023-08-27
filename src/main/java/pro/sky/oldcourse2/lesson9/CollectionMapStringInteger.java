package pro.sky.oldcourse2.lesson9;

import java.util.HashMap;
import java.util.Objects;

public class CollectionMapStringInteger {

    HashMap<String, Integer> hashMap = new HashMap<>();

    public CollectionMapStringInteger() {
    }

    public void addMap(String key, Integer value) {
        if (!hashMap.containsKey(key)) {
            hashMap.put(key, value);
        } else {
            if (hashMap.containsKey(key) && hashMap.containsValue(value)) {
                throw new IllegalArgumentException("Такой ключ уже есть и значения совпадают");
            } else {
                if (hashMap.containsKey(key) && !hashMap.containsValue(value)) {
                    hashMap.put(key, value);
                }
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CollectionMapStringInteger that = (CollectionMapStringInteger) o;
        return Objects.equals(hashMap, that.hashMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hashMap);
    }

    public HashMap<String, Integer> getHashMap() {
        return hashMap;
    }

    @Override
    public String toString() {
        return "hashMap " + hashMap;
    }
}