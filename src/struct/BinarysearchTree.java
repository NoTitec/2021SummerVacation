package struct;

public class BinarysearchTree {
	    STreeNode rootNode ;
	    BinarysearchTree(){
	    	rootNode=null;
	    }
	    /**
	     * 새로운 노드 삽입
	     */
	    public void insertNode(int element) {

	        /*
	         * 루트가 빈 경우, 즉 아무 노드도 없는 경우
	         */
	        if (rootNode == null) {
	            rootNode = new STreeNode(element);// BinarysearcTree의 rootNode를 생성후 종료
	        } else {
	            STreeNode parent = rootNode;
	            STreeNode currentNode;

	            while (true) {
	                currentNode = parent;

	                /*
	                 * 현재의 루트보다 작은 경우, 왼쪽으로 탐색을 한다.
	                 */
	                if (parent.data > element) {
	                    parent = parent.llink;

	              
	                    if (parent == null) {//왼쪽 탐색후 해당위치값이 null이면 parent정보 저장했던 currentnode의 왼쪽에 새노드를 추가한후 루프해제
	                        currentNode.llink = new STreeNode(element);
	                        break;
	                    }
	                } else {
	                    /*
	                     * 현재의 루트보다 큰 경우, 오른쪽으로 탐색을 한다.
	                     */
	                    parent = parent.rlink;

	                    /*
	                     * 오른쪽 자식 노드가 비어있는 경우, 해당 위치에 추가할 노드를 삽입한다.
	                     * 현재 currenNode head를 가리키고 있다.
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
