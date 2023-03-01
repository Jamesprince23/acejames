package exercise4;
public class Singleton {
public static void main(String[] args) {
	Computer single=Computer.getInstance();
	Computer obj2=single;
}
}
class Computer{
	static Computer obj=new Computer();
	private Computer() {
		
	}
	public static Computer getInstance() {
		return obj;
	}
}
