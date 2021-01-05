package io.aebrn.commons.managers;

import io.aebrn.commons.interfaces.Manager;

import java.util.HashSet;
import java.util.Set;

/**
 * @author aebrn
 * 12/4/2020
 */
public class SetManager<T> implements Manager<T> {
    private final Set<T> hashSet = new HashSet<>();

    @Override
    public void register(T element) {
        hashSet.add(element);
    }

    @Override
    public void unregister(T element) {
        hashSet.remove(element);
    }

    public Set<T> getSet() {
        return hashSet;
    }

    @Override
    public void clear() {
        hashSet.clear();
    }

    @Override
    public int size() {
        return hashSet.size();
    }
}
