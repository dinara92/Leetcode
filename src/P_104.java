//Definition for a binary tree node.
class TreeNode {
	  int val;
	  TreeNode left;
	  TreeNode right;
	  TreeNode(int x) 
	  	{ val = x; }
 }
 
 
public class P_104 {
	
	int countDepthLeft = 1;
	int countDepthRight = 1;
	int countDepth = 0;
	
	public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        //System.out.println(root.left.val);
        //System.out.println(root.right.val);

        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
	
    /*public int maxDepth(TreeNode root) {

        if(root == null)
            return countDepth;    	
    	
	    	if(root.left!=null) {
	    			countDepthLeft+=1;
	    			System.out.println(root.left.val);
	            System.out.println("Left : " + countDepthLeft);	
	            maxDepth(root.left);
	    	}
	    	if(root.right!=null) {
				countDepthRight+=1;
				System.out.println(root.right.val);
	            System.out.println("Right : " + countDepthRight);
	    			maxDepth(root.right);
	    	}	    		
	    	
	    	if(countDepthLeft>=countDepthRight)
	    		countDepth = countDepthLeft;
	    	else
	    		countDepth = countDepthRight;
    
		return countDepth;
        
    }*/
    
    public static void main(String[] args) {
    		TreeNode r = new TreeNode(3);
    		r.left = new TreeNode(9);
    		r.right = new TreeNode(20);
    		r.right.left = new TreeNode(15);
    		r.right.right = new TreeNode(7);
    		
    		P_104 inst = new P_104();
    		int out = inst.maxDepth(r);
    		System.out.println(out);
    	
    }
}