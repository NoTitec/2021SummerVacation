package week3work;

public class PrintDiamond implements Runselectnumber{
int a;
Input in=new Input();
public void run() {
	while(true) {
		a=in.getIntinput();
		if(a%2==1) {
			break;
		}
	}
	for(int i = a / 2; i >= 0; i--) {// �Է¼�/2���� 0�ɶ������ݺ�
		for(int k = 0; k < i; k++)//k��0���� i���� �������
			System.out.print(" ");
		for(int j = 0; j < a - (i * 2); j++)//j�� 0���� �Է¼�-(i*2)���� �ݺ� *���
			System.out.print("*");
		System.out.println();
	}
	
	for(int i=1;i<=a/2;i++) {
		for(int k=0;k<i;k++) {
			System.out.print(" ");
		}
		for(int j=0;j<a-(i*2);j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
