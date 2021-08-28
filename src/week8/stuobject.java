package week8;

import java.util.HashSet;
import java.util.Iterator;

public class stuobject extends MakeInputobject implements Csnum {
	HashSet<Student> stuset = new HashSet<Student>();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
		if (stuset.size() > 10) {
			System.out.println("studata storage full");
			printstu();
			break;
		} else {
			if(addstu()==false) {
				printstu();
				break;
			}
		}
		}
		findperson();
		del();
		printstu();
	}
	private void findperson() {
		// TODO Auto-generated method stub
		System.out.println("찾을이름입력");
		String f=inp.getStringinput();
		
		for (Student student : stuset) {
			if(student.getname().equals(f)) {
				System.out.println(student.getbasicinfo());
			}
		}
	}
	private void del() {
		System.out.println("삭제할이름입력");
		String d=inp.getStringinput();
		
		for(Student s: stuset) {
			if(s.getname().equals(d)) {
				if(stuset.remove(s)==true) {
					break;//삭제후 루프문 종료안하면 concurrent오류 발생
				}
			}
		}
	}
	private void printstu() {
		// TODO Auto-generated method stub
		Iterator<Student> s=stuset.iterator();
		while(s.hasNext()) {
			Student t=s.next();
			System.out.print(t.getbasicinfo());
			System.out.print("평균"+t.getstuavg());
			System.out.print(t.getgrade());
			System.out.println();
			
			
		}
	}

	public boolean addstu() {
		String a;
		System.out.println("이름 입력");
		a=inp.getStringinput();
		if(a.equals("종료")) {
			return false;
		}
		Student t=new Student();
		t.setstudentinfo(a);
		stuset.add(t);
		return true;
	}
}
