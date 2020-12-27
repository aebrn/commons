package pw.highimhell.commons.numeral;

/**
 * @author hell
 * 12/5/2020
 */
public final class Numbers<T extends Number> {
    // shitty method but it works :/
    public T clamp(T number, T minimum, T maximum) {
        if (number instanceof Float) {
            if (number.floatValue() > maximum.floatValue()) {
                number = maximum;
            } else if (number.floatValue() < minimum.floatValue()) {
                number = minimum;
            }
        } else if (number instanceof Double) {
            if (number.doubleValue() > maximum.doubleValue()) {
                number = maximum;
            } else if (number.doubleValue() < minimum.doubleValue()) {
                number = minimum;
            }
        } else if (number instanceof Integer) {
            if (number.intValue() > maximum.intValue()) {
                number = maximum;
            } else if (number.intValue() < minimum.intValue()) {
                number = minimum;
            }
        } else if (number instanceof Long) {
            if (number.longValue() > maximum.longValue()) {
                number = maximum;
            } else if (number.longValue() < minimum.longValue()) {
                number = minimum;
            }
        }
        return number;
    }
}
