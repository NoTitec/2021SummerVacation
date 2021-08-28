package week8;

public class circle extends MakeInputobject implements Csnum {
double half;
	public circle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		circle();
	}
	public void circle() {
		half=inp.getdoubleinput();
		System.out.println(half*half*3.14);
	}
}
