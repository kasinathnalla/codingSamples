package com.learning;

public class DeQueImpl {
	class Node {
		Integer val;
		Node next;
		Node prev;

		public Node(Integer val) {
			this.val = val;
		}

	}

	private Node first;
	private Node last;

	public void addLast(Integer e) {
		Node n = new Node(e);

		if (first == null && last == null) {
			this.first = n;
			this.last = n;

		} else {

			this.last.next = n;
			n.prev = this.last;
			this.last = n;
		}

	}

	public void addFirst(Integer e) {
		Node n = new Node(e);

		if (first == null && last == null) {
			this.first = n;
			this.last = n;

		} else {

			n.next = this.first;
			this.first.prev = n;
			this.first = n;
		}

	}

	public Integer removeFirst() {

		if (first == null) {
			return null;

		} else if (last == null) {
			return null;
		} else {

			Node del = this.first;
			this.first = this.first.next;
			this.first.prev = null;
			return del.val;

		}

	}

	public Integer pollFirst() {
		if (first == null) {
			return null;

		} else if (last == null) {
			return null;
		} else {

			Node del = this.first;
			return del.val;

		}

	}
	
	public static void main(String[] a) {
		DeQueImpl d = new DeQueImpl();
		d.addFirst(2);
		d.addFirst(1);
		d.addLast(3);
		
		System.out.println(d);
		
	}

}
