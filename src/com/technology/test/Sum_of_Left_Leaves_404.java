package com.technology.test;

public class Sum_of_Left_Leaves_404 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 class Solution_404 {
	 int result = 0;
	 public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	 
    public int sumOfLeftLeaves(TreeNode root) {

    	
    	
    	BianLi(root);
    	
    	
    	
    	
		return result;
        
    }
    public void BianLi(TreeNode root){
    	if(root==null){
    		return;
    	}
    	if(root.left!=null&&root.left.left==null&&root.left.right==null) result+=root.left.val; 
    	BianLi(root.left);
    	BianLi(root.right);
    	
    }
    
    public int sumOfLeftLeaves2(TreeNode root) {
    	// beat 84.8%
    	if(root==null) return 0;
    	if(root.left!=null&&root.left.left==null&&root.left.right==null) result+=root.left.val;
    	sumOfLeftLeaves2(root.left);
    	sumOfLeftLeaves2(root.right);
    	return result;
    	
    	
    	
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}