package week3work;

import java.util.Scanner;

public class Squreprint implements Runselectnumber{
	int a;
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Shape Size");
		while(true) {
			a=sc.nextInt();
			if(a==-1) {
				break;
			}
			for (int i = 0; i < a; i++) {
				for(int j=0;j<a;j++) {
					if(i==0||i==a-1) {
						System.out.print("*");
					}
					else {
						if(j==0||j==a-1) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
				}
				System.out.println();
			}
		}
		sc.close();
	}
	
}
