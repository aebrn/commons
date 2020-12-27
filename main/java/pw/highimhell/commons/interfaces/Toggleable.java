package pw.highimhell.commons.interfaces;

/**
 * @author hell
 * 12/5/2020
 */
public interface Toggleable {
    boolean isEnabled();
    void toggle();
    void setEnabled(boolean flag);
}
