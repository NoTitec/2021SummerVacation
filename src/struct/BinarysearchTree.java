package struct;

public class BinarysearchTree {
	    STreeNode rootNode ;
	    BinarysearchTree(){
	    	rootNode=null;
	    }
	    /**
	     * ���ο� ��� ����
	     */
	    public void insertNode(int element) {

	        /*
	         * ��Ʈ�� �� ���, �� �ƹ� ��嵵 ���� ���
	         */
	        if (rootNode == null) {
	            rootNode = new STreeNode(element);// BinarysearcTree�� rootNode�� ������ ����
	        } else {
	            STreeNode parent = rootNode;
	            STreeNode currentNode;

	            while (true) {
	                currentNode = parent;

	                /*
	                 * ������ ��Ʈ���� ���� ���, �������� Ž���� �Ѵ�.
	                 */
	                if (parent.data > element) {
	                    parent = parent.llink;

	              
	                    if (parent == null) {//���� Ž���� �ش���ġ���� null�̸� parent���� �����ߴ� currentnode�� ���ʿ� ����带 �߰����� ��������
	                        currentNode.llink = new STreeNode(element);
	                        break;
	                    }
	                } else {
	                    /*
	                     * ������ ��Ʈ���� ū ���, ���������� Ž���� �Ѵ�.
	                     */
	                    parent = parent.rlink;

	                    /*
	                     * ������ �ڽ� ��尡 ����ִ� ���, �ش� ��ġ�� �߰��� ��带 �����Ѵ�.
	                     * ���� currenNode head�� ����Ű�� �ִ�.
	                     */
	                    if (parent == null) {
	                        currentNode.rlink = new STreeNode(element);
	                        break;
	                    }
	                }
	            }
	        }
	    }
	    
	    void inorder(STreeNode p) {
	    	
	    	if(p!=null) {
	    		inorder(p.llink);
	    		System.out.print(p.data+" ");
	    		inorder(p.rlink);
	    	}
	    }
}
