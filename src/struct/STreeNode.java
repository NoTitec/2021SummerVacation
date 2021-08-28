package struct;

public class STreeNode {
	int data;
	STreeNode llink,rlink;
	
	STreeNode(int in){
		data=in;
		llink=rlink=null;
	}
	/*void serchaddlocationandaddnewnode(STreeNode p,int x) {
		STreeNode temp=null;//저장위치나타낼임시노드생성(최초노드면 temp는 그냥 null이다)
		
		while(p!=null) {//참조변수 p에 최초루트노드받아온게 null이 아닐경우 temp가 신규노드붙일노드가르키게찾음
			temp=p;//임시노드에 p노드받아옴
			if(x<p.data)//데이터가 p노드데이터보다작으면 p를 p가 가르키는 왼쪽노드로변경 
				p=p.llink;
			else //데이터가 p노드데이터보다크면 p를 p가 가르키는 오른쪽노드로변경
				p=p.rlink;
		}//모든과정끝나면 노드 temp는 받아온노드를 붙일 마지막위치노드정보를 가르킴!!!
		
		STreeNode n=new STreeNode();//신규노드생성
		n.data=x;
		n.llink=n.rlink=null;
		
		if(temp!=null) {//temp가 null이 아닐경우 데이터가 temp데이터보다 작으면 신규노드n은 temp의 왼쪽노드에 붙이고
			if(x<temp.data) {
				temp.llink=n;
			}
			else if(x>temp.data) {//클경우 temp의 오른쪽 노드에 n을 붙인다
				temp.rlink=n;
			}
		}
		else//temp가 null일 경우 이는 최초노드로 root노드에 만든 n노드정보를 가르키게함
			root=n;
	}
	
	void inorder(STreeNode p){
		if(p!=null) {
			inorder(p.llink);
			System.out.println(p.data);
			inorder(p.rlink);
		}
	}*/
}
