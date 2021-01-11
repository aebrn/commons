package io.aebrn.commons.timing;

import java.util.concurrent.TimeUnit;

/**
 * @author aebrn
 * 12/13/2020
 */
public final class Timer {
    private final TimeUnit timeUnit;

    private long previous;

    protected Timer(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
        reset();
    }

    public boolean hasElapsed(long nanoseconds) {
        return getCurrentTime() - this.previous >= convertToUnit(nanoseconds);
    }

    private long convertToUnit(long nanoseconds) {//TODO test this thoroughly
        return switch (timeUnit) {
            case NANOSECONDS -> TimeUnit.NANOSECONDS.convert(nanoseconds, TimeUnit.NANOSECONDS);
            case MICROSECONDS -> TimeUnit.MICROSECONDS.convert(nanoseconds, TimeUnit.NANOSECONDS);
            case MILLISECONDS -> TimeUnit.MILLISECONDS.convert(nanoseconds, TimeUnit.NANOSECONDS);
            case SECONDS -> TimeUnit.SECONDS.convert(nanoseconds, TimeUnit.NANOSECONDS);
            case MINUTES -> TimeUnit.MINUTES.convert(nanoseconds, TimeUnit.NANOSECONDS);
            case HOURS -> TimeUnit.HOURS.convert(nanoseconds, TimeUnit.NANOSECONDS);
            case DAYS -> TimeUnit.DAYS.convert(nanoseconds, TimeUnit.NANOSECONDS);
        };
    }

    public void reset() {
        this.previous = getCurrentTime();
    }

    private long getCurrentTime() {
        return System.nanoTime();
    }
}
