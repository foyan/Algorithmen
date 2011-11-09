package ch.hszt.hs_2011.aud.exercise_07;

import java.util.Comparator;

public class Task2Impl_Luethi extends Task2 {
	
	//private Node root;
	
	private final Comparator<Integer> dataComparator = new Comparator<Integer>() {
		@Override
		public int compare(Integer arg0, Integer arg1) {
			return arg1 - arg0;
		}
	};
	
	private Comparator<Node> comparator = new Comparator<Node>() {
		@Override
		public int compare(Node arg0, Node arg1) {
			return dataComparator.compare(arg0.getData(), arg1.getData());
		}
	};

	@Override
	public Node newNode(int value) {
		Node shoe = new Shoe();
		shoe.setData(value);
		return shoe;
	}

	@Override
	public void insert(Node node) throws NullPointerException {
		if (root == null) {
			root = node;
		} else {
			Node rover = root;
			Node pred = null;
			
			while (rover != null) {
				pred = rover;
				if (comparator.compare(node, rover) > 0) {
					rover = rover.getLeftNode();
				} else {
					rover = rover.getRightNode();
				}
			}
			
			if (comparator.compare(node, pred) > 0) {
				pred.setLeftNode(node);
			} else {
				pred.setRightNode(node);
			}

		}
	}

	@Override
	public Node firstNodeWith(int value) {
		return firstNodeWith(value, root);
	}
	
	private Node firstNodeWith(int value, Node root) {
		if (root == null) {
			return null;
		}
		int comp = dataComparator.compare(root.getData(), value);
		if (comp == 0) {
			return root;
		} else if (comp > 0) {
			return firstNodeWith(value, root.getLeftNode());
		} else {
			return firstNodeWith(value, root.getRightNode());
		}
	}

	@Override
	public void deleteAllNodes() {
		root = null;
	}
	
	private class Shoe extends Node {
		
		private Node left;
		private Node right;
		private int data;

		@Override
		public Node getLeftNode() {
			return left;
		}

		@Override
		public Node getRightNode() {
			return right;
		}

		@Override
		public void setLeftNode(Node left) {
			this.left = left;
		}

		@Override
		public void setRightNode(Node right) {
			this.right = right;
		}

		@Override
		public int getData() {
			return data;
		}

		@Override
		public void setData(int value) throws NullPointerException {
			this.data = value;
		}
		
	}

}
