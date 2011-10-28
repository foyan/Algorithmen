package ch.hszt.hs_2011.aud.exercise_03;

public class Task1Impl_Luethi implements Task1 {

	public final static int DEPTH = 7;
	public final static int COUNT = 11;
	
	@Override
	public void showForLoopComplexities() {
		StringBuffer sb = new StringBuffer();
		// header
		sb.append("\t");
		for (int d = 1; d <= DEPTH; d++) {
			sb.append("d=" + d + "\t");
		}
		sb.append("\n");
		// table
		for (int c = 1; c <= COUNT; c++) {
			sb.append("c=" + c + ":\t");
			for (int d = 1; d <= DEPTH; d++) {
				long start = System.currentTimeMillis();
				looperama(c, d);
				long stop = System.currentTimeMillis();
				long buffalo = stop - start;
				sb.append(buffalo + "\t");
			}
			System.out.println(sb.toString());
			sb = new StringBuffer();
		}
		
		System.out.println(sb.toString());
	}
	
	private static void looperama(int depth, int count) {
		for (int i = 0; i < count; i++) {
			if (depth > 1) {
				looperama(depth-1, count);
			} else {
				// do something to actually use all values
			}
		}
	}

}
