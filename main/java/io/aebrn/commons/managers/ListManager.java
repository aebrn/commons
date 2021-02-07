package io.aebrn.commons.managers;

import io.aebrn.commons.interfaces.Manager;

import java.util.List;

/**
 * @author aebrn
 * 12/4/2020
 */
public class ListManager<T> implements Manager<T> {
    protected List<T> list;

    @Override
    public void register(T element) {
        list.add(element);
    }

    @Override
    public void unregister(T element) {
        list.remove(element);
    }

    public List<T> getList() {
        return list;
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public int size() {
        return list.size();
    }
}
