package ch.hszt.hs_2011.aud.exercise_02;

public class Task3Impl_Luethi implements Task3 {

	@Override
	public char[][] createDiamond(char[][] array) throws NullPointerException,
			IllegalArgumentException {
		
		int length = array.length; // 0.4
		int summit = length / 2; // 3.5 + 0.4
						
		// * 5
		for (int i = 0; i <= summit; i++) { // 0.7 + 0.6 + 0.4 
			int x1 = summit + i; // 0.6 + 0.4
			int x2 = summit - i; // 0.6 + 0.4
			int y2 = length - i - 1; // 0.6 + 0.6 + 0.4
			array[x1][i] = '*'; // 1.8 + 0.4
			array[x2][i] = '*'; // 1.8 + 0.4
			array[summit][i] = '*'; // 1.8 + 0.4
			array[summit][y2] = '*'; // 1.8 + 0.4
			array[x1][y2] = '*'; // 1.8 + 0.4
			array[x2][y2] = '*'; // 1.8 + 0.4
		}
		
		return array;
	}

}
