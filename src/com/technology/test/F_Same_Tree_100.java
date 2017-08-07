package com.technology.test;

import java.util.ArrayList;
import java.util.List;

public class F_Same_Tree_100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution_100{
	// The right way
	
	public boolean isSameTree2(TreeNode p,TreeNode q){
		if(p==null && q==null) return true;
		if(p==null || p==null) return false;
		if(p.val==q.val){
			return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		}
		return false;
		
	}
	
	
	
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
    	List<Integer> l1f = FirstBL(p);
    	List<Integer> l2f = FirstBL(q);
    	List<Integer> l1m = MidBL(p);
    	List<Integer> l2m = MidBL(q);
    	
    	if(l1f==l2f && l1m==l2m){
    		return true;
    	}
    	return false;
    }
    public List<Integer> FirstBL(TreeNode t){
        if(t==null) return null;
        List<Integer> l = new ArrayList<Integer>();
        l.add(t.val);
        FirstBL(t.left);
        FirstBL(t.right);
        return l;
        
    }
    public List<Integer> MidBL(TreeNode t){
    	if(t==null) return null;
        List<Integer> l = new ArrayList<Integer>();
        MidBL(t.left);
        l.add(t.val);
        MidBL(t.right);
        return l;
        
    }
}