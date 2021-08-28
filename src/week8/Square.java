package week8;

public class Square extends MakeInputobject implements Csnum {
	double width;
	double heigh;
	public Square() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		go();
	}
	public void go() {
		width=inp.getdoubleinput();
		heigh=inp.getdoubleinput();
		System.out.println(width*heigh);
	}
}
