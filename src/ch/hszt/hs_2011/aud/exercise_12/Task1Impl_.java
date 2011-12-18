package ch.hszt.hs_2011.aud.exercise_12;

public class Task1Impl_ {

	private int[][] distances = { 
			{ 0, 15, 22, 31, 1 }, 
			{ 15, 0, 12, 29, 1 },
			{ 22, 12, 0, 32, 2 }, 
			{ 31, 29, 32, 0, 1 }, 
			{ 1, 1, 2, 1, -3 } };

	int[] xOpt = new int[distances.length];

	int fxOpt = Integer.MAX_VALUE;

	public Task1Impl_() {
	}

	public static void main(String[] args) {
		Task1Impl_ tsp = new Task1Impl_();
		int[] x = new int[tsp.distances.length];
		tsp.findOptimalSolution(x, 0);

		for (int i = 0; i < tsp.xOpt.length; i++) {
			System.out.print(tsp.xOpt[i] + "\t");
		}
		System.out.println();
		System.out.println();
		System.out.println(tsp.fxOpt);
	}

	
	/** findet die optimale Lösung */
	//TODO: rekursive backtracking algorithm.
	public void findOptimalSolution(int[] x, int i) {
		
		for (int v = 0; v < x.length; v++) {
			/* if v (siehe Script) fits to partial solution x[1:i - 1] */
	
			/* add v to partial solution (Methode "contains" aufrufen)*/
	
			/* finish? */
	
			/* sumUpDistances... */
	
			/* if fx is better than fxOpt... */
	
			/* else, find a better Solution... */
	
			/* remove v from partial solution */
		}
	}

	
	/* v fits to partial solution x[1:i - 1] */
	//TODO
	private boolean contains(int[] x, int i, int v) {
		
		return false;
	}

	//TODO
	private int sumUpDistances(int[] x) {

		return 0;
	}
}
