package struct;

public class UseSearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarysearchTree bt=new BinarysearchTree();
		int x[] = {35,12,24,45,37,48,67};
		for(int i=0;i<x.length;i++) {
			bt.insertNode(x[i]);
		}
		bt.inorder(bt.rootNode);
	}
	
	
}
