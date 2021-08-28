package week6work;

public class DigitRange  {

	public DigitRange() {
		// TODO Auto-generated constructor stub
	}
	public int run(int num) {
		// TODO Auto-generated method stub
		int large,small;
		int rem;
		large=small=0;
		
		if(num<0)num=-num;
		if(num<10)return num;
		
		rem=num%10;//1자리 숫자가져옴
		large=small=rem;
		while(num>0) {
			rem=num%10;
			if(rem<small)small=rem;
			if(rem>large)large=rem;
			num=num/10;
		}
		return large-small+1;
	}

	
}
