package ch.hszt.hs_2011.aud.exercise_03;

public final class Task1Samples {

    public static void main(String[] args) {
        System.out.println("Uebung 3 - Aufgabe 1");
        System.out.println("--------------------");
        System.out.println();

        Task1 task1 = new Task1Impl_Luethi();

        task1.showForLoopComplexities();
    }
}
