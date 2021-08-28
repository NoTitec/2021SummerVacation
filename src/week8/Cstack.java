package week8;

public class Cstack {
public static final int STACKSIZE = 10;
	
	private char []stack = new char[STACKSIZE];
	int count = 0;
	
	public boolean Push(char ch) {
		if(count == STACKSIZE) return false;
		
		stack[count] = ch;
		count++;
		
		return true;
	}
	public char Pop() {
		if(count == 0) return 0;
	
		char ch = stack[count - 1];
		count--;
		
		return ch;
	}
	public void print() {
		for(int i = 0; i < count; i++)
			System.out.println("["+i+"]=1"+stack[i]);
	}
}
