package week4work;

import java.util.Scanner;

public class Mainmenu {
	Runselectnumber currentnumber = null;
	Input t = new Input();

	public void main() {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		String doagain = "n";
		while (true) {
			while (true) {
				System.out.println("select number");

				try {
					number = sc.nextInt();
					break;
				} catch (Exception e) {
					System.out.println("input not number");
					e.printStackTrace();// TODO: handle exception
					sc = new Scanner(System.in);
				}
			}
			
			
			switch (number) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				currentnumber = createnumber(number);
				currentnumber.run();
				currentnumber = null;
				break;
			default:
				System.out.println("no exist number");
			}
			System.out.println("do another problum? if you don't input n or N on keyboard");
			doagain = sc.next();
			if (doagain.equalsIgnoreCase("n")) {
				break;
			}
		}
		sc.close();
	}

	private Runselectnumber createnumber(int type) {
		Runselectnumber temp = null;
		Input in = new Input();
		switch (type) {
		case 1:
			temp = new Addtwonumber(in);
			break;
		case 2:
			temp = new Factorial(in);
			break;
		case 3:
			temp = new Dividwithout³ª´©±â(in);
			break;
		case 4:
			temp = new XYdistance(in);
			break;
		case 5:
			temp = new UpandDown(in);
			break;
		case 6:
			temp= new GetabswithoutMath(in);
			break;
		case 7:
			temp= new Checkisprime(in);
			break;
		case 8:
			temp= new Addallprimenumber(in);
			break;
		case 9:
			temp= new Fibonach(in);
			break;
		case 10:
			temp= new Sortdata(in);
			break;
		}
		return temp;
	}
}
