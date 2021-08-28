package week8;

public class Student extends MakeInputobject {
	String name;
	double ko;
	double en;
	double math;
	public Student() {
		// TODO Auto-generated constructor stub
		
	}
	
	void setstudentinfo(String name) {
		this.name=name;
		System.out.println("국어 영어 수학 점수 입력");
		ko=inp.getdoubleinput();
		en=inp.getdoubleinput();
		math=inp.getdoubleinput();
	}
	String getname() {
		return name;
	}
	String getbasicinfo() {
		String str="이름:"+name+"\t"+ko+"\t"+en+"\t"+math;
		return str;
	}
	double getstuavg() {
		double avg=(ko+en+math)/3;
		return avg;
	}
	String getgrade() {
		String g;
		if(getstuavg()>=90) {
			g="A";
		}
		else if(getstuavg()>=80) {
			g="B";
			
		}
		else if(getstuavg()>=70) {
			g="C";
		}
		else if(getstuavg()>=60) {
			g="D";
		}
		else {
			g="F";
		}
		return "성적"+g;
	}
}
