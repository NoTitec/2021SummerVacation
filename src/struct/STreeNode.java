package struct;

public class STreeNode {
	int data;
	STreeNode llink,rlink;
	
	STreeNode(int in){
		data=in;
		llink=rlink=null;
	}
	/*void serchaddlocationandaddnewnode(STreeNode p,int x) {
		STreeNode temp=null;//������ġ��Ÿ���ӽó�����(���ʳ��� temp�� �׳� null�̴�)
		
		while(p!=null) {//�������� p�� ���ʷ�Ʈ���޾ƿ°� null�� �ƴҰ�� temp�� �űԳ����ϳ�尡��Ű��ã��
			temp=p;//�ӽó�忡 p���޾ƿ�
			if(x<p.data)//�����Ͱ� p��嵥���ͺ��������� p�� p�� ����Ű�� ���ʳ��κ��� 
				p=p.llink;
			else //�����Ͱ� p��嵥���ͺ���ũ�� p�� p�� ����Ű�� �����ʳ��κ���
				p=p.rlink;
		}//������������ ��� temp�� �޾ƿ³�带 ���� ��������ġ��������� ����Ŵ!!!
		
		STreeNode n=new STreeNode();//�űԳ�����
		n.data=x;
		n.llink=n.rlink=null;
		
		if(temp!=null) {//temp�� null�� �ƴҰ�� �����Ͱ� temp�����ͺ��� ������ �űԳ��n�� temp�� ���ʳ�忡 ���̰�
			if(x<temp.data) {
				temp.llink=n;
			}
			else if(x>temp.data) {//Ŭ��� temp�� ������ ��忡 n�� ���δ�
				temp.rlink=n;
			}
		}
		else//temp�� null�� ��� �̴� ���ʳ��� root��忡 ���� n��������� ����Ű����
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
