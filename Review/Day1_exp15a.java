package review;

public class Day1_exp15a {
	public static void main(String[] args) {
		for(int i=2; i<=100; i++)
			primeOrNot(i);
	}
	
	public static void primeOrNot(int n) {
		boolean t = false;
		for(int i = 2; i <= n/2; ++i) {
			if(n%i == 0) {
				t = true;
				break;
			}
		}
		if(!t)
			System.out.print(" "+n);
	}

}
