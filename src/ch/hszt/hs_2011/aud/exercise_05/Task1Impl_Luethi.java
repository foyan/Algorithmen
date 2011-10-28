package ch.hszt.hs_2011.aud.exercise_05;

public class Task1Impl_Luethi extends Task1 {

	public Task1Impl_Luethi(String string) throws NullPointerException {
		super(string);
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Task1Impl_Luethi)) {
			// eigentlich: return super.equals(object)
			// klappt aber nicht weil equals() der Basisklasse
			// fieserweise abstrakt ist.
			return false;
		}
		Task1Impl_Luethi that = (Task1Impl_Luethi)object;
		return that.getString().equalsIgnoreCase(getString());
	}

	@Override
	public int hashCode() {
		return getString().toUpperCase().hashCode();
	}

	@Override
	public String toString() {
		return getString();
	}
	
	/*
	 * �berlegung zu Symmetrie:
	 * 
	 * Wird hier eingehalten, indem equals() f�r
	 * Vergleichsobjekte, die nicht Instanz dieser
	 * Klasse sind, automatisch false zur�ckgibt.
	 * 
	 * Wenn equals() auch "richtige" Strings akzeptieren
	 * w�rde (wie es Task1Samples zwar suggeriert, die
	 * Aufgabe aber nicht vorschreibt), w�re die Symmetrie
	 * nat�rlich verletzt:
	 * 
	 * new Task1_Luethi("abcd").equals("abcd") != "abcd".equals(new Task1_Luethi("abcd"))
	 */

}
