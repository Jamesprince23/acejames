package exercise;
import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int a=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				a=a+1;
			}
		}
		if(a==0) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not prime");
		}
	}

}
