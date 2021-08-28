package struct;

public class UseTreeNode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseTreeNode2 T=new UseTreeNode2();
		TreeNode n;
		n=T.create();
		n.inorder(n);
		
	}
	
	TreeNode create() {
		TreeNode T= new TreeNode();
		
		TreeNode n5=T.build(null, 'B',null);
		TreeNode n4=T.build(null, 'C',null);
		TreeNode n3=T.build(null, 'A',null);
		TreeNode n2=T.build(n5, '/',n4);
		TreeNode n1=T.build(n3, '+',n2);
		
		n4=T.build(null, 'D', null);
		n3=T.build(null, 'E', null);
		n2=T.build(n4, '-', n3);
		TreeNode root= T.build(n1, '*', n2);
		return root;
	}
}
