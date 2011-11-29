package ch.hszt.hs_2011.aud.exercise_09;

import java.util.NoSuchElementException;

public interface Task1 {
	/*
	 * Implementieren Sie eine binäre Suche für ein intArray.
	 * 
	 */
	
	/**
	 * @param intArray: Array, welches die Werte enthält
	 * @param anfang: Index Start
	 * @param ende: Index Ende
	 * @param zahl: gesuchter Wert
	 * @throws ArrayIndexOutOfBoundsException
	 * @throws NoSuchElementException
	 */
	public void searchBinary(int[] intArray, int anfang, int ende, int zahl) throws ArrayIndexOutOfBoundsException, NoSuchElementException;
	
	/**
	 * @return: den Index der Position des gesuchten Elementes
	 */
	public int getPosition();

	/**
	 * @return: Anzahl notwendiger Schritte, bis Gesuchtes gefunden wurde.
	 */
	public int getSteps();

}
