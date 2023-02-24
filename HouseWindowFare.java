package day2;
import java.util.Scanner;

public class HouseWindowFare {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of house and door");
	int doorn=sc.nextInt();
	int windown=sc.nextInt();
	House.house(doorn,windown);
}
}
class House{
	static void house(int doors,int window) {
	Door door=new Door();
	Window win=new Window();
int Total=door.cal(doors)+win.cal(window);
System.out.println("Total cost is "+Total);

	}
}
class Door{
	int cal(int doors) {
		int cost=1500;
		return cost*doors;
	}
}
class Window{
	int cal(int windows) {
		int cost=1000;
		return cost*windows;
	}
}