package exercise4;

public class FactoryMethod {
	public static void main(String[] args) {
		BikeFactory factory = new BikeFactory();
		Bike obj = factory.getInstance("Vintage");
		obj.spec();
	}
}

interface Bike {
	void spec();
}

class Splender implements Bike {
	public void spec() {

		System.out.println("Widely used Bike");
	}
}

class Bullet implements Bike {
	public void spec() {
		System.out.println("Vintage Bike");
	}

}

class Jawa implements Bike {
	public void spec() {
		System.out.println("Oldest Bike");
	}

}

class BikeFactory {
	public Bike getInstance(String str) {
		if (str.equals("Affordable"))
		{
			return new Splender();
		}
		else if (str.equals("Vintage"))
		{
			return new Bullet();
		}
		else
		{	
		
			return new Jawa();
		}
	}
}
