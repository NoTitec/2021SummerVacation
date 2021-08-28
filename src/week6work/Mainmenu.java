package week6work;

import java.util.Scanner;

public class Mainmenu {
	Runselectnumber currentnumber = null;
	Input t = new Input();
	DigitRange D=new DigitRange();
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
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
			case 20:
			case 21:
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
		case 1:
			temp=new Int_to_binary();
			break;
		case 2:
			temp=new MakeDigitRangeobject(68437);
			break;
		case 3:
			temp=new Leapyear();
			break;
		case 4:
			int[]a = {27,15,15,11,27};
			temp= new MakeGetfreqnum(a);
			break;
		case 5:
			temp = new printSquare();
			break;
		case 6:
			temp = new showtwos();
			break;
		case 7:
			temp= new countXX();
			break;
		case 8:
			//temp= new Checkebnum(t);
			break;
		case 9:
			//temp= new Checkmininmax(t);
			break;
		case 10:
			//temp= new Notriple();
			break;
		case 11:
			//temp=new Getwordnum(t);
			break;
		case 12:
			//temp=new Print3String(t);
			break;
		case 13:
			//temp=new Getmiddlecharfromstring(t);
			break;
		case 14:
			//temp = new Checkpassword(t);
			break;
		case 15:
			//temp=new DeletesamewordfromStringArray(t);
			break;
		case 16:
			//temp=new Getwordnumandwordlength(t);
			break;
		case 17:
			//temp=new Stringtokenreverse(t);
			break;
		case 18:
			//temp=new Delfirst0string(t);
			break;
		case 19:
			//temp=new Delend0string(t);
			break;
		case 20:
			//temp=new Sgrademodul(t);
			break;
		case 21:
		}
		return temp;
	}
}
