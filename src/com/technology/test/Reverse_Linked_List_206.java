package com.technology.test;

public class Reverse_Linked_List_206 {

	public static void main(String []args){
		
		
	}
}
class Solution_206{
	public ListNode reverseList(ListNode head){
		if(head==null || head.next==null)return head;
		ListNode temp = new ListNode(-1);
		ListNode first = head;
		ListNode second = head.next;
		temp.next = head;
		while(second!=null){
			first.next=second.next;
			second.next=temp.next;
			temp.next=second;
			second=first.next;
			
		}
		return temp.next;
		
		
		
		
	}
	
	class ListNode{
		
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
		}
	}
	
}
