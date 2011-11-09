package ch.hszt.hs_2011.aud.exercise_07;

public final class Task2Samples {

	public static void main(String[] args) {
		System.out.println("Uebung 7 - Aufgabe 2");
		System.out.println("--------------------");
		System.out.println();
		Task2 binaryTree = new Task2Impl_();

		int values[] = { 6, 5, 4, 3, 8, 6, 45, 3, 12, 34, 45, 654 };

		/* Füllt den Baum mit den obigen Werten ab */
		for (int i = 0; i < values.length; i++) {
			binaryTree.insert(binaryTree.newNode(values[i]));
		}
		
		System.out.println("---------- Schuhpaare sortiert ----------");
		System.out.println(binaryTree.toString());
		System.out.println();
	}
}
