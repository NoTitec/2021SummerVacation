package week3work;

import java.util.Scanner;

public class Oddsumresult implements Runselectnumber {
	private int a,b;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("input number 1");
		while (true) {
			try {
				 a = sc.nextInt();
				break;
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		System.out.println("input number 2");
		while (true) {
			try {
				 b = sc.nextInt();
				break;
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		int min,max;
		if(a>b) {
			max=a;
			min=b;
		}
		else {
			max=b;
			min=a;
		}
		int sum=0;
		System.out.print("odd number:");
		for (int i = min; i <=max; i++) {
			if(i%2==1) {
				System.out.print(i+" ");
				sum+=i;
			}
		}
		System.out.println();
		System.out.println("odd sum result:"+sum);
		
		
	}

}
