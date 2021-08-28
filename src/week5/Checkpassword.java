package week5;

public class Checkpassword implements Runselectnumber {
private Input inp;
	public Checkpassword(Input in) {
		// TODO Auto-generated constructor stub
		inp=in;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.print("1. 8���� �̻��Դϴ�.\n" 
				+ "2. �����ڿ� ���ڸ� ��� �����մϴ�. \n" 
				+ "3. ���ڴ� 2�� �̻��̾�� �մϴ�.\n"
				+ "���� �н����� ��Ģ�� ���� ���ϴ� �н����带 �Է��Ͻÿ�: ");
		String s = inp.getStringnextinput();
		if (is_Valid_Password(s)) {
			System.out.println("������ �н������Դϴ�: " + s);
		} else {
			System.out.println("�н����� ��Ģ�� ��߳��ϴ�: " + s);
		}
	}

	private boolean is_Valid_Password(String s) {
		// TODO Auto-generated method stub
		if(s.length()<8)
			return false;
		int nc=0;
		
		for (int i = 0; i < s.length(); i++) {
			char c=s.toUpperCase().charAt(i);
			
			if(c>='0'&& c<='9')
			{
				nc++;
			}
			else if(c>='A'&&c<='Z') {
				continue;
			}
			else return false;
		}
		return (nc>=2);
	}

}
