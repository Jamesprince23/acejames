package day4;

public class CheckDerviedClass {
	public static void main(String[] args) {
		Derived d=new Derived();
		
	}

}
class base{
	int num[]={1,2,3,4,5,6};
	base throws void Exception() {
		System.out.println("base class constructor");
		System.out.println(num[5]);
		
	}
}
class Derived extends base{
	Derived(){
		System.out.println("derived class constructor");
		try {
			base b=new base();
		}
		catch(Exception e)
		{
			System.out.println();
		}
	}
}
