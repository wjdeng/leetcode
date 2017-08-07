package com.technology.test;

/*
 * ���⣺��һ���Ѿ��ź�������飬ת��Ϊһ���߶�ƽ��� ����������
 * 
 * ˼·��BST�Ĳ��뷽��
 * ��ȷ�ⷨ����ʵBST�Ĳ��뷽����Ȼ���Ա�֤��һ�����������������ǲ��������߶�ƽ�⣬��˲��������⡣
 * 			��ȷ�ⷨ�ǣ������ڶ��ַ����ҵ�������м�ڵ㣬��Ϊ2�Σ������������������м�ڵ�Ϊ����㣬�ݹ顣
 * 
 */
public class F_Convert_Sorted_Array_to_Binary_Search_Tree_108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]nums = {0,1,2,3,4,5};
		Solution_108 sl = new Solution_108();
		sl.firstBL(sl.sortedArrayToBST(nums));
	}

}
class Solution_108{
	
	TreeNode root;

	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	public TreeNode sortedArrayToBST2(int[] nums) {
		
		if(nums==null || nums.length==0)return null;
		return	helper(nums, 0, nums.length-1);
	
	}
	public TreeNode helper(int[]nums,int begin,int end){
		
		if(begin>end)return null;
		int mid = (end + begin)/2;
		TreeNode node = new TreeNode(nums[mid]);
		node.left=helper(nums, 0, nums[mid-1]);
		node.right=helper(nums, mid+1, end);
		return node;
	}
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums==null || nums.length==0)return null;
    	root = new TreeNode(nums[nums.length/2]);
    	for(int i=0;i<nums.length;i++){
    		if(i==nums.length/2)continue;
    		insert(nums[i]);
    	}
    	return root;
    }
    public boolean insert(int data){
    	TreeNode current = root;
    	TreeNode parent = null;
    	while(current!=null){
    		parent=current;
    		if(data<current.val){
    			
    			current = current.left;
    			if(current==null){
    				parent.left = new TreeNode(data);
    			}
    			
    		}else if(data>current.val){
    			
    			current = current.right;
    			if(current==null){
    				parent.right = new TreeNode(data);
    			}
    		}else{
    			return false;
    		}
    	}
    	return true;
    }
    public void midBL(TreeNode root){
    	if(root ==null)return;
    	midBL(root.left);
    	System.out.println(root.val);
    	midBL(root.right);
    }
    public void firstBL(TreeNode root){
    	if(root==null)return;
    	System.out.println(root.val);
    	firstBL(root.left);
    	firstBL(root.right);
    }
}