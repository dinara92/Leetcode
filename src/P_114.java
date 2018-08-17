public class P_114 {
	

	
public void flatten(TreeNode root) {
        
	if(root!=null) {
		System.out.println(root.left.val);
		System.out.println(root.right.val);

		root.right = root.left;
		root.left = null;

		flatten(root.left);
		flatten(root.right);
	}	
    }


public static void main(String[] args) {
	TreeNode r = new TreeNode(1);
	r.left = new TreeNode(2);
	r.right = new TreeNode(5);
	r.left.left = new TreeNode(3);
	r.left.right = new TreeNode(4);
	r.right.right = new TreeNode(6);
	
	System.out.println("Inside!");
	P_114 inst = new P_114();
	inst.flatten(r);
	
}

}
