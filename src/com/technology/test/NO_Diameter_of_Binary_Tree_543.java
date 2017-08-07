package com.technology.test;


/*
 * 求一个二叉树的最大的直径：就是求2个节点之间有多少条边，求出最大的那条边
 * 思路： 递归的方法，从主节点开始，算出左子树和右子树最大直径，相加，就是这个节点的最大直径。
 * 		 
 * 
 * 
 */
public class NO_Diameter_of_Binary_Tree_543 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution_543{
	int max =0;
	  public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		 }
    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return max;
    }
    
    public int maxDepth(TreeNode root){
    	
    	if(root==null){
    		return 0;
    	}
    	int left = maxDepth(root.left);
    	int right = maxDepth(root.right);
    	max = Math.max(max, left+right);
    	return 1+Math.max(left, right);
    }
}
