package ch.hszt.hs_2011.aud.exercise_07;

public abstract class Task1 {

	/**
	 * Implementieren Sie eine Klasse gemäss Interface Task1. Benutzen Sie keine
	 * Listen oder andere bereits in den Libraries vorhandene Datenstrukturen
	 * sondern den hier vordefinierten Stack. Die Methode toString() soll eine
	 * lesbare Liste der noch vorhandenen Gegenstände auflisten.
	 */

	/**
	 * Benutzen Sie diesen Stack in Ihrer Klasse.
	 */
	public final int SIZE = 15;
	public String[] STACK = new String[SIZE];

	/**
	 * @param data
	 *            Gegenstand, welcher dem Stack hinzugefügt wird.
	 * @throws NullPointerException
	 *             falls data null
	 */
	public abstract void push(String data) throws NullPointerException;

	/**
	 * @return Gegenstand als String
	 * @throws NullPointerException. if stack is empty
	 */
	public abstract String pop() throws NullPointerException;

	/**
	 * @return true, falls Liste leer.
	 */
	public abstract boolean isEmpty();

	/**
	 * @return true, falls Stack voll. Frage: Z.B. auch bei einer Doubly Linked
	 *         List sinnvoll?
	 */
	public abstract boolean isFull();

	/**
	 * @return Lesbare Liste der übriggebliebenen Gegenstände.
	 */
	public abstract String toString();

}
