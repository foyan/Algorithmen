package ch.hszt.hs_2011.aud.exercise_02;

public interface Task3 {

    /**
     * Creates the shape of a diamond, consisting of '*' inside a given array.
     *
     * @param array a two-dimensional array with an equal number n of rows
     * and columns, with n >= 5 and n being odd. The array is initialized with
     * ' ' (space) values.
     * @return the resulting n x n char array containing the shape of the
     * diamond.
     * @throws NullPointerException if array is null.
     * @throws IllegalArgumentException if the dimensions of array are invalid.
     */
    public char[][] createDiamond(char[][] array)
            throws NullPointerException, IllegalArgumentException;
}
