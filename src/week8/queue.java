package week8;

public class queue extends MakeInputobject implements Csnum {
	public static final int leng = 10;
	private char[] qu;
	private int count=0;
	public queue() {
		// TODO Auto-generated constructor stub
		qu=new char[leng];
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while (true) {
			System.out.println("1. insert, 2.delete,3.print,4.exit");
			char in = inp.getStringinput().charAt(0);
			if(in=='4')
				break;
			switch (in) {
			case '1':
				insert();
				break;
			case '2':
				delete();
				break;
			case '3':
				print();
				break;
			}
		}
	}

	private void print() {
		// TODO Auto-generated method stub
		for (char c : qu) {
			System.out.print(c);
		}
	}

	private void insert() {
		// TODO Auto-generated method stub
		if(count<leng) {
			char in=inp.getStringinput().charAt(0);
			qu[count]=in;
			count++;
		}
	}
	private void delete() {
		if(count>0) {
			char f=qu[0];
			System.out.println(f);
			for (int i = 0; i < count; i++) {
				qu[i]=qu[i+1];
			}
			count--;
		}
	}
}
