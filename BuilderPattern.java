package exercise4;

public class BuilderPattern {
	public static void main(String[] args) {
		Car myCar = new Car.CarBuilder().setEngine("").setColor("red").setCc(5000).setFuelTankCapacity(30)
				.setTyre("JSW").build();
		System.out.println(myCar);

	}
}

class Car {
	class Parts {
		String engine, tyre, color;
		int cc, fuelTankCapacity;

		public Parts(String engine, String tyre, String color, int cc, int fuelTankCapacity) {
			super();
			this.engine = engine;
			this.tyre = tyre;
			this.color = color;
			this.cc = cc;
			this.fuelTankCapacity = fuelTankCapacity;
		}

		@Override
		public String toString() {
			return "Parts [engine=" + engine + ", tyre=" + tyre + ", color=" + color + ", cc=" + cc
					+ ", fuelTankCapacity=" + fuelTankCapacity + "]";
		}

	}

	Parts part;
	String brand;

	public Car(CarBuilder Car) {
		part = new Parts(Car.engine, Car.tyre, Car.color, Car.cc, Car.fuelTankCapacity);
		brand = "Honda";
	}

	@Override
	public String toString() {
		return "Car[b=" + part + ", brand=" + brand + "]";
	}

	static class CarBuilder {
		String engine, headlight, tyre, color;
		int cc, fuelTankCapacity;

		public CarBuilder setEngine(String engine) {
			this.engine = engine;
			return this;
		}

		public CarBuilder setTyre(String tyre) {
			this.tyre = tyre;
			return this;
		}

		public CarBuilder setColor(String color) {
			this.color = color;
			return this;
		}

		public CarBuilder setCc(int cc) {
			this.cc = cc;
			return this;
		}

		public CarBuilder setFuelTankCapacity(int fuelTankCapacity) {
			this.fuelTankCapacity = fuelTankCapacity;
			return this;
		}

		public Car build() {
			return new Car(this);
		}

	}

}
