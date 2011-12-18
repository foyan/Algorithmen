package ch.hszt.hs_2011.aud.exercise_12;

/*                                                      */
/* Sudoku mit Backtracking   							*/
/* ===================================================  */

import java.applet.*;
import java.awt.*;

/**
 * L�st ein Sudoku mit Rekursion und Backtracking
 */
public class Task2Impl_Luethi extends Applet implements Runnable {

	private static final long serialVersionUID = 1L;

	/** The model */
	protected int model[][];

	/** The view */
	protected Button view[][];

	/** Erstellt das model und initialisiert mit den gegebenen Werten */
	protected void createModel() {
		model = new int[9][9];

		// Alle Werte der Zellen l�schen (alle auf 0 setzen)
		for (int row = 0; row < 9; row++)
			for (int col = 0; col < 9; col++)
				model[row][col] = 0;

		// Initiale Situation des Sudoku
		model[0][0] = 9;
		model[0][4] = 2;
		model[0][6] = 7;
		model[0][7] = 5;

		model[1][0] = 6;
		model[1][4] = 5;
		model[1][7] = 4;

		model[2][1] = 2;
		model[2][3] = 4;
		model[2][7] = 1;

		model[3][0] = 2;
		model[3][2] = 8;

		model[4][1] = 7;
		model[4][3] = 5;
		model[4][5] = 9;
		model[4][7] = 6;

		model[5][6] = 4;
		model[5][8] = 1;

		model[6][1] = 1;
		model[6][5] = 5;
		model[6][7] = 8;

		model[7][1] = 9;
		model[7][4] = 7;
		model[7][8] = 4;

		model[8][1] = 8;
		model[8][2] = 2;
		model[8][4] = 4;
		model[8][8] = 6;
	}

	/** Erstellt eine leere view */
	protected void createView() {
		setLayout(new GridLayout(9, 9));

		view = new Button[9][9];

		for (int row = 0; row < 9; row++)
			for (int col = 0; col < 9; col++) {
				view[row][col] = new Button();
				add(view[row][col]);
			}
	}

	/** Updates the view mit den aktuellsten Zahlen */
	protected void updateView() {
		for (int row = 0; row < 9; row++)
			for (int col = 0; col < 9; col++)
				if (model[row][col] != 0)
					view[row][col].setLabel(String.valueOf(model[row][col]));
				else
					view[row][col].setLabel("");
	}

	/** Wird aufgerufen, wenn der Browser das Applet ladet. */
	public void init() {
		createModel();
		createView();
		updateView();
	}

	/**
	 * Ueberpr�ft, ob die Zahl 'num' ein korrekter Wert ist f�r die Ziele 'row'.
	 */
	// TODO
	protected boolean checkRow(int row, int num) {
		for (int i = 0; i < 9; i++) {
			if (model[row][i] == num) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Ueberpr�ft, ob die Zahl 'num' ein korrekter Wert ist f�r die Column
	 * 'col'.
	 */
	// TODO
	protected boolean checkCol(int col, int num) {
		for (int i = 0; i < 9; i++) {
			if (model[i][col] == num) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Ueberpr�ft, ob die Zahl 'num' ein korrekter Wert ist f�r die SudokuBox
	 * (row, col).
	 */
	// TODO
	protected boolean checkBox(int row, int col, int num) {
		row = row / 3 * 3;
		col = col / 3 * 3;
		
		for (int r = row; r < row + 3; r++) {
			for (int c = col; c < col + 3; c++) {
				if (model[r][c] == num) {
					return false;
				}
			}
		}
		return true;
	}

	/** Wird vom Browser aufgerufen, wenn applet startet. */
	public void start() {
		(new Thread(this)).start();
	}

	/** Hier beginnt der aktive part... */
	public void run() {
		try {
			// Etwas Zeit, damit alle nachkommen...
			Thread.sleep(1000);

			// Wir starten mit dem L�sen in der oberen linken Ecke.
			solve(0, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private boolean solutionFound = false;

	/** Rekursive Methode zum findes eines korrekten Wertes. */
	// TODO
	public void solve(int row, int col) throws Exception {
		// Falls mehr als 9 Zeilen vorhanden: Solution found! Das ist unsere
		// Abbruchbedingung
				
		if (row >= 9) {
			solutionFound = true;
			return;
		}

		// Falls die Zelle nicht leer (leer --> = 0) ist, nimm die n�chste
		while (model[row][col] != 0) {
			if (col >= 8) {
				row++;
				col = 0;
			} else {
				col++;
			}
			if (row >= 9) {
				solutionFound = true;
				return;
			}
		}
		// Zelle, sonst..
		// Finde eine g�ltige Nummer und update die View
		for (int n = 1; n <= 9; n++) {
			if (checkRow(row, n) && checkCol(col, n) && checkBox(row, col, n)) {		
				model[row][col] = n;
				updateView();
				Thread.sleep(100);	
				next(row, col);
				if (solutionFound) {
					return;
				}
			}
		}
		
		model[row][col] = 0;
				

		// Vielleicht etwas warten, damit alle nachkommen...

		// Delegier die Arbeit f�r die n�chste Zelle an einen
		// rekursiven Aufruf.

		// Keine g�ltige Nummer gefunden? Aufr�umen (Wert = 0 setzten) und
		// zur�ck zum Caller.

	}

	/** Ruft f�r die n�chste Zelle die Methode solve auf */
	// TODO
	public void next(int row, int col) throws Exception {
		if (col >= 8) {
			row++;
			col = 0;
		} else {
			col++;
		}
		solve(row, col);
	}
	
}
