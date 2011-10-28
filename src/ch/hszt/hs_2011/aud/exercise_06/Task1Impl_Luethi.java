package ch.hszt.hs_2011.aud.exercise_06;

import java.util.Comparator;

public class Task1Impl_Luethi implements Task1 {

	private ListNode first;
	private Comparator<ListNode> comparator = new ListNodeDataComparator();
	
	@Override
	public ListNode newListNode(String data) throws NullPointerException {
		ListNode node = new Node();
		node.setData(data);
		return node;
	}

	@Override
	public void prepend(ListNode node) throws NullPointerException {
		if (node == null) {
			throw new NullPointerException("node is null.");
		}
		if (first != null) {
			node.setNext(first);
		}
		first = node;
	}
	
	private ListNode getLast() {
		if (first == null) {
			return null;
		}
		ListNode rover = first;
		while (rover.getNext() != null) {
			rover = rover.getNext();
		}
		return rover;
	}

	@Override
	public void append(ListNode node) throws NullPointerException {
		if (node == null) {
			throw new NullPointerException("node is null.");
		}
		ListNode last = getLast();
		if (last == null) {
			first = node;
		} else {
			last.setNext(node);
		}
	}

	@Override
	public void sortedInsert(ListNode node) throws NullPointerException {
		if (node == null) {
			throw new NullPointerException("node is null.");
		}
		if (first == null) {
			first = node;
		} else if (comparator.compare(first, node) > 0) {
			prepend(node);
		} else {
			ListNode rover = first;
			while (rover.getNext() != null && comparator.compare(rover.getNext(), node) < 0) {
				rover = rover.getNext();
			}
			node.setNext(rover.getNext());
			rover.setNext(node);
		}
	}
	
	@Override
	public ListNode firstNodeWith(String data) throws NullPointerException {
		if (data == null) {
			throw new NullPointerException("data is null.");
		}
		if (first == null) {
			return null;
		}
		ListNode rover = first;
		while (rover.getNext() != null) {
			if (rover.getData().equals(data)) {
				return rover;
			}
			rover = rover.getNext();
		}
		return null;
	}
	
	@Override
	public void deleteNodeWith(String data) throws NullPointerException {
		if (data == null) {
			throw new NullPointerException("data is null.");
		}
		if (first != null) {
			ListNode rover = first;
			ListNode prev = null;
			while (rover != null) {
				if (rover.getData().equals(data)) {
					if (prev != null) {
						prev.setNext(rover.getNext());
					} else if (rover.getNext() != null) {
						first = rover.getNext();
					} else {
						first = null;
					}
				}
				prev = rover;
				rover = rover.getNext();
			}
		}
	}

	@Override
	public void deleteAllNodes() {
		first = null;
	}

	@Override
	public String WriteNodesInReverseOrder() {
		return accumulateData(new ReverseStringAccumulator());
	}
			
	@Override
	public String toString() {
		return accumulateData(new NormalStringAccumulator());
	}
	
	private String accumulateData(StringAccumulator acc) {
		ListNode rover = first;
		while (rover != null) {
			acc.accumulate(rover.getData());
			if (rover.getNext() != null) {
				acc.accumulate(", ");
			}
			rover = rover.getNext();
		}
		return acc.getString() + ".";
	}

	private class Node implements ListNode {

		private String data;
		private ListNode next;
		
		@Override
		public ListNode getNext() {
			return next;
		}

		@Override
		public void setNext(ListNode next) {
			this.next = next;
		}

		@Override
		public String getData() {
			return data;
		}

		@Override
		public void setData(String data) throws NullPointerException {
			if (data == null) {
				throw new NullPointerException("data is Null.");
			}
			this.data = data;
		}
		
		@Override
		public String toString() {
			return data;
		}

	}
	
	private interface StringAccumulator {
	
		String getString();
		
		void accumulate(String s);
		
	}
	
	private class NormalStringAccumulator implements StringAccumulator {
		
		private String string = "";
		
		@Override
		public String getString() {
			return string;
		}
		
		@Override
		public void accumulate(String s) {
			string += s;
		}
		
	}
	
	private class ReverseStringAccumulator implements StringAccumulator {
		
		private String string = "";
		
		@Override
		public String getString() {
			return string;
		}
		
		@Override
		public void accumulate(String s) {
			string = s + string;
		}
		
	}

	private class ListNodeDataComparator implements Comparator<ListNode> {

		@Override
		public int compare(ListNode arg0, ListNode arg1) {
			return arg0.getData().compareTo(arg1.getData());
		}
		
	}

}
