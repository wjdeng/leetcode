package com.technology.test;


/*
 * ��һ��������������ֱ����������2���ڵ�֮���ж������ߣ��������������
 * ˼·�� �ݹ�ķ����������ڵ㿪ʼ����������������������ֱ������ӣ���������ڵ�����ֱ����
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
