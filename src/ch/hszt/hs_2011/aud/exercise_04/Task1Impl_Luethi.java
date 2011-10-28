package ch.hszt.hs_2011.aud.exercise_04;

public class Task1Impl_Luethi implements Task1 {

	@Override
	public int[][] convert2DMatrix(int[] matrixArray, int rowCount,
			int colCount, StorageOrder storageOrder)
			throws NullPointerException, IllegalArgumentException {

		if (matrixArray.length != rowCount * colCount) {
			throw new IllegalArgumentException("Given matrix array does not contain exactly rowCount * colCount elements.");
		}
		
		int[][] matrix = new int[rowCount][colCount];
				
		// Verwendung des Strategy-Patterns hier (weil Java keine m.W.
		// keine anonymen Methoden unterstützt).
		// Funktional löst sich das auf zu:
		// 		i = c * rowCount + r für StorageOrder.COL_MAJOR_ORDER
		//		i = r * colCount + c für StorageOrder.ROW_MAJOR_ORDER
		// im Sinne der Laufzeit-Optimierung wird der Entscheid
		// nicht innerhalb der Loops gefällt, was dann zu so einer
		// Konstruktion führt.
		// Die andere Variante wäre eine Verdoppelung der Loops,
		// dann ist nur ein Entscheid nötig. Dünkt mich aber cheapy zu sein.
		IndexStrategy is = getIndexStrategy(rowCount, colCount, storageOrder);
		
		for (int r = 0; r < rowCount; r++) {
			for (int c = 0; c < colCount; c++) {
				matrix[r][c] = matrixArray[is.get(r, c)];
			}
		}
		
		return matrix;
	}
		
	static IndexStrategy getIndexStrategy(final int rowCount, final int colCount, StorageOrder storageOrder) {
		if (storageOrder == StorageOrder.COL_MAJOR_ORDER) {
			return new IndexStrategy() {
				public int get(int r, int c) {
					return c * rowCount + r;
				}
			};
		} else {
			return new IndexStrategy() {
				public int get(int r, int c) {
					return r * colCount + c;
				}
			};			
		}
	}
	
	interface IndexStrategy {
		int get(int r, int c);
	}
	
}
