package exercise;
import java.util.Scanner;

public class average {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		sc.close();
		subaverage a = new subaverage();
		a.calculate(n);
		
		
	}
}
class subaverage{
	public void calculate(int z) {
		int y=0;
		int s=0;
		double x;
		for (int i=1;i<=z;i++) {
			s=s+i;
			
		}
		x=s/(double)z;
		System.out.println(x);
		
		
	}
}

