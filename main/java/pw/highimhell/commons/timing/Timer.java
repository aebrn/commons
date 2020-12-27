package pw.highimhell.commons.timing;

/**
 * @author hell
 * 12/13/2020
 */
public final class Timer {
    private long previousMS;

    protected Timer() {
        reset();
    }

    public boolean hasElapsed(long milliseconds) {
        return getCurrentMS() - this.previousMS >= milliseconds;
    }

    public void reset() {
        this.previousMS = getCurrentMS();
    }

    private long getCurrentMS() {
        return System.nanoTime() / 1000000L;
    }
}
