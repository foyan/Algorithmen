package ch.hszt.hs_2011.aud.exercise_08;

public final class BonusTaskSamples {

	private static int pointsA;
	private static int pointsB;

	public static void main(String[] args) {
		System.out.println("Bonusaufgabe");
		System.out.println("--------------------");
		System.out.println();

		BonusTask A = new BonusTaskImpl_Luethi();
		BonusTask B = new BonusTaskImpl_Luethi();

		boolean AHasCooperated;
		boolean BHasCooperated;
		boolean ACooperates;


		// ------------ first deal -----------------
		AHasCooperated = A.deal();
		BHasCooperated = B.deal();
		setPoints(AHasCooperated, BHasCooperated);
		printIt();
		
		// ------------ 2. deal -----------------
		ACooperates = A.deal(BHasCooperated);
		BHasCooperated = B.deal(AHasCooperated);
		AHasCooperated = ACooperates;
		setPoints(AHasCooperated, BHasCooperated);
		printIt();
		
		// ------------ n-ter deal -----------------
		int anzDeals = 10;
		for (int i = 0; i<anzDeals; i++){
			ACooperates = A.deal(BHasCooperated);
			BHasCooperated = B.deal(AHasCooperated);
			AHasCooperated = ACooperates;
			setPoints(AHasCooperated, BHasCooperated);
			printIt();
		}
	}

	private static void setPoints(boolean resultA, boolean resultB) {
		if (resultA && resultB) {
			pointsA += 3;
			pointsB += 3;
		}
		if (!resultA && !resultB) {
			pointsA += 1;
			pointsB += 1;
		}
		if (resultA && !resultB) {
			pointsA += 0;
			pointsB += 5;
		}
		if (!resultA && resultB) {
			pointsA += 5;
			pointsB += 0;
		}

	}

	private static void printIt(){
		System.out.println("Punkte A: " +pointsA);
		System.out.println("Punkte B: " +pointsB);
		System.out.println();
	}
}
