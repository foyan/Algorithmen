package ch.hszt.hs_2011.aud.exercise_08;

public interface BonusTask {

    /**
     * Performs an exchange deal with an opponent for the first time.
     *
     * @return <code>true</code> if you cooperate, <code>false</code> otherwise.
     * @throws IllegalStateException if this method is called more than once.
     */
    public boolean deal()
            throws IllegalStateException;

    /**
     * Performs an exchange deal with an opponent for subsequent times.
     *
     * @param otherHasCooperated <code>true</code> if the opponent has
     * cooperated last time, <code>false</code> otherwise. It is your
     * responsibility to keep track of the history of whether your opponent
     * has cooperated or not.
     * @return <code>true</code> if you cooperate, <code>false</code> otherwise.
     * @throws IllegalStateException if this method is called prior to calling
     * the non-argument method first.
     */
    public boolean deal(boolean otherHasCooperated)
            throws IllegalStateException;
}
