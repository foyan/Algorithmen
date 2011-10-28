package ch.hszt.hs_2011.aud.exercise_04;

public final class Task1Samples {

    public static void main(String[] args) {
        System.out.println("Uebung 4 - Aufgabe 1");
        System.out.println("--------------------");
        System.out.println();

        Task1 task1 = new Task1Impl_Luethi();

        int[] rowMajorArray
                = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] colMajorArray
                = new int[] {1, 5, 9, 2, 6, 10, 3, 7, 11, 4, 8, 12};
        int[][] result;

        result = task1.convert2DMatrix(rowMajorArray,
                                       3,
                                       4,
                                       Task1.StorageOrder.ROW_MAJOR_ORDER);
        printSampleResult(rowMajorArray, result);

        result = task1.convert2DMatrix(colMajorArray,
                                       3,
                                       4,
                                       Task1.StorageOrder.COL_MAJOR_ORDER);
        printSampleResult(colMajorArray, result);
    }

    private static void printSampleResult(int[] array, int[][] result) {
        System.out.println("Eingabe:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        System.out.println("Ausgabe:");
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[0].length; col++) {
                System.out.print(result[row][col] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
