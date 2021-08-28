package week3work;

import java.util.Scanner;

public class Mainmenu {
	Runselectnumber currentnumber = null;
	Input t=new Input();
	
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
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
			case 16:
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
		switch (type) {
		case 11:
			temp = new Oddsumresult();
			break;
		case 12:
			temp= new Squreprint();
			break;
		case 13:
			temp= new PrintDiamond();
		case 14:
			temp= new ThreeFiveMultipleCalculator();
		case 15:
			temp= new TimesTablePrint(t);
		case 16:
			temp= new Factorial(t);
		}
		return temp;
	}
}
