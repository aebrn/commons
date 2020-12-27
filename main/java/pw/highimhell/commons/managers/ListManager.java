package pw.highimhell.commons.managers;

import pw.highimhell.commons.interfaces.Manager;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author hell
 * 12/4/2020
 */
public class ListManager<T> implements Manager<T> {
    private final List<T> list = new CopyOnWriteArrayList<>();

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
