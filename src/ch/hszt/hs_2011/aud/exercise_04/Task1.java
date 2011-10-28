package ch.hszt.hs_2011.aud.exercise_04;

public interface Task1 {

    public enum StorageOrder {ROW_MAJOR_ORDER, COL_MAJOR_ORDER}

    /**
     * Converts a one-dimensional matrix array into a two-dimensional matrix.
     *
     * The one-dimensional matrix array can have row-major storage order or
     * column-major storage order. The resulting two-dimensional matrix must
     * have the rows denoted by the first index and the columns denoted by the
     * second index.
     *
     * @param matrixArray the array representing the whole matrix either in
     * row-major storage order or in column-major storage order.
     * @param rowCount the number of rows of the represented matrix.
     * @param colCount the number of columns of the represented matrix.
     * @param storageOrder denotes whether the given matrix array is stored in
     * row-major order or in column-major order.
     *
     * @return a two-dimensional matrix with rows denoted by the first index
     * and columns denoted by the second index.
     *
     * @throws NullPointerException if matrixArray is null.
     * @throws IllegalArgumentException if the given matrix array does not
     * contain exactly rowCount * colCount elements.
     */
    public int[][] convert2DMatrix(int[] matrixArray,
                                   int rowCount,
                                   int colCount,
                                   StorageOrder storageOrder)
            throws NullPointerException, IllegalArgumentException;
}
