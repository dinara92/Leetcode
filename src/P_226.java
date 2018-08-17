class P_226 {
    public TreeNode invertTree(TreeNode root) {
        
        if(root == null)
            return root;
        
        //both Pre-Order and Post-Order Traversal are ok
        
        invertTree(root.left);
        invertTree(root.right);
        
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        return root;
    }
}