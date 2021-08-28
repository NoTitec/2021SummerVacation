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
		System.out.println("ã���̸��Է�");
		String f=inp.getStringinput();
		
		for (Student student : stuset) {
			if(student.getname().equals(f)) {
				System.out.println(student.getbasicinfo());
			}
		}
	}
	private void del() {
		System.out.println("�������̸��Է�");
		String d=inp.getStringinput();
		
		for(Student s: stuset) {
			if(s.getname().equals(d)) {
				if(stuset.remove(s)==true) {
					break;//������ ������ ������ϸ� concurrent���� �߻�
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
			System.out.print("���"+t.getstuavg());
			System.out.print(t.getgrade());
			System.out.println();
			
			
		}
	}

	public boolean addstu() {
		String a;
		System.out.println("�̸� �Է�");
		a=inp.getStringinput();
		if(a.equals("����")) {
			return false;
		}
		Student t=new Student();
		t.setstudentinfo(a);
		stuset.add(t);
		return true;
	}
}
