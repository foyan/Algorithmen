package ch.hszt.hs_2011.aud.exercise_07;

public final class Task1Samples {

	public static void main(String[] args) {
		System.out.println("Uebung 7 - Aufgabe 1");
		System.out.println("--------------------");
		System.out.println();

		Task1 stack = new Task1Impl_Luethi();

		/*
		 * Vor vielen, vielen Jahren... Sie f�llten en Stack mit folgenden
		 * Gegenst�nden
		 */
		
		stack.push("Gurken");
		stack.push("Ein Poulet");
		stack.push("Wecker von Tante Frida");
		stack.push("Tablet");
		stack.push("Flasche Bier");
		stack.push("Kinogutschein");
		stack.push("Halskette (aus Katzengold)");
		stack.push("Spielauto");
		stack.push("Handy");
		stack.push("Pyjama");
		stack.push("Laptop");
		stack.push("Portemonnaie");
		stack.push("Aktenkoffer");
		
		System.out
				.println("---------- Vor vielen, vielen Jahren... Ihre vollst�ndige Beute ----------");
		System.out.println(stack.toString());
		System.out.println();

		/* Nahlik war da. */
		System.out.println("----- Nahlik brauchte Laptop ----");
		while (!stack.pop().equals("Laptop"));
		stack.push("Portemonnaie");
		stack.push("Aktenkoffer");


		System.out.println(stack.toString());
		System.out.println();

		/* Nach Besuch des Kaders einer nicht genauer benannten Schweizer Bank */
		System.out.println("----- Ubs, pl�tzlich war (fast) alles weg ----");
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();

		System.out.println(stack.toString());
		System.out.println();

		/* Nach Besuch von Heitzmann */
		stack.pop();
		stack.push("Link auf neue Vorlesungsunterlagen (Moodle)");
		stack.push("ISBN vom Buch 'Algorithmen und Datenstrukturen'");

		System.out
				.println("-- Als letzter war Herr Heitzmann da. Selbstlos nahm er nicht nur, \nsondern gab auch. Stolz k�nnen Sie somit mit \nfolgender �briggebliebener Beute bei Ihren Freunden Eindruck schinden  ---");
		System.out.println();
		System.out.println(stack.toString());
		System.out.println();
	}
}
