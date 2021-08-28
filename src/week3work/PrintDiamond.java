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
	for(int i = a / 2; i >= 0; i--) {// 입력수/2부터 0될때까지반복
		for(int k = 0; k < i; k++)//k가0에서 i까지 공백출력
			System.out.print(" ");
		for(int j = 0; j < a - (i * 2); j++)//j가 0에서 입력수-(i*2)까지 반복 *출력
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
