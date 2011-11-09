package ch.hszt.hs_2011.aud.exercise_07;

public class Task1Impl_Luethi extends Task1 {

	private static final int MAX_SIZE = 1024 * 1024;
	
	private String[] stack = new String[MAX_SIZE];
	
	private int first = -1;
		
	@Override
	public void push(String data) throws NullPointerException {
		stack[++first] = data;
	}

	@Override
	public String pop() throws NullPointerException {
		return stack[first--];
	}

	@Override
	public boolean isEmpty() {
		return first == -1;
	}

	@Override
	public boolean isFull() {
		return first == MAX_SIZE - 1;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= first; i++) {
			sb.append(stack[i] + ", ");
		}
		return sb.toString();
	}

}
