package com.technology.test;

public class Binary_Search_Tree {

	
	public static void main(String args[]){
		BST bst = new BST();
		int []temp = {1,3,3,3,9,2,7,52,41,12,65,34,22,19};
		for(int i=0;i<temp.length;i++){
			bst.insert(temp[i]);
		}
		bst.midBL(bst.root);
		System.out.println();
		TreeNode a = bst.findNode(bst.root, 19);
		if(a==null){
			System.out.println("Not find the TreeNode...");
		}else{
			System.out.println("Find the TreeNode: "+a.data);
		}
		bst.deleteNode(bst.root, 7);
		bst.midBL(bst.root);
	}

}
class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	public TreeNode(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
	
	
}
class BST{
	
	TreeNode root;
	public BST(){
		root = null;
	}
	
	public boolean insert(int data){
		TreeNode newNode = new TreeNode(data);//先定义这个新的结点
		if(root == null){		//若根结点为空，则根结点就是这个新的结点
			root=newNode;
		}
		TreeNode current = root;
		TreeNode parent;
		while(true){				
			parent = current;
			if(data<current.data){
				current = current.left;
				if(current==null){
					parent.left=newNode;
					return true;
				}
			}else if(data>current.data){
				current = current.right;
				if(current==null){
					parent.right=newNode;
					return true;
				}
			}else{
				return false;
			}
		}
		
		
	}
	
	public boolean deleteNode(TreeNode root,int data){
		if(root==null) return false;
		TreeNode current = root;
		TreeNode parentNode = null;
		while(current!=null){
			if(data<current.data){
				parentNode=current;
				current = current.left;
			}else if(data>current.data){
				parentNode=current;
				current=current.right;
			}else{
				break;
			}
		}
		if(current==null) return false;
		if(current.right==null){
			if(parentNode.left==current){
				parentNode.left=current.left;
			}else{
				parentNode.right=current.left;
			}
		}else if(current.left==null){
			if(parentNode.left==current){
				parentNode.left=current.right;
			}else{
				parentNode.right=current.right;
			}
		}else{
			
			TreeNode replaceParentNode = current;
			TreeNode replaceNode = current.left;
			
			if(replaceNode.right!=null){
				replaceParentNode=replaceNode;
				replaceNode=replaceNode.right;
				replaceParentNode.right = replaceNode.left;
			}else{
				replaceParentNode.left = replaceNode.left;
			}
			
//			if(replaceParentNode==current){
//				replaceParentNode.left = replaceNode.left;
//			}else{
//				replaceParentNode.right = replaceNode.left;
//			}
			
			current.data=replaceNode.data;
		}
		return true;
	}
	
	
	
	public TreeNode findNode(TreeNode root,int data){
		if(root ==null)return null;
		TreeNode current = root;
		while(current!=null){
			if(data<current.data){
				current = current.left;
				findNode(current,data);
			}else if(data>current.data){
				current = current.right;
				findNode(current,data);
			}else{
				return current;
			}
			
			
		}
		return null;	
	}
	
	
	
	public void midBL(TreeNode root){
		if(root ==null)return;
		midBL(root.left);
		System.out.print(root.data+" ");
		midBL(root.right);
	}
	public void firstBL(TreeNode root){
		if(root == null) return;
		System.out.print(root.data+" ");
		firstBL(root.left);
		firstBL(root.right);
	}
	public void afterBL(TreeNode root){
		
		if(root == null)return;
		afterBL(root.left);
		afterBL(root.right);
		System.out.print(root.data+" ");
	}
	
	
	
}
