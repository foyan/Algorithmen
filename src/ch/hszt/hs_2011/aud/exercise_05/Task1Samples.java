package ch.hszt.hs_2011.aud.exercise_05;

public final class Task1Samples {

    public static void main(String[] args) {
        System.out.println("Uebung 4 - Aufgabe 5");
        System.out.println("--------------------");
        System.out.println();

        Task1 caseInsensitiveString1
                = new Task1Impl_Luethi("ABCDE");

        Task1 caseInsensitiveString2
                = new Task1Impl_Luethi("abcde");

        String normalString1 = "ABCDE";

        String normalString2 = "abcde";

        printSampleResult(caseInsensitiveString1, caseInsensitiveString1,
                          caseInsensitiveString1.equals(caseInsensitiveString1));
        printSampleResult(caseInsensitiveString1, caseInsensitiveString2,
                          caseInsensitiveString1.equals(caseInsensitiveString2));
        printSampleResult(caseInsensitiveString1, normalString1,
                          caseInsensitiveString1.equals(normalString1));
        printSampleResult(caseInsensitiveString1, normalString2,
                          caseInsensitiveString1.equals(normalString2));
        printSampleResult(caseInsensitiveString2, caseInsensitiveString1,
                          caseInsensitiveString2.equals(caseInsensitiveString1));
        printSampleResult(caseInsensitiveString2, caseInsensitiveString2,
                          caseInsensitiveString2.equals(caseInsensitiveString2));
        printSampleResult(caseInsensitiveString2, normalString1,
                          caseInsensitiveString2.equals(normalString1));
        printSampleResult(caseInsensitiveString2, normalString2,
                          caseInsensitiveString2.equals(normalString2));
        printSampleResult(normalString1, caseInsensitiveString1,
                          normalString1.equals(caseInsensitiveString1));
        printSampleResult(normalString1, caseInsensitiveString2,
                          normalString1.equals(caseInsensitiveString2));
        printSampleResult(normalString1, normalString1,
                          normalString1.equals(normalString1));
        printSampleResult(normalString1, normalString2,
                          normalString1.equals(normalString2));
        printSampleResult(normalString2, caseInsensitiveString1,
                          normalString2.equals(caseInsensitiveString1));
        printSampleResult(normalString2, caseInsensitiveString2,
                          normalString2.equals(caseInsensitiveString2));
        printSampleResult(normalString2, normalString1,
                          normalString2.equals(normalString1));
        printSampleResult(normalString2, normalString2,
                          normalString2.equals(normalString2));
    }

    private static void printSampleResult(Object object1,
                                          Object object2,
                                          boolean equals) {
        System.out.println("Eingabe:");
        System.out.println(object1.getClass() + "\t" + object1);
        System.out.println(object2.getClass() + "\t" + object2);
        System.out.println("Ausgabe: equals = " + equals);
        System.out.println();
    }
}
