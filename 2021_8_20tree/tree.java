import java.util.*;

/*
 * public class TreeNode {
 *   int val = 0;
 *   TreeNode left = null;
 *   TreeNode right = null;
 * }
 */

public class Solution {
    /**
     * 
     * @param root TreeNode类 the root of binary tree
     * @return int整型二维数组
     */
    List<List<Integer>> list = new ArrayList<>();
    public int[][] threeOrders (TreeNode root) {
        // write code here
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        preOrder(root,list1);
        inOrder(root,list2);
        postOrder(root,list3);
        int size = list1.size();
        int [][] nums = new int [3][size];
        for(int i = 0; i < list1.size(); i++){
            nums[0][i] = list1.get(i);
        }
        for(int i = 0; i < list2.size(); i++){
            nums[1][i] = list2.get(i);
        }
        for(int i = 0; i < list3.size(); i++){
            nums[2][i] = list3.get(i);
        }
        return nums;
    }
    
    public void preOrder(TreeNode root,List<Integer> list1){
        if(root == null){
            return;
        }
        list1.add(root.val);
        preOrder(root.left,list1);
        preOrder(root.right,list1);
    }
    
    
    public void inOrder(TreeNode root,List<Integer> list2){
        if(root == null){
            return;
        }
        
        inOrder(root.left,list2);
        list2.add(root.val);
        inOrder(root.right,list2);
    }
    
     public void postOrder(TreeNode root,List<Integer> list3){
        if(root == null){
            return;
        }
        postOrder(root.left,list3);
        postOrder(root.right,list3);
        list3.add(root.val);
    }
}