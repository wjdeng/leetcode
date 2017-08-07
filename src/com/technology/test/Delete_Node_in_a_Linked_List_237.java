package com.technology.test;

public class Delete_Node_in_a_Linked_List_237 {

	public static void main(String []args){
		
	}
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution_237 {

    
    public void deleteNode2(ListNode node){
    	
    	node.val=node.next.val;
    	node.next=node.next.next;
    }
    
    public class ListNode {
    	      int val;
    	      ListNode next;
    	      ListNode(int x) { val = x; }
    	 }
}