package week5;

import java.text.DecimalFormat;

public class Sgrademodul implements Runselectnumber {
private Input inp;
	public Sgrademodul(Input in) {
		// TODO Auto-generated constructor stub
		inp=in;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		DecimalFormat df2 = new DecimalFormat(".##");

		Stud st[] = new Stud[4];
		st[0] = new Stud("Betty", 65.0, 98.0, 80.0);
		st[1] = new Stud("John", 98.0, 89.0, 72.0);
		st[2] = new Stud("Billy", 78.0, 76.0, 92.0);
		st[3] = new Stud("Helen", 98.0, 77.0, 91.0);
		for (int i = 0; i < 4; i++)
			System.out.println(st[i].getName() + " " + df2.format(st[i].getAverage()));
	}

}

class Stud{
	Stud(String a,double b,double c,double d){
		name=a;
		l=b;
		m=c;
		e=d;
	}
	public Object getAverage() {
		// TODO Auto-generated method stub
		return (l+m+e)/3;
	}
	String getName() {
		// TODO Auto-generated method stub
		
		return this.name;
	}
	String name;
	double l;
	double m;
	double e;
}
