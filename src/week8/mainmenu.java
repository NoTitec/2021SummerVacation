package week8;

public class mainmenu extends MakeInputobject {
	Csnum cs = null;

	public mainmenu() {
		// TODO Auto-generated constructor stub
	}

	void gomain() {
		int a = 0;
		System.out.println("input problum number 1. calhe*wid 2. stugrade");
		a=inp.getIntinput();
		cs = createCsnum(a);
		cs.run();
	}

	Csnum createCsnum(int a) {
		 switch(a) {
		 case 1:
		 String in=inp.getStringinput();
		 System.out.println("current object is"+in);
		 switch(in) {
		 case "R":
			 cs=new Square();
			return cs;
		 case "T":
			 cs= new triangle();
			 return cs;
		 case "C":
			 cs= new circle();
			 return cs;
			 
			default:
				return null;
		 }
		 
		 case 2:
			 cs=new stuobject();
			 return cs;
			 
			 default:
				 return null;
		 }
	 }
}
