package week6work;

public class Leapyear extends MakeInputobject implements Runselectnumber {

	public Leapyear() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int year;
		year = inp.getIntinput();

		if (year % 4 != 0) {
			System.out.println("not");
		} else {
			if (year % 100 != 0) {
				System.out.println("yes");
			} else {
				if (year % 400 != 0) {
					System.out.println("no");
				} else {
					System.out.println("yes");
				}
			}
		}

	}

}
