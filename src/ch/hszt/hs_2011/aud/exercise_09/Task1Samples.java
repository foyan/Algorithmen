package ch.hszt.hs_2011.aud.exercise_09;

import static java.lang.System.out;

import java.util.NoSuchElementException;

public final class Task1Samples {

	public static void main(String[] args) {
		System.out.println("Uebung 9 - Aufgabe 1");
		System.out.println("--------------------");
		System.out.println();
		out.printf( "|%10s|%10s|%10s|%10s|%10s| \n" , "gesuchter","Index","korrekter","Anzahl", "korrekte");
		out.printf( "|%10s|%10s|%10s|%10s|%10s| \n" , "Wert","","Index", "Steps", "Anz.Steps");
		System.out.println("-----------------------------------------------------------------------");
		
		int gesuchteZahl = 5;
        int[] testArr = 	{ 5, 7, 67, 88, 90, 102, 145, 234, 645, 1032 };
        int[] stepArray = 	{ 3, 2,  3,  4,  1,   3,   4,   2,   3,    4 };
        Task1 task1 = new Task1Impl_Luethi();

        try{
	        for (int i = 0; i < testArr.length; i++){
	            gesuchteZahl = testArr[i];
	            task1.searchBinary(testArr, 0, testArr.length - 1, gesuchteZahl);
	            printer(gesuchteZahl, task1.getPosition(), i, task1.getSteps(), stepArray[i]);  	
	        }
        }
        catch(NoSuchElementException ex){
        	ex.printStackTrace();
        }
        catch(ArrayIndexOutOfBoundsException ex){
        	ex.printStackTrace();
        }
	}
	
	private static void printer(int gesuchteZahl, int position, int korrPosition, int step, int korrStep){	
		out.printf( "|%10d|%10d|%10d|%10d|%10d| \n" , gesuchteZahl, position, korrPosition, step, korrStep );
	}
}
