package week6work;

public class Getmostfrequentlynumber {
	private int[]count=new int[101];
	private int max=-1;
	private int maxi=-1;
	public Getmostfrequentlynumber() {
		// TODO Auto-generated constructor stub
	}

	public int run(int a[]) {
		// TODO Auto-generated method stub
		for(int i=0;i<101;i++) {
			count[i]=0;
		}
		for(int i=0;i<a.length;i++) {
			count[a[i]]++;
		}
		for(int i=0;i<=100;i++) {
			if(count[i]==0)continue;
			if(count[i]>=max) {
				max=count[i];
				maxi=i;
			}
		}
		return maxi;
	}

}
