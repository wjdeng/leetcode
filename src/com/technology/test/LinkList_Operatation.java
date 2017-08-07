package com.technology.test;

import java.util.Stack;

/*
 * 
 * 1��������Ĵ����ͱ���
����2���������нڵ�ĸ���
����3�����ҵ������еĵ�����k����㣨��ָoffer����15��
����4�����ҵ������е��м���
����5���ϲ���������ĵ������ϲ�֮���������Ȼ���򡾳���Ƶ�ʸߡ�����ָoffer����17��
����6��������ķ�ת������Ƶ����ߡ�����ָoffer����16��
����7����β��ͷ��ӡ��������ָoffer����5��
����8���жϵ������Ƿ��л�
����9��ȡ���л������У����ĳ���
����10���������У�ȡ��������ʼ�㣨��ָoffer����56������������������ĵ�8��͵�9�⡣
����11���ж������������ཻ�ĵ�һ�����㣨��ָoffer����37�����ַ���
 * 
 * 
 * 
 */
public class LinkList_Operatation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		Node jiaodian=null;
		for(int i=1;i<=10;i++){
			l1.addNode(i);
			if(i==6){
				jiaodian = l1.current;
			}
		}
		for(int i=2;i<=5;i++){
			l2.addNode(i);
		}
		l2.addNode(jiaodian);
		
		Node commonNode = l1.searchFirstCommonNode(l1.head, l2.head);
		System.out.println(commonNode.data);
//		LinkedList link = new LinkedList();
//		for(int i=1;i<=9;i++){
//			link.addNode(i);
//		}
//		link.current.next=link.head.next;
//		link.printNode(link.head);
//		System.out.println(link.isCycle2(link.head));
//		Node a = link.isCycle2(link.head);
//		System.out.println(link.sumCycleSize(a));
//		System.out.println(link.searchCycleFirstNode(link.head, link.sumCycleSize(a)).data);
//		System.out.println(link.searchCycleFirstNode(link.head,6).data);
//		link.printNode(link.reverseLinkedList(link.head));
//		link.printLinkFromLast(link.head);
//		System.out.println("The size of LinkedList is: "+link.sumSize(link.head));
//		
//		Node a = link.searchNode(0);
//		if(a==null){
//			System.out.println("You want to search Node isn't exist...");
//		}else{
//			System.out.println(a.data);
//		}
//		
//		System.out.println(link.searchMidNode(link.head).data);
		
		
//		LinkedList l1 = new LinkedList();
//		LinkedList l2 = new LinkedList();
//		for(int i=1;i<=10;i++){
//			if(i%2==0){
//				l2.addNode(i);
//			}else{
//				l1.addNode(i);
//			}
//		}
//		Node head = l1.mergeTwoLinkedList(l1.head, l2.head);
//		l1.printNode(head);
	}

}


class LinkedList{
	Node head;
	Node current;
	public LinkedList(){
		head=null;
	}
	public boolean addNode(Node node){
		if(head==null){
			head=node;
			current=head;
		}else{
			current.next=node;
			current=current.next;
		}
		return true;
	}
	public boolean addNode(int data){   //�����ڵ�һ������µĽڵ�
		Node newNode = new Node(data);
		
		if(head==null){
			head = newNode;
			current=head;
		}else{
			current.next=newNode;
			current=current.next;
		}
		return true;
	}
	public void printNode(Node head){
		if(head==null)return;
		Node current = head;
		while(current!=null){
			System.out.println(current.data);
			current=current.next;
		}
	}
	
	public int sumSize(Node head){
		if(head==null)return 0;
		Node current = head;
		int result = 0;
		while(current!=null){
			result++;
			current=current.next;
		}
		return result;
	}
	public Node searchNode(int k){
		if(head==null || k==0)return null;
		Node left=head;
		Node right=head;
		for(int i=0;i<k-1;i++){
			if(right.next!=null){
				right=right.next;
			}else{
				return null;
			}
		}
		while(right.next!=null){
			left=left.next;
			right=right.next;
		}
		return left;
	}
	
	public Node searchMidNode(Node head){
	
		if(head==null) return null;
		Node left = head;
		Node right = head;
		while(right!=null&&right.next!=null){  //�ر�ע�⣬���û��right.next!=null �����left=left.nextִ��
			left=left.next;						//�Ӷ����·��ص�leftֵΪ��
			right=right.next.next;
		}
		return left;
	}
	
	public Node mergeTwoLinkedList(Node head1,Node head2){
		if(head1==null && head2 ==null)return null;
		if(head1==null)return head2;
		if(head2==null)return head1;
		Node head,current;
		if(head1.data>head2.data){
			head=head2;
			current=head2;
			head2=head2.next;
		}else{
			head=head1;
			current=head1;
			head1=head1.next;
		}
		while(head1!=null && head2!=null){
			
			if(head1.data>head2.data){
				current.next=head2;
				head2=head2.next;
				current=current.next;
			}else{
				current.next=head1;
				head1=head1.next;
				current=current.next;
			}
		}
		if(head1==null){
			current.next=head2;
		}
		if(head2==null){
			current.next=head1;
		}
		return head;
		
		
	}
	public Node reverseLinkedList(Node head){
		if(head==null || head.next==null)return head;
		Node dummy = new Node(-1);
		dummy.next=head;
		Node first = head;
		Node second = first.next;
		while(second!=null){
			first.next=second.next;
			second.next=dummy.next;
			dummy.next=second;
			second=first.next;		
			
		}
		return dummy.next;
	
	}
	public void printLinkFromLast(Node head){
		if(head==null) return;
		Node current=head;
		Stack<Integer> s = new Stack<Integer>();
		while(current!=null){
			s.push(current.data);
			current=current.next;
		}
		while(!s.isEmpty()){
			System.out.println(s.pop());
		}	
	}
	public void printLinkFromLast2(Node head){
		if(head==null)return;
		printLinkFromLast2(head.next);
		System.out.println(head.data);
	}
	public boolean isCycle(Node head){
		if(head==null) return false;
		Node current=head;
		while(current!=null){
			current=current.next;
			if(current==head){
				return true;
			}
		}
		return false;
		
		
	}
	public Node isCycle2(Node head){
		if(head==null) return null;
		Node first=head;
		Node second=head;
		while(second!=null && second.next!=null){
			first=first.next;
			second=second.next.next;
			if(first==second){
				return first;
			}
		}
		return null;		
	}
	public int sumCycleSize(Node head){
		if(head==null) return 0;
		Node first=head;
		Node second=head;
		int result=0;
		while(second!=null){
			second=second.next;
			result++;
			if(first==second){
				return result;
			}
			
		}
		return result;
		
	}
	public Node searchCycleFirstNode(Node head,int cycleLength){
		
		if(head==null)return null;
		Node first=head;
		Node second=head;
		for(int i=0;i<cycleLength;i++){
			second=second.next;
		}
		while(first!=null && second!=null){
			first=first.next;
			second=second.next;
			if(first==second){
				return first;
			}
		}
		return null;
		
	}
	public Node searchFirstCommonNode(Node head1,Node head2){
		if(head1==null || head2==null)return null;
		int length1 = sumSize(head1);
		int length2 = sumSize(head2);
		Node longhead;
		Node shorthead;
		int gap=0;
		if(length1>length2){
			gap = length1-length2;
			longhead = head1;
			shorthead=head2;
		}else{
			gap = length2-length1;
			longhead=head2;
			shorthead=head1;
		}
		for(int i=0;i<gap;i++){
			longhead = longhead.next;
		}
		
		while(longhead!=null && shorthead!=null){
			if(longhead==shorthead){
				return longhead;
			}
			longhead=longhead.next;
			shorthead=shorthead.next;
		}
		return null;
		
		
		
	}
	
}
class Node{
	int data;
	Node next;
	public Node(int data){
		this.data=data;
		this.next=null;
	}
}