package ch.hszt.hs_2011.aud.exercise_06;

public final class Task1Samples {

	public static void main(String[] args) {
		Task1 list = new Task1Impl_Luethi();

		/* Spirituosenliste 21:00 */
		list.prepend(list.newListNode("Grappa"));
		list.prepend(list.newListNode("Fernet Branca"));
		list.prepend(list.newListNode("Limoncello"));
		list.append(list.newListNode("Chartreuse"));
		list.append(list.newListNode("Tequila"));
		list.append(list.newListNode("Benedictine"));
		list.prepend(list.newListNode("Cointreau"));
		list.prepend(list.newListNode("Russian Standard"));
		list.prepend(list.newListNode("Cragganmore"));
		list.append(list.newListNode("Friesengeist"));
		list.append(list.newListNode("Weissflog"));
		list.append(list.newListNode("Absinthe"));
		System.out.println("---------- Spirituosenliste 21:00 ----------");
		System.out.println(list.toString());
		System.out.println();

		/* Spirituosenliste 01:30 */
		list.deleteNodeWith("Grappa");
		list.deleteNodeWith("Tequila");
		list.deleteNodeWith("Weissflog");
		list.deleteNodeWith("Russian Standard");
		list.deleteNodeWith("Absinthe");
		list.deleteNodeWith("Cragganmore");

		System.out.println("---------- Spirituosenliste 01:30 ----------");
		System.out.println("Leer ist: Grappe, Tequila, Weissflog, Russion Standard, Absinthe, Cragganmore");
		System.out.println("Somit bleibt �brig:\n");
		System.out.println(list.toString());
		System.out.println();

		/* Sortiertes Einfuegen */
		list.deleteAllNodes();
		System.out
				.println("Unterdessen ist alles leer.\nNeu hinzugef�gt wird in dieser Reihenfolge: \nTequila, Fernet Branca, Charteuse, Benedictine, Limoncello\n");
		list.sortedInsert(list.newListNode("Tequila"));
		list.sortedInsert(list.newListNode("Fernet Branca"));
		list.sortedInsert(list.newListNode("Chartreuse"));
		list.sortedInsert(list.newListNode("Benedictine"));
		list.sortedInsert(list.newListNode("Limoncello"));
		System.out.println("---------- Sortiert (nach Alphabet): ----------");
		System.out.println(list.toString());
		System.out.println();
		
		System.out.println("---------- Revese Order: ----------");
		System.out.println(list.WriteNodesInReverseOrder());
		System.out.println();
	}
}
