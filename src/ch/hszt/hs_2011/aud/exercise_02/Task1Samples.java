package ch.hszt.hs_2011.aud.exercise_02;

public final class Task1Samples {

    public static void main(String[] args) {
        System.out.println("Uebung 2 - Aufgabe 1");
        System.out.println("--------------------");
        System.out.println();

        Task1 task1 = new Task1Impl_Luethi();

        int number1;
        int number2;
        int result;

        number1 = 2;
        number2 = 3;
        result = task1.add(number1, number2);
        printSampleResult(number1, number2, result);

        number1 = -5;
        number2 = 7;
        result = task1.add(number1, number2);
        printSampleResult(number1, number2, result);

        number1 = 11;
        number2 = -13;
        result = task1.add(number1, number2);
        printSampleResult(number1, number2, result);

        number1 = -17;
        number2 = -19;
        result = task1.add(number1, number2);
        printSampleResult(number1, number2, result);

        number1 = 0;
        number2 = 0;
        result = task1.add(number1, number2);
        printSampleResult(number1, number2, result);
    }

    private static void printSampleResult(int number1,
                                          int number2,
                                          int result) {
        System.out.println("Eingabe: ("
                           + number1 + ", "
                           + number2 + ")");
        System.out.println("Ausgabe: "
                           + result);
        System.out.println();
    }
}
