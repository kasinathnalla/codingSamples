package com;

public class AddTwoNumbers {
	
	//Definition for singly-linked list.
	public static class ListNode {
	    int val;
	    ListNode next;
	    ListNode() {}
	    ListNode(int val) { this.val = val; }
	    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	 
	 public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		 
		 int carryOver =0;
		 ListNode rn = new ListNode();
		 ListNode trn = rn;
		 while(l1!=null || l2!=null) {
			 
			 trn.val = getVal(l1) + getVal(l2)+trn.val;
			 System.out.println(trn.val);
			 if(l1!=null) {
			   l1 = l1.next;
			 }
			 if(l2!=null) {
			     l2 = l2.next;
			 }
		     trn.next = new ListNode();
		     trn.next.val = trn.val/10;
		     trn.val = trn.val%10;
		     trn = trn.next;
		     
		 }
		 System.out.println();
		 return rn;
	       
	 }
	 public static int getVal(ListNode l) {
		 if(l==null) {
			 return 0;
		 }
		 return l.val;
	 }
	 public static void main(String[] a) {
		
		 
		 ListNode firstOne = new ListNode(2, new ListNode(4, new ListNode(3)));
		 ListNode secondOne = new ListNode(9, new ListNode(2));
		 addTwoNumbers(firstOne, secondOne);
				 
	 }
}
