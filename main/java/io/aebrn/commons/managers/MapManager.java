package io.aebrn.commons.managers;

import java.util.HashMap;
import java.util.Map;

/**
 * @author aebrn
 * 12/4/2020
 */
public class MapManager<K, V> {
    private final Map<K, V> hashMap = new HashMap<>();

    public void register(K key, V value) {
        hashMap.put(key, value);
    }

    public void unregister(K key, V value) {
        hashMap.remove(key, value);
    }

    public void unregister(K key) {
        hashMap.remove(key);
    }

    public Map<K, V> getMap() {
        return hashMap;
    }
}
