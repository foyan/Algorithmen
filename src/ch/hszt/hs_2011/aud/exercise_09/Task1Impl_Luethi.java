package ch.hszt.hs_2011.aud.exercise_09;

import java.util.NoSuchElementException;

public class Task1Impl_Luethi implements Task1 {

	@Override
	public void searchBinary(int[] intArray, int anfang, int ende, int zahl)
			throws ArrayIndexOutOfBoundsException, NoSuchElementException {

		position = -1;
		steps = 0;
		
		internalSearchBinary(intArray, anfang, ende, zahl);
				
	}
	
	public void internalSearchBinary(int[] intArray, int anfang, int ende, int zahl) throws NoSuchElementException {
				
		if (anfang > ende) {
			throw new NoSuchElementException();
		}
		
		steps++;
		
		int midIndex = (anfang + ende) / 2;
		int mid = intArray[midIndex];
		if (mid == zahl) {
			position = midIndex;
		} else if (zahl < mid) {
			internalSearchBinary(intArray, anfang, midIndex-1, zahl);
		} else {
			internalSearchBinary(intArray, midIndex+1, ende, zahl);
		}
	}

	private int steps;
	private int position = -1;
	
	@Override
	public int getPosition() {
		return position;
	}

	@Override
	public int getSteps() {
		return steps;
	}

}
