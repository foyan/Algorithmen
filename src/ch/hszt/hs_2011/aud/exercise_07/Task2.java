package ch.hszt.hs_2011.aud.exercise_07;

public abstract class Task2 {

	/**
	 * Implementieren Sie einen Binary-Search-Tree. Falls der neue Node < als
	 * der vorhandene, gehen Sie nach links, sonst nach rechts.
	 * */

	/* Das oberste Element im Binary-Search-Tree. */
	public Node root;

	/* Konstruktor */
	public Task2() {
	}

	/**
	 * @param value
	 *            , UID (Int) Ihres Schuhpaares. Nach dieser Nummer sortieren
	 *            Sie die Schuhpaare.
	 * @return neuer Node mit gesetztem Wert
	 */
	public abstract Node newNode(int value);

	/**
	 * @param node
	 *            , Schuhpaar mit der UID, das Sie einfügen möchten.
	 * @throws NullPointerException
	 *             , falls node null.
	 */
	public abstract void insert(Node node) throws NullPointerException;

	/**
	 * @param value
	 *            , UID des Schuhpaars, den Sie finden wollen.
	 * @return Schuhpaar (Node).
	 * @throws NullPointerException
	 *             , falls value null.
	 */
	public abstract Node firstNodeWith(int value);

	/**
	 * Folgende Methode müssen sie nicht implementieren, können Sie aber. :)
	 * 
	 * @param value
	 *            , UID des Schuhpaars, das Sie finden wollen.
	 */
	public void deleteNodeWith(int value) {
		throw new UnsupportedOperationException(
				"This method is not supported. Implement it!");
	}

	/**
	 * löscht alle Schuhpaare. Tipp: Java hat einen GC...
	 */
	public abstract void deleteAllNodes();

	/*
	 * Da die toString Methode hier etwas komplizierter ist, hier eine Variante,
	 * die Sie benutzen können, aber nicht müssen. Falls Sie einen anderen
	 * Ansatz bevorzugen, überschreiben Sie diese Methode einfach in Ihrer
	 * Klasse.
	 */

	public String toString() {
		return getOrderedString(root);
	}

	private String getOrderedString(Node tree) {
		StringBuffer sb = new StringBuffer();

		if (tree != null) {
			sb.append(getOrderedString(tree.getLeftNode()));
			sb.append(tree.getData());
			sb.append(" - ");
			sb.append(getOrderedString(tree.getRightNode()));
		}

		return sb.toString();
	}

	/**
	 * Folgende innere Klasse steht für ein Schuhpaar und entspricht einem Node
	 * des binary search trees.
	 */
	public abstract class Node {

		/**
		 * the constructor
		 */
		public Node() {
		}

		/**
		 * @return den linken Node
		 */
		public abstract Node getLeftNode();

		/**
		 * @param den
		 *            rechten Node
		 */
		public abstract Node getRightNode();

		/**
		 * @param left
		 *            , der linke Node, den Sie auf der linken Seite setzen
		 *            wollen.
		 */
		public abstract void setLeftNode(Node left);

		/**
		 * @param right
		 *            , der rechte Node, den Sie auf der rechten Seite setzen
		 *            wollen.
		 */
		public abstract void setRightNode(Node right);

		/**
		 * @return die UID des aktuellen Nodes.
		 */
		public abstract int getData();

		/**
		 * @param value
		 *            , UID des aktuellen Nodes.
		 * @throws NullPointerException
		 *             , falls value null.
		 */
		public abstract void setData(int value) throws NullPointerException;

	}
}
