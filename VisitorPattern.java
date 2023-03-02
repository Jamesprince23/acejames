package exercise4;

import java.util.Scanner;

public class VisitorPattern {
	public static void main(String[] args) throws BikesException {
		Human human = new Human();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the item:");
		String item = scanner.next();
		Bikes Bikes = new Bikes();
		human.rideOnRoad(Bikes, item);
		scanner.close();
	}
}

class Human {
	public void rideOnRoad(Bikes Bikes, String item) {
		try {
			Bikes.ride(item);
		} catch (BikesException be) {
			System.out.println(be);
			be.visit();
		}
	}
}

class Bikes {
	public void ride(String item) throws BikesException {
		if (item.equals("Brake")) {
			throw new BikesBrakeException("Apply Brake, else danger");
		} else if (item.equals("wheel")) {
			throw new BikesWheelException("Fill air before going out");
		} else if (item.equals("petrol")) {
			throw new BikesPetrolException("It's full can enjoy");
		}
	}
}

abstract class Map {
	public abstract void handle(BikesBrakeException bikesBrakeException);

	public abstract void handle(BikesWheelException bikesWheelException);

	public abstract void handle(BikesPetrolException bikesPetrolException);
}

class Phone extends Map {
	@Override
	public void handle(BikesBrakeException bikesBrakeException) {
		System.out.println("Brakes are very important");
	}

	@Override
	public void handle(BikesWheelException bikesWheelException) {
		System.out.println("Take the Bikes to the nearby bunk");
	}

	@Override
	public void handle(BikesPetrolException bikesPetrolException) {
		System.out.println("Have fun, be careful");
	}
}

abstract class BikesException extends Exception {
	public abstract void visit();
}

class BikesBrakeException extends BikesException {
	String msg;

	public BikesBrakeException(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return msg;
	}

	@Override
	public void visit() {
		Map map = new Phone();
		map.handle(this);
	}
}

class BikesWheelException extends BikesException {
	String msg;

	public BikesWheelException(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return msg;
	}

	@Override
	public void visit() {
		Map map = new Phone();
		map.handle(this);
	}
}

class BikesPetrolException extends BikesException {
	String msg;

	public BikesPetrolException(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return msg;
	}

	@Override
	public void visit() {
		Map map = new Phone();
		map.handle(this);
	}
}