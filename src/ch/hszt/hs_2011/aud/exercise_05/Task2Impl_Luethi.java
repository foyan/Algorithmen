package ch.hszt.hs_2011.aud.exercise_05;

import java.util.Date;

public class Task2Impl_Luethi extends Task2 {

	/**
	 * Implementiert ein Buch.
	 * 
	 * Gleichheit zweier Bücher ist definiert als Gleichheit
	 * der ISBN-Nummern (weil die eindeutig ist).
	 * Die ISBN-Nummern werden beim Vergleich noch von allen
	 * nicht-alphanumerischen Zeichen befreit.
	 * 
	 * @param authors
	 * @param title
	 * @param isbn
	 * @param publisher
	 * @param dateOfPublication
	 * @param price
	 * @throws NullPointerException
	 */
	public Task2Impl_Luethi(Author[] authors, String title, String isbn,
			String publisher, Date dateOfPublication, double price)
			throws NullPointerException {
		super(authors, title, isbn, publisher, dateOfPublication, price);
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Task2Impl_Luethi)) {
			// dito Task1
			return false;
		}
		Task2Impl_Luethi that = (Task2Impl_Luethi) object;
		return stripNumbers(getIsbn()).equals(stripNumbers(that.getIsbn()));
	}
	
	private static String stripNumbers(String s) {
		String r = "";
		for (char ch : s.toCharArray()) {
			if (Character.isLetterOrDigit(ch)) {
				r += ch;
			}
		}
		return r;
	}
	
	@Override
	public int hashCode() {
		return stripNumbers(getIsbn()).hashCode();
	}

	@Override
	public String toString() {
		return getIsbn();
	}

	@Override
	public int compareTo(Task2 task4Book) {
		return stripNumbers(getIsbn()).compareTo(stripNumbers(task4Book.getIsbn()));
	}

}
