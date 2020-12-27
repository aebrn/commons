package pw.highimhell.commons.interfaces;

/**
 * @author hell
 * 12/3/2020
 */
public interface Manager<T> {
    void register(T element);
    void unregister(T element);
    void clear();
    int size();
}
