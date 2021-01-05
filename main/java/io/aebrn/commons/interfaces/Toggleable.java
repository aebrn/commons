package io.aebrn.commons.interfaces;

/**
 * @author aebrn
 * 12/5/2020
 */
public interface Toggleable {
    boolean isEnabled();
    void toggle();
    void setEnabled(boolean flag);
}
