package ch.hszt.hs_2011.aud.exercise_05;

import java.util.*;

public final class Task2Samples {

    public static void main(String[] args) {
        System.out.println("Uebung 3 - Aufgabe 2");
        System.out.println("--------------------");
        System.out.println();

        Task2 task2Book1
                = new Task2Impl_Luethi
                (new Task2.Author[]
                 {new Task2.Author("Dieter", "Bohlen")},
                 "Nichts als die Wahrheit",
                 "3-453-86143-4",
                 "Heyne",
                 new Date(),
                 10.00);

        Task2 task2Book2
                = new Task2Impl_Luethi
                (new Task2.Author[]
                 {new Task2.Author("Nadja", "Abd El Farrag")},
                 "Ungelogen“ (k)eine Liebesgeschichte",
                 "3-7766-2339-X",
                 "Herbig",
                 new Date(),
                 0.52);

        Task2 task2Book3
                = new Task2Impl_Luethi
                (new Task2.Author[]
                 {new Task2.Author("Verona", "Pooth"),
                  new Task2.Author("Verona", "Feldbusch")},
                 "Der kleine Feldbusch",
                 "342666139X",
                 "Knaur",
                 new Date(),
                 0.19);

        printSample(task2Book1);
        printSample(task2Book2);
        printSample(task2Book3);
        System.out.println("");
        System.out.println("equals:");
        System.out.println("Book 1 equals Book 2? " + task2Book1.equals(task2Book2));
        System.out.println("Book 2 equals Book 1? " + task2Book2.equals(task2Book1));
        System.out.println("Book 3 equals Book 3? " + task2Book3.equals(task2Book3));
     
        System.out.println();
        System.out.println("compareTo");
    }

    private static void printSample(Task2 sample) {
        System.out.println(sample);
    }
}
