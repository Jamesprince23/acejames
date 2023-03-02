package exercise4;

public class Singleton {
	public static void main(String[] args) {
		Computer singleComputer = Computer.getInstance();
		Computer object2 = singleComputer;
	}
}

class Computer {
	static Computer object = new Computer();

	private Computer() {

	}

	public static Computer getInstance() {
		return object;
	}
}
