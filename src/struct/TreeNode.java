package struct;

public class TreeNode {
	Object data;
	TreeNode left;
	TreeNode right;
	
	public TreeNode build(TreeNode tr1,Object data, TreeNode tr2) {
		TreeNode temp= new TreeNode();
		temp.data=data;
		temp.left=tr1;
		temp.right=tr2;
		return temp;
	}
	
	public void inorder(TreeNode root) {
		if(root != null) {
			inorder(root.left);
			System.out.print(root.data);
			inorder(root.right);
		}
	}
}
