package ch.hszt.hs_2011.aud.exercise_05;

/**
 * An abstract class representing a case insensitive string. Two instances of
 * this class are considered equal if the strings are the same when compared
 * without case sensitivity.
 */
public abstract class Task1 {

    private String string;

    /*
     * Use this constructor in your implementing class by calling
     * super(string).
     */
    public Task1(String string)
            throws NullPointerException {

        /* Check and adopt parameter. */
        if (string == null) {
            throw new NullPointerException
                    ("Parameter \"string\" is null.");
        }
        this.string = string;
    }

    public abstract boolean equals(Object object);

    public abstract int hashCode();

    public abstract String toString();

    public String getString() {
        return string;
    }
}
