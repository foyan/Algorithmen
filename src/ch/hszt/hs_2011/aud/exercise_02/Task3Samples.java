package ch.hszt.hs_2011.aud.exercise_02;

public final class Task3Samples {

    public static void main(String[] args) {
        System.out.println("Uebung 2 - Aufgabe 3");
        System.out.println("--------------------");
        System.out.println();

        Task3 task3 = new Task3Impl_Luethi();

        int n;
        char[][] result;

        n = 9;
        result = new char[n][n];
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                result[row][col] = ' ';
            }
        }
        result = task3.createDiamond(result);
        printSampleResult(n, result);

        n = 15;
        result = new char[n][n];
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                result[row][col] = ' ';
            }
        }
        result = task3.createDiamond(result);
        printSampleResult(n, result);
    }

    private static void printSampleResult(int n,
                                          char[][] result) {
        System.out.println("Eingabe: n = " + n);
        System.out.println("Ausgabe:");
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                System.out.print(result[row][col]);
            }
            System.out.println();
        }

        System.out.println();
    }
}
