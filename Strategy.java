package exercise4;

public class Strategy {
	public static void main(String[] args) {
		Paint paint = new BluePaint();
		paint.colour();
	}
}

abstract class Paint {
	public abstract void colour();
}

class RedPaint extends Paint {
	@Override
	public void colour() {
		System.out.println("red colour...");
	}
}

class BluePaint extends Paint {
	@Override
	public void colour() {
		System.out.println("blue colour...");
	}
}

class GreenPaint extends Paint {
	@Override
	public void colour() {
		System.out.println("green colour..");
	}
}
